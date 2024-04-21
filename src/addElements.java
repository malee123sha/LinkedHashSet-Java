import java.util.LinkedHashSet;
public class addElements {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //add elements
        lhs.add("Mazda");
        lhs.add("BMW");
        lhs.add("Alto");
        lhs.add("Hybrid");
        System.out.println(lhs);
        lhs.add("Hybrid");
    }
}
