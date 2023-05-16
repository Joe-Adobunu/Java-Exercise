package codeworld;

public class Array extends Throwable {
    public static void main(String[] args) {
        //create an array
        int[] array = new int[10];
        System.out.println(array);
        //insert an element into array
        array[2] = 20;        //[0,0,20,0,0,0
        //System.out.println(array);
        System.out.println(convertArraytoString(array));


    }
    private static String convertArraytoString(int[] array){
        String arrayRepresentation = "[";
        for (int index = 0; index < array.length; index++){
            if(index != array.length -1)
            arrayRepresentation += array[index] + ",";
            else arrayRepresentation += array[index];
        }
        arrayRepresentation += "]";
        return arrayRepresentation;

    }
}
