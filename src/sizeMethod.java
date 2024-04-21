import java.util.LinkedHashSet;
public class sizeMethod {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        LinkedHashSet<Double> lhs3 = new LinkedHashSet<>();
        lhs1.add("Mazda");
        lhs1.add("Alto");
        lhs1.add("Hybrid");
        lhs1.add("BMW");
        lhs2.add(2000);
        lhs2.add(5000);
        lhs2.add(1000);
        lhs2.add(6000);
        lhs2.add(4000);
        lhs2.add(3000);
        lhs3.add(0.5);
        lhs3.add(2.66);
        lhs3.add(820.66);
        System.out.println("LinkedHashSet 1 :- "+lhs1);
        System.out.println("LinkedHashSet 1 Size is :-"+lhs1.size());
        System.out.println("..................................................");
        System.out.println("LinkedHashSet 2 :- "+lhs2);
        System.out.println("LinkedHashSet 2 Size is :-"+lhs2.size());
        System.out.println("..................................................");
        System.out.println("LinkedHashSet 3 :- "+lhs3);
        System.out.println("LinkedHashSet 3 Size is :-"+lhs3.size());
    }
}
