import java.util.Arrays;

public class Loops {
    //Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }
    //Question 6
//    public static int getSum(int[] ints){

//    }


    public static void main(String[] args) {
        String[] names = {"Jazmin", "Nate", "Chole", "Mike"};
        int[] ints = {5, 6, 10, 12};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
    }
}
