import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0,"Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
//      scottishIslands.add(2, "Islay");
        scottishIslands.add(scottishIslands.indexOf("Jura") +1, "Islay");
        System.out.println("The first list of Scottish Islands: " + scottishIslands);

//        4. Print out the index position of "Skye"
        int indexOfSkye = scottishIslands.indexOf("Skye");
        System.out.println("This is the index of Skye: " + indexOfSkye);

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(6);

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands);

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println("Ordered list: " +
                scottishIslands);


//        9. Print out all the islands using a for loop;
        System.out.println(scottishIslands);
        for (int i = 0; i < scottishIslands.size(); i++) {
            System.out.println(scottishIslands.get(i));
        }
        ;
//            for(String islands :scottishIslands){
//             System.out.println(islands);
//            }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("The even numbers are: " + evenNumbers);

//        2. Print the difference between the largest and smallest value
        System.out.println(Collections.max(numbers) - Collections.min(numbers));

//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        for (int number : numbers) {
//            if (numbers.contains(1)) {
//                System.out.println("True");
//                break;
//            }
//        }

        boolean sameNumber = false;
        for (int i = 0; i < numbers.size(); i++ ) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                sameNumber = true;}
        }
        System.out.println(sameNumber);
//        4. Print the sum of the numbers,

            int sum = 0;
            for (int i : numbers) {
                sum += i;
            }

            System.out.println("The sum is: " + sum);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
//        int sum = 0;
//        for( int i : numbers) {
//            sum += i;
//        }

//        System.out.println("The sum is: " + sum);

//        int sum2 = 0;
//        for(int i = 0; i < numbers.size(); i ++) {
//            sum2 += i;
//            {if(numbers.get(i) == 13){
//               continue;}
//            }}
//        System.out.println(sum2);
//
//        System.out.println("The better sum is: " + sum2);


//        int sum2 = 0;
//        for(int number : numbers) {
//                if(numbers.get(number) == 13){
//                    break;}
//            sum2 += number;
//            }
//        System.out.println(sum2);



        int sum2 = 0;
        for(int number : numbers) {
            {
                if (number == 13) {
                    break;
                }
            }
            sum2 += number;
        }
        System.out.println(sum2);

    }
}

