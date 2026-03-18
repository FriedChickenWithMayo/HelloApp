/* HelloApp.java - Simple Application that prints "Hello World" into console
 * @author jigmeepaotamang
 * @version 4.0
 * @since UC1
 * */
public class HelloApp {
  public static void main(String args[]) {
    StringBuilder nameBuilder = new StringBuilder();
    String name;
    for (int i = 0; i < args.length; i++) {
      nameBuilder.append(args[i]);
      if (i < args.length - 1)
        nameBuilder.append(", ");
    }
    name = nameBuilder.toString();
    System.out.println("Hello, " + name + "!");
  }
}
