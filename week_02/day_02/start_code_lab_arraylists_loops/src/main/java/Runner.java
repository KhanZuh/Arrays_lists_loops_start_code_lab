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
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(scottishIslands.indexOf("Mull"), "Islay");

//        4. Print out the index position of "Skye"
        int index = scottishIslands.indexOf("Skye");
        System.out.println("Index position of 'Skye': " + index);
//        explainer - index position printed out as 4 0 since "Tiree" moved to top of list

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
//        Things have moved around in List --> in pseudo to visualise
//        Tiree to top of list = 0
//        Jura = 1 / Islay = 2 / Mull = 3 / Skye = 4 / Arran = 5
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        System.out.println("Number of islands: " + scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        System.out.println("Even integers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

//        2. Print the difference between the largest and smallest value
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Difference: " + (max - min));

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean containsAdjacentOnes = false;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                containsAdjacentOnes = true;
                break;
            }
        }
        System.out.println("Contains adjacent ones: " + containsAdjacentOnes);

//        4. Print the sum of the numbers,
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//        for (int number : numbers) {
//            if (number == 13) {
//                continue; // Skip the current iteration if number is 13
//            }
//            sum += number;
//        }
//
//        // Print the sum
//        System.out.println("Sum of numbers (excluding 13): " + sum);
//        CODE ABOVE GIVING WRONG SOLUTION IN TERMINAL


//           ...and numbers that come immediately after a 13 also do not count.
//        NEED INSTRUCTOR ASSISTANCE - FOUND VERY CHALLENGING
//
//          So [2, 7, 13, 2] would have sum of 9.



    }



}
