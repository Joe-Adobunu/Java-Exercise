package codeworld;

public class VariableLengthArgumentList {
    public static int add(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
       // System.out.println(total);
        return total;
    }

//     public double add(double...numbers) {
//         int total = 0;
//         for (double num : numbers) {
//             total += num;
//
//         }
//        // System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9));
//         add(1.1, 2.2, 3.3, 4.4, 5.5);
//         return total;
//     }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 4, 1, 3));


    }
}