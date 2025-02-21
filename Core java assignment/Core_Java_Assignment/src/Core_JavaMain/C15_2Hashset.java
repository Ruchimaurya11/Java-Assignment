//Implement a program using HashSet to remove duplicate elements from a list.

package Core_JavaMain;
import java.util.*;

public class C15_2Hashset {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 8, 5, 4, 3, 9, 7, 1));
        
        
        Set<Integer> uniqueSet = new HashSet<>(list);
        
        
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        
       
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
