package arrayslistbaitap;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayslistbaitap {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Huy1");
        names.add("Huy2");
        names.add("Huy3");
        System.out.println("name [] =" + Arrays.toString(names.toArray()));
        System.out.println("name [0]=" + names.get(0));
        
        //remone by object and return Boolean type 
        System.out.println(names.remove("Huy2"));
        
        //remove by index
        System.out.println(names.remove(1));
        System.out.println("names[]=" + Arrays.toString(names.toArray()));
    }
}
