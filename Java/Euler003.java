class Euler003 {
  public static void main(String[] args) {
      int largestPrimeFactor = 0;

      long factorThis = 600851475143L;

      // up to the square root, yo
      for (long i  = 2; i*i <= factorThis; i++) {
        while (factorThis % i == 0) {
          System.out.print(i + " ");
          factorThis = factorThis / i;
        }
      }
      largestPrimeFactor = (int)factorThis;

      System.out.println("\nThe largest prime factor is: " + largestPrimeFactor);
  }
}
