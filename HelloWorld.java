import java.util.concurrent.TimeUnit;

class HelloWorld {
  public static void main(String[] args) throws InterruptedException {
    // This is my first hellow world program.
    System.out.println("Hello World !!! welcome " + (args.length == 0 ? "guest" : args[0]));
    // It will print "Hello World"
    // Hope you like it. do you?
    TimeUnit.MINUTES.sleep(5);
    // It will print Hello World
    // Hope you like it
  }
}
