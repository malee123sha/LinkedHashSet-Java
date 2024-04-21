import java.util.LinkedHashSet;
public class removeElements {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //add elements
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        System.out.println("Before Removing :- "+lhs);
        System.out.println("............................................");
        System.out.println("Remove B from LinkedHashSet :- "+lhs.remove("B"));
        System.out.println("After Removing  :- "+lhs);
        System.out.println("............................................");
        System.out.println("Try to remove M which is not present in LinkedHashSet :- "+lhs.remove("M"));
    }
}
