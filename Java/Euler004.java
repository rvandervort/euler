/*
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 Find the largest palindrome made from the product of two 3-digit numbers.*
 *
 */
class Euler004 {
  public static boolean isPalindrome(char[] chars) {
    int i = 0, j = chars.length - 1;

    while (i < j) {
      if (chars[i] != chars[j])
        return false;

      i++;
      j--;
    }
    return true;

  }

  public static char[] intToCharArray(int value) {
    return String.valueOf(value).toCharArray();
  }

  public static void main(String[] args) {
    int maxProduct = 0;

    for (int i = 999; i >= 100; i--) {
      for (int j = 999; j >= 100; j--) {
          int product = i * j;

          if (isPalindrome(intToCharArray(product)) && product > maxProduct)
            maxProduct = product;
      }
    }

    System.out.println("The max product is : " + maxProduct);
  }
}
