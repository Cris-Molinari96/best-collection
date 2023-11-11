package _1_javaExerciseForGithub._1_javaBasic._0_referenceObj;

public class Main {
    public static void main(String[] args) {

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;
        // questi due oggetti stanno puntando allo stesso indirizzo in memoria.
        // questo spiega il fatto che anotherHouse stampa blue
        System.out.println(anotherHouse.getColor()); // --> blue
        // uguale se provo a modificare con set il colore ad uno dei due, il riferimento sarà sempre quello



    }
}
