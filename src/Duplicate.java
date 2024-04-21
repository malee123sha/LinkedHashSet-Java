import java.util.LinkedHashSet;
public class Duplicate {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //add elements
        lhs.add("Mazda");
        lhs.add("BMW");
        lhs.add("Hybrid");
        //duplicate
        lhs.add("BMW");
        lhs.add("Mazda");
        System.out.println(lhs);
    }
}
