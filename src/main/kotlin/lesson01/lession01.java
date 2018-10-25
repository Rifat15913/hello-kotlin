package lesson01;

import java.util.ArrayList;
import java.util.List;

public class lession01 {
    static String fullName;

    public static void main(String[] args) {

        int intArray[];
        int[] intArrays; //both valid

        byte byteArray[];
        short shortsArray[];
        boolean booleanArray[];
        long longArray[];
        float floatArray[];
        double doubleArray[];
        char charArray[];

        intArray = new int[20];
        int[] intArrayss = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String firstName = "Rahima";
        String lastName = "Shapla";
        String firstDigit = "100";
        String lastDigit = "50";
        receiveObject(firstName);


        //list
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);  // adds 1 at 0 index
        l1.add(1, 2);  // adds 2 at 1 index
        System.out.println(l1);  // [1, 2]

        System.out.println(getFullName(firstName, lastName));
        System.out.println(typeConvertion(firstDigit, lastDigit));
    }
    // this method is for variable declaration in java

/*    public void variable_declaration_in_java(){
        int numberOfDays;
        byte nextInStream;
        short hour;
        long totalNumberOfStars;
        float reactionTime;
        double itemPrice;
        int numberOfDays;
        numberOfDays = 7;
        numberOfDays = numberOfDays + 10;
    }*/

    public static void receiveObject(Object obj) {
        System.out.println(obj);
        if (obj instanceof String) {
            System.out.println("Yes it is String!!!!!!!!!!!!");
        }
    }

    public static String getFullName(String firstName, String lastName) {
        fullName = firstName + " " + lastName;
        return fullName;
    }

    public static int typeConvertion(String firstDist, String lastDisit) {
        return Integer.parseInt(firstDist) + Integer.parseInt(lastDisit);
    }
}
