import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(List.of(480, 6, 1, 2, 3, 2, 4, 480, 6, 3));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(500, 6, 1, 2, 3, 2, 4, 500, 6, 3));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(List.of(500, 6, 1, 2, 3, 2, 4, 500, 6, 3));
        System.out.println(treeSet);
    }
}
