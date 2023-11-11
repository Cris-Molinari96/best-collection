package _1_javaExerciseForGithub._5_javaInProduction._1_ternaryRecordBigClassN;

public record Person(String name, int age, String address){
@Override
    public String toString(){
    return this.name + "\n" + this.age + "\n" + this.address;
}
}
