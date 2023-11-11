package _1_javaExerciseForGithub._2_javaOOP._1_createClasses;

import java.util.Arrays;
import java.util.List;

public class Course {

    String courseName ;
    int maxStudents;
    byte qualityRatingOutOf10;

    List<Integer> studentAges = Arrays.asList(23, 31, 38);

    public int etaMediaStudenti(){
        int sum = 0 ;
        for(int i = 0 ; i < studentAges.size(); i++ ){
            sum += studentAges.get(i) ;
        }
        System.out.println(sum / 3);
        return sum / 3 ;
    }
}
