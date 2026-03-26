/* HelloApp.java - Simple Application that prints "Hello World" into console
 * @author jigmeepaotamang
 * @version 6.0
 * @since UC1
 * */
public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        String names = ""; 
        for (String name : args) { 
            nameBuilder.append(name).append(", ");
        }

        if (nameBuilder.length() > 0) {
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        System.out.println("Hello, " + names + "!");
    }
}
