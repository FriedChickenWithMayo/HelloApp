/* HelloApp.java - Simple Application that prints "Hello World" into console
 * @author jigmeepaotamang
 * @version 6.0
 * @since UC1
 * */
public class HelloApp {
    public static void main(String[] args) {
        String names = "World"; 
        if(args.length>0)
          names=String.join(", ", args);
        System.out.println("Hello, " + names + "!");
    }
}
