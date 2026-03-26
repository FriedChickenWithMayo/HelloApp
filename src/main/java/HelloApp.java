/* HelloApp.java - Simple Application that prints "Hello World" into console
 * @author jigmeepaotamang
 * @version 5.0
 * @since UC1
 * */
public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        String finalNames;
        boolean first = true; 
        for (String s : args) { 
          if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(s);
            first = false;
        }

        finalNames = nameBuilder.toString();
        System.out.println("Hello, " + finalNames + "!");
    }
}
