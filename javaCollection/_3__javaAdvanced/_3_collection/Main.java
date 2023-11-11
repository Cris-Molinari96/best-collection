package _1_javaExerciseForGithub._3__javaAdvanced._3_collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new _1_list of unique items
     *
     *   You can reset a _1_list by using _1_list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        Set <String> set = new HashSet<>(list); // --> oppure gli potevo anche passare un set
        list = new ArrayList<>(new HashSet<>(list)); // set al posto d _1_list

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        System.out.println("Exe 2");
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        System.out.print("to _1_list -> " + toList(list));
        System.out.println("\n");
        System.out.print("to set -> " + toSet(set));
    }

    // Write your method for exercise 2 here
    public static List toList(List <String> list){
//        for (String l : _1_list) {}
        return list;
    }
    public static Set toSet(Set <String> set){
//        for (String s : set) {}
        return set;
    }

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {

        System.out.println("\n"+"Exe 3 ");
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        System.out.println(words);
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        for (String word : words) {
        int number = 0;
            for (String w : words) {
                if(w.strip().equals(word.strip())){
                    number += 1;
                }
            }
                wordCount.put(word,number);
        }
        System.out.println(wordCount);

    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: map, dentro la quale possiamo salvare lo studente e il tempo di arrivo
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: map, salvando gli studenti come chiave e i voti come valore
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: map, i valori sono i numeri, e i paesi stringhe
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: map, i prodotti disponibili saranno stringhe il prezzo il valore
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: LinkedHashSet, possiamo rispettare l'ordine di aggiunta
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: map, perchè abbiamo due parametri di tipo, stringa e numero popolazione
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: map, abbiamo due parametri di tipo che dobbiamo salvare, nome libri e data pubblicazione
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: map e anche per le altre risposte perchè penso che abbiamo più di un parametro di tipo che ci interessa salvare..
     *
     *  MARCO NON MI MENARE, SPERO SIA CORRETTO ..
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: map
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: map
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: map
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: map
     */
    }


