package _1_javaExerciseForGithub._1_javaBasic._3_conversionPrimitiviInWrapper;

public class Main {
    public static void main(String[] args) {

        int n = 10;
        Integer a = Integer.valueOf(n);
        String num = String.valueOf(n);

        int b = a.intValue();

        System.out.println(b + " " + a + " " + num);
    }
}
