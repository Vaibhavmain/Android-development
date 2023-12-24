// import java.util.Scanner;

// public class conditionals {
//     public static void main(String[] args) {
//         System.out.println("enter your age: ");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age>18) {
//             System.out.println("adult");
//         }
//         else{
//             System.out.println("not an adult");
//         }

//     }
// }

import java.util.Scanner;

/**
 * conditionals
 */
public class conditionals {

    public static void main(String[] args) {
        System.out.println("enter the value of a and b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("a is greater than b");
            }
        else if (a==b) {
            System.out.println("a is equal to b");
        }
        else {
            System.out.println("b is greater than a");
        }

    }
}
