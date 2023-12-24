// // // public class loops {
// // //     public static void main(String[] args) {
// // //         for(int i=0; i<11; i++){
// // //             System.out.println(i);
// // //         }
// // //     }
// // // }

// // public class loops {

// //     public static void main(String[] args) {
// //         int i = 1;
// //         while (i<101) {
// //             System.out.println(i+2);
// //         }
// //     }
// // }

// import java.util.Scanner;

// public class loops {
//     //sum of first n natural number
//     public static void main(String[] args) {
//         System.out.println("enter the value of n: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         for (int i=0; i<=n; i++){
//             sum = sum+i;
//         }
//         System.out.println("sum of first "+ n +" natural numbers is "+sum);


//     }
// }

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        System.out.println("which table do you want: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("here is your table: ");
        for (int i=1; i<11; i++){
            System.out.println(n*i);
        }
        
    }
}