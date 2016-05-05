class Euler006 {
  public static void main(String[] args) {
    int sumOfSquares = 0;
    int sumToBeSquared = 0;

    for (int i = 1; i <= 100; i++) {
      sumOfSquares += Math.pow(i, 2);
      sumToBeSquared += i;
    }

    System.out.printf("%.0f\n", Math.pow(sumToBeSquared, 2) - sumOfSquares);
  }
}
