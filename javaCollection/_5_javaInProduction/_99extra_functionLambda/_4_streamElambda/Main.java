package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._4_streamElambda;

import java.util.ArrayList;
import java.util.List;

public class Main /*implements InterfacciaFunzionale*/{

    record Person(String name, String surname){}

    public static void main(String[] args) {

        //! Abbiamo provato a far ritornare qualcosa, ossia il metodo printString ritorna una stringa.
       /* InterfacciaFunzionale interfacciaFunzionale = (x) -> {
            return x;
        };

        String str = interfacciaFunzionale.printString("KK47");
        System.out.println(str); */


        List<String> stringList = new ArrayList<>(List.of("23TA4","AQL2Dw", "ltMKR4f", "2Xg", "l24s0T", "lIOd"));
        List<Person> personList = new ArrayList<>(List.of(
                new Person("crist","Mol"),
                new Person("zZ","Abc"),
                new Person("gre","er"),
                new Person("aefwe","f3eh")
        ));

        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println("_________");
//        stringList.forEach(System.out::println);
        stringList.forEach((String myString) -> {
            char firstChar = myString.charAt(0);
            System.out.println(myString + " prmio carattere:" + firstChar);
        });
//        Collections.sort(personList, ((o1, o2) -> o1.name.compareTo(o2.name)));
        System.out.println("___________");

        //! Stream + Lamda
        List<Person> personSorted = personList.stream().sorted((o1, o2) -> o1.name.compareTo(o2.name)).toList();
        personSorted.forEach(System.out::println);

    }
}
