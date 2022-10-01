
public class Loops {

    //Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }
    //Question 3
    public static String getFirstElement(String[] names){
        return (names[0]);
    }
    //Question 4
    public static String getLastElement(String[] names){
        return (names[names.length - 1]);
    }
    //Question 5
    public static String getSecondToLastElement(String[]names){
        return (names[names.length - 2]);
    }

    //Question 6
    public static int getSum(int[] ints){
        int sum = 0;
        for (int x=0; x < ints.length ; x++){
            sum = sum + ints[x];
        }
        return sum;
    }
    //Question 7
    public static int getAverage(int[]ints) {
        int sum= 0;
        for (int x = 0; x < ints.length; x++) {
            sum = sum + ints[x];

        }
        return sum / ints.length;
    }
    //Question 8(another attempt)
    public static String extractAllOddNumbers(int[] numbers) {
        String odd =" ";
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
                return String.valueOf((numbers[i]));
            }
        }
        return null;
    }
    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        //      int number=0;
        String even = " ";
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                even+= numbers[i]+" ";
            }
        }
        return even;
    }
    //   Question 10
    public static boolean contains(String[] names, String element) {
        for(int x=0;x<names.length;x++){
            if(names[x]==element){
                return true;
            }
        }
        return false;
    }
    //   Question 11
    public static int getIndexByElement(String[] names, String element) {
        int i=0;

        for( int x =0; x<names.length;x++) {
            if (names[x] == element) {
                //              x=i;
            }
            x=i;
        }

        return i;
    }


    public static void main(String[] args) {
        String[] names = {"Jazmin", "Nate", "Chole", "Mike"};
        int[] ints = {5, 6, 10, 12};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(ints));
        System.out.println(getAverage(ints));
        System.out.println("Extracting odd number: " + extractAllOddNumbers(ints));
        System.out.println("The even numbers: " + extractAllEvenNumbers(ints));
        System.out.println(contains(names,"Chloe"));
        System.out.println(getIndexByElement(names,"Nate"));
    }
}
