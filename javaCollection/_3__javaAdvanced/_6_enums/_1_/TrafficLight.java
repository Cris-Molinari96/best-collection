package _1_javaExerciseForGithub._3__javaAdvanced._6_enums._1_;

public enum TrafficLight {
    // O un altro modo per risolvere quest'esercizio sarebbe stato aggiungere in constr. , e creare un metodo che prende in ingresso un int
    RED("red"),
    YELLOW("yellow"),
    GREEN("green");

    TrafficLight(String s ) {
    }

    public void nextStateTrafficLight(String s ){
        switch (s.strip().toLowerCase()){
            case "red" : System.out.println(GREEN);
            case "yellow" : System.out.println(RED);
            case "green" : System.out.println(YELLOW);
        }
    }

    public void stateCurrentTrafficLight(TrafficLight x){
        switch (x){
            case GREEN: System.out.println(RED);
            case RED: System.out.println(YELLOW);
            case YELLOW: System.out.println(GREEN);
        }
    }
}
