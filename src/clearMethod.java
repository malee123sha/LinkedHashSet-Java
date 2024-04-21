import java.util.LinkedHashSet;
public class clearMethod {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Mazda");
        lhs.add("Alto");
        lhs.add("Hybrid");
        lhs.add("BMW");
        System.out.println("Before Using Clear Method :- "+lhs);
        //use clear method
        lhs.clear();
        System.out.println("After Using Clear Method  :- "+lhs);
    }
}
