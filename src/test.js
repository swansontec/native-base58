const assert = require("assert");
var baseX = require("base-x");

const base58 = baseX(
  "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz"
);

const blank = [];
const allZeroes = [0, 0];
const leadingZeroes = [0, 0, 1, 0, 0];
const trailingZeroes = [172, 173, 16];
const address = [
  0, 98, 233, 7, 177, 92, 191, 39, 213, 66, 83, 153, 235, 246, 240, 251, 80,
  235, 184, 143, 24, 194, 155, 125, 147,
];

const ones = new Array(10);
for (let i = 0; i < ones.length; ++i) ones[i] = 0xff;

assert.equal(base58.encode(blank), "");
assert.equal(base58.encode(allZeroes), "11");
assert.equal(base58.encode(leadingZeroes), "11LUw");
assert.equal(base58.encode(trailingZeroes), "21111");
assert.equal(base58.encode(address), "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
assert.equal(base58.encode(ones), "FPBt6CHo3fovdL");
