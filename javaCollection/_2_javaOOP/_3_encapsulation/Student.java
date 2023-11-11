package _1_javaExerciseForGithub._2_javaOOP._3_encapsulation;

public class Student {
        private String name;
        private String surname;
        private String city;
        private String initialCFCode;
        private int age;
        private int maxAge = 18;

        Student(String name, String surname, String city, int age){
            this.name = name;
            this.surname = surname;
            this.city = city;
            this.age = age;
        }
        Student(){
        }

        public void setNameSurname(String n, String s) {
            this.name = n;
            this.surname = s;

            System.out.println( name + " " + surname);
        }
        public void setAge(int a) {
            if (a < maxAge || a < 0) {
                System.out.println("You can't register you haven't 18+");
                this.age = a;
            } else {
                System.out.println("You can register, you have +18");
            }
            System.out.println(age);
        }
        public void setCity(String city) {
            this.city = city.toLowerCase() ;
            System.out.println(city);
        }

        public void setCF(String n, String s) {
            this.initialCFCode = n.charAt(0) + " " + s.charAt(0);
            System.out.println(initialCFCode);
        }

        public String getNameSurname(){
            return name + " " + surname;
        }

        public int getAge() {
            return age;
        }


        public String getCity() {
            return  city;
        }

        public String getCF() {
          return name.charAt(0) + " " + surname.charAt(0);
        }
    }

