package net.karen;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    /* ArrayList, Maps and Sets (Collections) */

       /* Array */
       String[] questions = new String[2];
       questions[0] = "How many States does the USA have?";
       questions[1] = "Capital of UK?";

       for (String que : questions) {
           System.out.println(que);
       }

       /* ArrayList */
       List<String> questionList = new ArrayList<>();
       questionList.add("What Language is spoken in Germany?"); // List add index
       questionList.add("What is the Capital of Canada?");
       questionList.add("In what Hemisphere is Brazil?");

       /* LISTS -> Add entries / elements dynamically */
       questionList.remove(1); // List remove index
       System.out.println(questionList.size()); // List size
       System.out.println(questionList.get(0)); // List specific index

       printArrayListString(questionList);

       // Wrapper Classes we can use instead of the primitive data types
       List<Integer> numbers = new ArrayList<>();
       numbers.add(420); // List add index
       numbers.add(42);

       printArrayListInteger(numbers);

       // Maps -> Map contains a Key and a Value. Key maps to a certain Value
       // Key-Value Pair
       // Map<data type, data type> -> Ex: Map<Int, Float> => Work!
       Map<String, String> countryToCapital = new HashMap<>();
       countryToCapital.put("Germany", "Berlin"); // Map add index
       countryToCapital.put("France", "Paris");
       countryToCapital.put("Italy", "Rome");
       countryToCapital.put("US", "Washington DC");

       countryToCapital.get("Germany"); // Map specific index


       printMap(countryToCapital);

       System.out.println("Contains Key 'Germany'? " + countryToCapital.containsKey("Germany")); // Map contains Key
       System.out.println("Contains Value 'London'? " + countryToCapital.containsValue("London")); // Map contains Value

       System.out.println(countryToCapital.remove("France")); // Map remove key

       printMap(countryToCapital);

       // SETS -> A Set is a collection that contains no duplicates
       Set<String> usernames = new HashSet<>();
       usernames.add("Kaupenjoe"); // Set add index
       usernames.add("Nanoattack");

       printSet(usernames);

       System.out.println(usernames.add("FRV")); // True -> Add on Set index
       System.out.println(usernames.add("FRV")); // False -> no duplicate

       printSet(usernames);

    }

    // ERRORS YOU MIGHT RUN INTO
    // Uncomment for errors

    // IndexOutOfBoundException
    // If you try and pass in an Index that does not exist for a list
    // System.out.println(questionList.get(2));

    // Not an Exception, BUT "null"
    // If you pass in a Key into a Map that does not exist
    // Your return value is going to be null (might lead to other errors down the line!)
    // System.out.println(countryToCapital.get("Malta"));

    // My annotations
    public static void printArrayListString(List<String> arrayList) {
         System.out.println(arrayList); // List String custom method
    }

    public static void printArrayListInteger(List<Integer> arrayList) {
         System.out.println(arrayList); // List Integer custom method
    }

    public static void printMap(Map<String, String> map) {
         System.out.println(map); // Map custom method
    }

    public static void printSet(Set<String> set) {
         System.out.println(set); // Set custom method
    }
}