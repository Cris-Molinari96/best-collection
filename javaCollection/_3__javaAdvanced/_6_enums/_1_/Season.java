package _1_javaExerciseForGithub._3__javaAdvanced._6_enums._1_;

public enum Season {
    SPRING,
    SUMMER,
    WINTER;

    public void season(Season x){
        switch (x){
            case SUMMER -> System.out.println("Season Summer: \nStart --> 21/June \nEnd --> 22/September " );
            case WINTER -> System.out.println("Season Winter:\nStart --> 01/December \nEnd --> 28,29/ February " );
            case SPRING -> System.out.println("Season Spring:\nStart --> 20/March \nEnd --> 21/June " );
        }

    }
}
