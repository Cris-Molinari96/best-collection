package _1_javaExerciseForGithub._5_javaInProduction._0_record;

public record Student(String name,String surname,Integer age) {
    // i record non possono estendere altre classi in quanto estendono giò implicitamente la classe Record che è
    // una classe finale e non possono essere utilizzati come superclassi di altre classi
}
