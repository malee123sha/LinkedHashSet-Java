import java.util.Iterator;
import java.util.LinkedHashSet;
public class zFinal {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //checks if the LinkedHashSet is empty or not
        System.out.println("Is the LinkedHashSet Empty ? :- "+lhs.isEmpty());
        //checks  size of the LinkedHashSet
        System.out.println("LinkedHashSet Size is :-"+lhs.size());
        //add elements
        lhs.add("Third Generation");
        lhs.add("Fifth Generation");
        lhs.add("Second Generation");
        lhs.add("First Generation");
        lhs.add("Fourth Generation");
        System.out.println(lhs);
        System.out.println("............................................................................................");
        //first element
        System.out.println("First Element is :- "+lhs.getFirst());
        //last element
        System.out.println("Last Element is  :- "+lhs.getLast());
        System.out.println("............................................................................................");
        System.out.println("Before Removing  :-"+lhs);
        //remove elements
        lhs.remove("Third Generation");
        System.out.println("After Removing   :-"+lhs);
        System.out.println("............................................................................................");
        //check "First Generation" available
        String check1 = "First Generation";
        System.out.println("Contains :- "+check1+"   "+lhs.contains(check1));
        //check "BMW" available
        String check2 = "BMW";
        System.out.println("Contains :- "+check2+"   "+lhs.contains(check2));
        System.out.println("............................................................................................");
        //create an iterator
        Iterator i = lhs.iterator();
        System.out.println("Iterator Values: ");
        while (i.hasNext())  {
            System.out.println("  "+"*"+" "+i.next());
        }
        System.out.println("............................................................................................");
        //use clear method
        lhs.clear();
        System.out.println("After Using Clear Method  :- "+lhs);
    }
}
