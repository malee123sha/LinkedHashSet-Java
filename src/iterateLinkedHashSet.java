import java.util.Iterator;
import java.util.LinkedHashSet;
public class iterateLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> t = new LinkedHashSet<>();
        t.add(100);
        t.add(300);
        t.add(500);
        t.add(700);
        t.add(200);
        t.add(600);
        t.add(400);
        //using iterator
        System.out.println("Using Iterator");
        Iterator i = t.iterator();
        while (i.hasNext())
            System.out.print(i.next()+"  ");
        System.out.println();
        System.out.println("............................................");
        //iterate through for loop
        System.out.println("Using For Loop");
        for (int val : t)
            System.out.print(val+"  ");
    }
}
