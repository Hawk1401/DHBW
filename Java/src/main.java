public class main {

  public static void main(String[] args) {
    System.out.println("Hello World1");
    for (int i = 0; i < 7; i++) {
      System.out.print("|");
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("*\\");
    }
    System.out.println("Hello World2");
  }
}
