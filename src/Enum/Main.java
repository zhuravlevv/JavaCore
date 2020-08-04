package Enum;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList a = new CopyOnWriteArrayList();
        System.out.println(Name.valueOf("VLAD"));
        Name name1 = Name.VLAD;
        Name name2 = Name.ANDREY;
        Name name3 = Name.DAN;
        Name name4 = Name.GEORGY;
        System.out.println(Arrays.toString(Name.values()));
    }
}
