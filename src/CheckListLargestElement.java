import java.util.List;
public class CheckListLargestElement {
    public static int checkLargestList(List<Integer> lst){
        int largestElement = lst.get(0);
        for(int index = 1; index < lst.size(); index++){
            int element = lst.get(index);
            if(element > largestElement){
                largestElement = element;
            }
        }
        return largestElement;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(80, 23, 50, 105, 34, 1);
        System.out.println("largest element in the list is " + checkLargestList(numbers));
    }

}
