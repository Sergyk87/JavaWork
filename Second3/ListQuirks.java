package Second3;

import java.util.ArrayList;
import java.util.List;

public class ListQuirks {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0); // int -> Integer -? Object
        list.add("Hello");
        list.add(null);

        for (Object o : list)
            System.out.printf("%s %s\n", o.toString(), o.getClass().getName());

    }
}
