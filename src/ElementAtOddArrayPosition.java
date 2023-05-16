import java.util.Arrays;
public class ElementAtOddArrayPosition {
    public static void getElementAtOddPosition(int[] number) {
        int index;
        for (index = 1; index < number.length; index = index + 2) {
            System.out.println(number[index] +  " = Element at odd position");
        }
    }
    public static void main(String[] args) {
        int[] number = {2, 3, 6, 8, 9, 20, 19, 200, 100, 33};
        System.out.println();
        getElementAtOddPosition(number);
        System.out.println("The Array Elements " + Arrays.toString(number));
    }
}
