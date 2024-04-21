import java.util.LinkedHashSet;
public class equalMethod {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        LinkedHashSet<String> lhs3 = new LinkedHashSet<>();
        lhs1.add("Mazda");
        lhs1.add("Alto");
        lhs1.add("Hybrid");
        lhs1.add("BMW");
        lhs2.add(2000);
        lhs2.add(5000);
        lhs2.add(1000);
        lhs2.add(6000);
        lhs2.add(4000);
        lhs3.add("Mazda");
        lhs3.add("Alto");
        lhs3.add("Hybrid");
        lhs3.add("BMW");
        System.out.println("LinkedHashSet 1 :- "+lhs1);
        System.out.println("LinkedHashSet 2 :- "+lhs2);
        //compare LinkedHashSet1 to LinkedHashSet2
        boolean val1 = lhs1.equals(lhs2);
        System.out.println("Are both set equal :- "+val1);
        System.out.println(".................................................");
        System.out.println("LinkedHashSet 1 :- "+lhs1);
        System.out.println("LinkedHashSet 3 :- "+lhs3);
        //compare LinkedHashSet1 to LinkedHashSet3
        boolean val2 = lhs1.equals(lhs3);
        System.out.println("Are both set equal :- "+val2);
    }
}
