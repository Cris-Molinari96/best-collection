package _1_javaExerciseForGithub._4_javaAdvancedOOP._3_objClassAndMethod;

public class Person {
    private int id ;
    private String name ;
    private int age;
    private String address;

    public Person(int id,String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    @Override
    public String toString(){
        return this.name +  " " + this.age + " " + this.address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        int result;
        result = name.hashCode() + id + age + address.hashCode();
        return result;
    }
}
