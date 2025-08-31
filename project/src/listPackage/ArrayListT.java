package listPackage;

import java.util.ArrayList;

public class ArrayListT {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Gift");
        System.out.println(myList);

        System.out.println(myList.isEmpty());

        myList.remove("Gift");
        System.out.println(myList.isEmpty());
    }
}
