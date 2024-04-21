import java.util.LinkedHashSet;
public class isEmpty {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //checks if the LinkedHashSet is empty or not
        System.out.println("Is the LinkedHashSet Empty ? :- "+lhs.isEmpty());
        lhs.add("Mazda");
        lhs.add("Alto");
        lhs.add("Hybrid");
        lhs.add("BMW");
        System.out.println(".................................................");
        System.out.println("LinkedHashSet  :- "+lhs);
        //checks if the LinkedHashSet is empty or not
        System.out.println("Is the LinkedHashSet Empty ? :- "+lhs.isEmpty());
        System.out.println(".................................................");
        //use clear method
        lhs.clear();
        System.out.println("LinkedHashSet  :- "+lhs);
        //checks if the LinkedHashSet is empty or not
        System.out.println("Is the LinkedHashSet Empty ? :- "+lhs.isEmpty());
    }
}

















