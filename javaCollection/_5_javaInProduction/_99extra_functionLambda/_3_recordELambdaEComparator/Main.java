package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._3_recordELambdaEComparator;

import java.util.*;

public class Main {
    // è possibile creare un record nel main
    record Person(String first, String second){
        @Override
        public String toString() {
            return first + second;
        }
    }

    public static void main(String[] args) {

        List<Person> peoples  = new ArrayList<Person>(Arrays.asList(
                new Person("ZZZZZZ","f"),
                new Person("Cristian","f"),
                new Person("Matteo","d"),
                new Person("Andre","r"),
                new Person("Pasc","h")));

        // * Questa è un interfaccia che ci consente di ordinare una lista utilizzando l'interfaccia Comparator.
        /*var comparator = new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return o1.first().compareTo(o2.first());
            }

        };

        peoples.sort(comparator);*/
        // ! Di seguito andremo a vedere le funzioni Lambda, svolgono lo stesso lavoro.
        peoples.sort((o1, o2) -> o2.first.compareTo(o1.first()));

        peoples.forEach(e -> System.out.println(e.first()));

    }
}
