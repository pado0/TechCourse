package Daily_study_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ch11_collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String s : list) {
            System.out.println("s = " + s);
        }
    }
}
