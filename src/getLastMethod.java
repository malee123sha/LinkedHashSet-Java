import java.util.LinkedHashSet;
public class getLastMethod {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs.add("Mazda");
        lhs.add("BMW");
        lhs.add("Hybrid");
        lhs1.add(2000);
        lhs1.add(5000);
        lhs1.add(1000);
        lhs1.add(6000);
        lhs1.add(3000);
        System.out.println("LinkedHashSet 01 :- "+lhs);
        System.out.println("Last Element is :- "+lhs.getLast());
        System.out.println("....................................................................");
        System.out.println("LinkedHashSet 02 :- "+lhs1);
        System.out.println("Last Element is :- "+lhs1.getLast());
    }
}
