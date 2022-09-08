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
//    public static int[] extractAllOddNumbers(int[]ints) {
//    int numberOdds = 0;
//        for(int x= 0; x <ints.length; x++){
//        if(x % 2 ==0){
//            numberOdds ++;
//        }
//    }
//    int[] odds= new int[numberOdds];
//    int count = 0;
//        for (int x = 1; x<ints.length; x++){
//        if (ints[x] % 2 ==1){
//            odds[count] = ints[x];
//            count++;
//        }
//        return odd;
//    }

    //Question 8
    //casting
//    public static  String extractAllOddNumbers(int[]ints) {
//        //     String newArray = 1;
//        int x = 0;
//        int[] newArray = new int[4];
//        //      System.out.print("Extracting odd number: " + ints);
//        for (x = 0; x <= ints.length; x++) {
//            if (x % 2 != 0) {
//                x++;
//            }
//        }
//          return ints[x];
//    }
    //Question 9
    public static String extraAllEvenNumber(int[]ints){
        

        }

        return null;
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
        System.out.print("Extracting odd number: " + ints);
    }
}
