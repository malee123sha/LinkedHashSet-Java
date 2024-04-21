import java.util.Collections;
import java.util.LinkedHashSet;
public class FindMinAndMax {
    public static void main(String[] args) {
        LinkedHashSet <Integer> lhs = new LinkedHashSet<>();
        lhs.add(5600);
        lhs.add(0);
        lhs.add(55);
        lhs.add(330);
        lhs.add(0);
        lhs.add(680);
        lhs.add(8000);
        lhs.add(1000);
        lhs.add(900);
        lhs.add(2500);
        System.out.println("LinkedHashSet is :- "+lhs);
        //Minimum Value
        System.out.println("Minimum Value is :- "+ Collections.min(lhs));
        //Maximum Value
        System.out.println("Maximum Value is :- "+ Collections.max(lhs));
    }
}
