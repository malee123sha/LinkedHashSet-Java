import java.util.Iterator;
import java.util.LinkedHashSet;
public class iteratorMethod {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Maths");
        lhs.add("Science");
        lhs.add("History");
        lhs.add("English");
        lhs.add("Literature");
        System.out.println("LinkedHashSet is :- " + lhs);
        //create an iterator
        Iterator i = lhs.iterator();
        System.out.println("Iterator Values: ");
        while (i.hasNext()) {
            System.out.println("  " + "*" + " " + i.next());
        }
    }
}