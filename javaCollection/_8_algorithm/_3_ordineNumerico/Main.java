package _1_javaExerciseForGithub._8_algorithm._3_ordineNumerico;

public class Main {
    public static void main(String[] args) {

        // ! Ordinamento di un'array di numeri in ordine alfabetico BRUTTE MERDE

        int[] a = {95, 97, 98, 91, 102, 105, 100, 92, 86, 84};
        int bb = a.length;
        boolean sca = false;

        // per scrivere un algoritmo che permetta di ordinare un'array di numeri in ordine di grandezza dobbiamo impostare un ciclo
        // che permetta di verificare una condizione in seguito, ci siamo aiutati con una variabile booleana,
        // una variabile che prenda la length dell'array la quale ci serve per impostare la condizione nel ciclo


        do{
            sca=false;
            for (int i = 1; i < bb;i++){
                if(a[i-1] > a[i]){
                    int b = a[i-1];
                    a[i-1] = a[i];
                    a[i] = b;
                    sca=true;

                }
            }
        }while(sca);


//
//        do {
//            sca = false;
//            for (int i = 1; i < a.length; i++) {
//
//                if (a[i - 1] > a[i]) {
//                    int b = a[i - 1];
//                    a[i - 1] = a[i];
//                    a[i] = b;
//                    sca = true;
//
//                }
//            }
//            bb--;
//        } while (sca);

        for (int numero : a) {
            System.out.println(numero);
        }

    }
}
