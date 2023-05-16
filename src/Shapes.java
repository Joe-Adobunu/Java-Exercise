public class Shapes {

    public static void main(String[] args) {
//        for (int vertical = 0; vertical <= 4; vertical++){
//            for (int horizontal = 0; horizontal <= 4; horizontal++){
//                if (vertical == 0 || horizontal == 0 || vertical == 4 || horizontal == 4) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println("");
//        }

//                for (int vertical = 0; vertical <= 4; vertical++) {
//                    for (int horizontal = 0; horizontal <= 4; horizontal++) {
//                        System.out.print("*");
//                    }
//                    System.out.println(" ");
//                }
        int count = 1;
        while (count <= 20){
            System.out.println(count % 3 ==1? "########" : "++++++++");
            ++count;
        }

    }
}

