class Euler002 {
  public static void main(String[] args) {
    int currentTerm = 1;
    int previousTerm = 1;
    int nextTerm = 0;
    int sum = 0;

    while (currentTerm < 4000000) {
      nextTerm =  currentTerm + previousTerm;

      previousTerm = currentTerm;
      currentTerm = nextTerm;

      if (currentTerm % 2 == 0)
        sum += currentTerm;
    }

    System.out.println("The sum is : " + sum);

  }
}
