import Foundation

@main
class Test {
  static func main() {
    let blank: [UInt8] = []
    let allZeroes: [UInt8] = [0, 0]
    let leadingZeroes: [UInt8] = [0, 0, 1, 0, 0]
    let trailingZeroes: [UInt8] = [172, 173, 16]
    let address: [UInt8] = [
      0,
      98,
      233,
      7,
      177,
      92,
      191,
      39,
      213,
      66,
      83,
      153,
      235,
      246,
      240,
      251,
      80,
      235,
      184,
      143,
      24,
      194,
      155,
      125,
      147,
    ]
    let ones: [UInt8] = Array(repeating: 0xff, count: 10)

    assertEqual(Base58.encode(blank), "")
    assertEqual(Base58.encode(allZeroes), "11")
    assertEqual(Base58.encode(leadingZeroes), "11LUw")
    assertEqual(Base58.encode(trailingZeroes), "21111")
    assertEqual(Base58.encode(address), "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa")
    assertEqual(Base58.encode(ones), "FPBt6CHo3fovdL")

    print("Done")
  }

  private static func assertEqual(_ actual: String, _ expected: String) {
    if actual != expected {
      fatalError("Expected '\(expected)', got '\(actual)'")
    }
  }
}
