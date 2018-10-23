package lesson03.java;

public class DataUtil {

    private static DataUtil sInstance;

    private DataUtil() {

    }

    public static DataUtil on() {
        if (sInstance == null) sInstance = new DataUtil();
        return sInstance;
    }

    public <T> void printObject(T obj) {
        System.out.println(obj.toString());
    }
}
