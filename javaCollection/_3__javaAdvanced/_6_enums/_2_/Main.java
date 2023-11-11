package _1_javaExerciseForGithub._3__javaAdvanced._6_enums._2_;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Day l = Day.LUNEDI;
        String ll = String.valueOf(l);

//        System.out.println(l + " " + ll);

        int n = new Random().nextInt(7);
        String day = String.valueOf(Day.values());

        System.out.println(day.toString());
        System.out.println(n);

//        System.out.println(l.name() + " " + l.ordinal());

    }
}
