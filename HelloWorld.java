public class HelloWorld {
  public static void main(String[] args) {
    while (true) {
      System.out.println("Hello world!");
      try {
        Thread.sleep(1000); // Pause for 1 second
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
