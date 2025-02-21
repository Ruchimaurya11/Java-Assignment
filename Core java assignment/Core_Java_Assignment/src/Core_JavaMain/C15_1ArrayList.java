//Writeaprogramthat demonstrates the use of an ArrayList andLinkedList.

package Core_JavaMain;
import java.util.ArrayList;
import java.util.LinkedList;

public class C15_1ArrayList {
    public static void main(String[] args) {
       
        System.out.println(" ArrayList ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        
        System.out.println("ArrayList Elements: " + arrayList);

      
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of ArrayList Elements: " + sum);

        
        System.out.println("\n LinkedList  ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(25);

        System.out.println("LinkedList Elements: " + linkedList);

        
        int total = 0;
        for (int num : linkedList) {
            total += num;
        }
        double average = total / (double) linkedList.size();
        System.out.println("Average of LinkedList Elements: " + average);
    }
}
