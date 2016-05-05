class Euler005 {
  public static boolean isDivisable(long input) {
    int[] a = {2,3,5,6,7,9,11,13,14,16,17,19};

    for (int intVal : a)
      if (input % intVal != 0)
        return false;

    return true;
  }

  public static void main(String[] args) {
    long l = 20;
    while (true) {
      if (isDivisable(l)) {
        System.out.println("Answer is : " + l);
        System.exit(0);
      }
      l++;
    }
  }
}
