import java.util.LinkedHashSet;
public class accessElements {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //add elements
        lhs.add("Mazda");
        lhs.add("BMW");
        lhs.add("Hybrid");
        System.out.println("LinkedHash Set :-"+lhs);
        System.out.println("............................................................................................");
        //check "BMW" available
        String check1 = "BMW";
        System.out.println("Contains :- "+check1+"   "+lhs.contains(check1));
        //check "Alto" available
        String check2 = "Alto";
        System.out.println("Contains :- "+check2+"   "+lhs.contains(check2));
        System.out.println("............................................................................................");
        //First Element
        System.out.println("Access First Element :- "+lhs.getFirst());
        //Last Element
        System.out.println("Access Last Element  :- "+lhs.getLast());
    }
}
