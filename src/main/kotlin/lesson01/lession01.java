package lesson01;

public class lession01 {
    static String fullName;

    public static void main(String[] args) {
        String firstName = "Rahima";
        String lastName = "Shapla";
        String firstDigit = "100";
        String lastDigit = "50";
        receiveObject(firstName);
     /*   System.out.println(getFullName(firstName, lastName));
        System.out.println(typeConvertion(firstDigit, lastDigit));*/
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

public static void receiveObject(Object obj){
    System.out.println(obj);
    if(obj instanceof String){
        System.out.println("Yes it is String!!!!!!!!!!!!");
    }
}

    public static String getFullName(String firstName, String lastName){
        fullName = firstName + " " + lastName;
        return fullName;
    }

    public static int typeConvertion(String firstDist, String lastDisit){
        return Integer.parseInt(firstDist) + Integer.parseInt(lastDisit);
    }
}
