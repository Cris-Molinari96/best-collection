package _1_javaExerciseForGithub._5_javaInProduction._0_record;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
			Student s = new Student(
                    switch (i){
                        case 1->"Cristian";
                        case 2->"Marco";
                        case 3->"Matteo";
                        case 4->"Franco";
                        case 5->"Antonio";
                        default -> "Anonymous";
                    },
                    switch (i){
                        case 1->"Cristian";
                        case 2->"Marco";
                        case 3->"Matteo";
                        case 4->"Franco";
                        case 5->"Antonio";
                        default -> "Anonymous";
                    },
                    switch (i){
                        case 1 -> 26;
                        case 2 -> 26;
                        case 3 -> 26;
                        case 4 -> 26;
                        case 5 -> 39;
                        default -> 50;
                    }
            );
            System.out.println(s);
        }

    }
}
