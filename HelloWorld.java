import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.*;

class HelloWorld {
  public static void main(String[] args) throws InterruptedException {
    // This is my first hellow world program.
    System.out.println("Hello World !!! welcome " + (args.length == 0 ? "guest" : Arrays.toString(args)));
    // It will print "Hello World"
    // Hope you like it. do you?
    TimeUnit.MINUTES.sleep(2);
    // It will print Hello World
    // Hope you like it
  }
}
