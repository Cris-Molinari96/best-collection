package _1_javaExerciseForGithub._8_algorithm._1_parolaReverse;

public class Main {
    public static void main(String[] args) {

        String ciao = "ciao";

        int n = ciao.length();

        char[] c = new char[n];
        int lastIndex=ciao.length() - 1;

        System.out.println(lastIndex);

        for (int i = lastIndex; i < ciao.length() && i >= 0 ; i--){

//           if(i < 0){
//               break;
//           }else{
//               System.out.println(ciao.charAt(i));
//           }
               System.out.println(ciao.charAt(i));



        }


        for (int i = 0; i < n; i++) {
            c[n - i - 1] = ciao.charAt(i);
        }
//
//        for (char c1 : c) {
//            System.out.println(c1);
//        }

        // i = 0
        // n = 4



    }
}
