package src;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    byte[] blank = {};
    byte[] allZeroes = {0, 0};
    byte[] leadingZeroes = {0, 0, 1, 0, 0};
    byte[] trailingZeroes = {(byte) 172, (byte) 173, (byte) 16};
    byte[] address = {
      (byte) 0,
      (byte) 98,
      (byte) 233,
      (byte) 7,
      (byte) 177,
      (byte) 92,
      (byte) 191,
      (byte) 39,
      (byte) 213,
      (byte) 66,
      (byte) 83,
      (byte) 153,
      (byte) 235,
      (byte) 246,
      (byte) 240,
      (byte) 251,
      (byte) 80,
      (byte) 235,
      (byte) 184,
      (byte) 143,
      (byte) 24,
      (byte) 194,
      (byte) 155,
      (byte) 125,
      (byte) 147
    };
    byte[] ones = new byte[10];
    Arrays.fill(ones, (byte) 0xff);

    assertEqual(Base58.encode(blank), "");
    assertEqual(Base58.encode(allZeroes), "11");
    assertEqual(Base58.encode(leadingZeroes), "11LUw");
    assertEqual(Base58.encode(trailingZeroes), "21111");
    assertEqual(Base58.encode(address), "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
    assertEqual(Base58.encode(ones), "FPBt6CHo3fovdL");

    System.out.println("Done");
  }

  private static void assertEqual(String actual, String expected) {
    if (!actual.equals(expected)) {
      throw new Error(String.format("Expected '%s', got '%s'", expected, actual));
    }
  }
}
