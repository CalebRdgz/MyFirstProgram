import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
//        // 2 VARIABLES
//        System.out.println("\"I love pizza\\");
//        System.out.print("It's really good!\n");
//        System.out.println(":)");
//        int x; //declare
//        x = 123; //assign
//        System.out.println("My number is: " + x);
//        int y = 321; //initialize
//        System.out.println("y = " + y);
//        float z = 3.14f;
//        double d = 3.14;
//        boolean a = true;
//        System.out.println(a);
//        char symbol = '@';
//        String name = "Bro";
//        System.out.println("Hello " + name);

//        // 3 SWAP TWO VARIABLES
//        String x = "water";
//        String y = "Kool-Aid";
//        String temp;
//
//        temp = x;
//        x=y;
//        y = temp;
//
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);

//        // 4 USER INPUT
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("What is your favorite food?");
//        String food = scanner.nextLine();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old.");
//        System.out.println("You like " + food + ".");

//        // 5 EXPRESSIONS
//        // expression = operands & operators
//        // operands = values, variables, numbers, quantity
//        // operators = + - * / %
//        double friends = 10;
//
//        friends = (double) friends / 3;
//        System.out.println(friends);

//        // 6 GUI INTRO
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null, "You are " + height + " cm. tall.");

//        // 7 MATH CLASS
//        double x = 3.14;
//        double y = -10;
//
//        double z = Math.max(x, y);
//        double a = Math.abs(y);
//        double b = Math.sqrt(x);
//        double c = Math.round(x);
//        double d = Math.ceil(x);
//
//
//        System.out.println(z);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

        // MATH CLASS PROJECT
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: " + z);
        scanner.close();

    }
}