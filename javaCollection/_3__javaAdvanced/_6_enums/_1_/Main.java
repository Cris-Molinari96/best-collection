package _1_javaExerciseForGithub._3__javaAdvanced._6_enums._1_;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days d:Days.values()) {
            System.out.println(d);
        }

//        for (YouCanUseClassLocalEnumsLikeThis y : YouCanUseClassLocalEnumsLikeThis.values()) {
//            System.out.println(y);
//        }

    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Season w = Season.WINTER;
        Season su = Season.SUMMER;
        Season sp = Season.SPRING;

        season(w);
        season(su);
        season(sp);

//        Season.SPRING.season(Season.SPRING);
//        System.out.println("-----------");
//        Season.SUMMER.season(Season.SUMMER);
//        System.out.println("-----------");
//        Season.WINTER.season(Season.WINTER);
    }

    public static void season(Season x){
        switch (x){
            case SUMMER -> System.out.println("Season Summer: \nStart --> 21/June \nEnd --> 22/September\n" );
            case WINTER -> System.out.println("Season Winter:\nStart --> 01/December \nEnd --> 28,29/ February\n" );
            case SPRING -> System.out.println("Season Spring:\nStart --> 20/March \nEnd --> 21/June" );
        }
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight red = TrafficLight.RED; // Cosi abbiamo creato delle instanze di TrafficLight
        TrafficLight yellow = TrafficLight.YELLOW;
        TrafficLight green = TrafficLight.GREEN;

        red.nextStateTrafficLight("RED");

        //! 1) Quindi come sopra possiamo richiamare un metodo di un enums in questo modo, passando come parametro il percorso dell'enumarzione
//        TrafficLight.GREEN.stateCurrentTrafficLight(TrafficLight.GREEN);
//        TrafficLight.RED.stateCurrentTrafficLight(TrafficLight.RED);
//        TrafficLight.YELLOW.stateCurrentTrafficLight(TrafficLight.YELLOW);
    }
    // 2) O possiamo creare un metodo statico, stessa cosa
    public static TrafficLight stateCurrent(TrafficLight current){
        switch (current){
            case GREEN -> System.out.println(TrafficLight.RED);
            case RED -> System.out.println(TrafficLight.YELLOW);
            case YELLOW -> System.out.println(TrafficLight.GREEN);
        }
        return current;
    }

    /**
     * 4:
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        IsWeekend m = IsWeekend.MONDAY;
        IsWeekend s = IsWeekend.SATURDAY;
        m.printWeekendDay(m.getIsWeek());
        s.printWeekendDay(s.getIsWeek());

        /*
        *  IsWeekend.FRIDAY.printWeekendDay(IsWeekend.FRIDAY.getIsWeek());
        //!  ^sopra^ Cosa succede qui? --> richiamiamo l'enum, il metodo, e recuperiamo il valore bool
        // * perchè il metodo print accetta quel tipo di valore, in base a quello stabilisce se un giorno è del week o meno
        IsWeekend.SUNDAY.printWeekendDay(IsWeekend.SUNDAY.getIsWeek());
        */
    }

    private enum IsWeekend{
        //! Enumerazioni
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        boolean isWeek;

        IsWeekend(boolean isWeek) {this.isWeek = isWeek;}

        public boolean getIsWeek() {return isWeek;} //! Ottieni il bool value
        public void setWeek(boolean week) {isWeek = week;}

        public IsWeekend printWeekendDay(boolean w){
            if(w){
                System.out.println("it's a weekend day");
            }else{
                System.out.println("it's not a weekend day");
            }
            return null;
        }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here
        Operator plus = Operator.ADD;
        Operator sub = Operator.SUBTRACT;
        Operator multi = Operator.MULTIPLY;
        Operator div = Operator.DIVIDE;

        double num1 = 5;
        double num2 = 2;

//! 3) lavorando con le variabili, e quindi poi passandogli una variabile al metodo, la quale contiene un enum
        plus.riconosciVariabile(num1, plus, num2);
        plus.riconosciVariabile(num1, sub, num2);
        plus.riconosciVariabile(num1, multi, num2);
        plus.riconosciVariabile(num1, div, num2);

//! 1) Modo per passare un operatore ad un metodo, estraendo il tipo di operatore, quindi lavorando con il construct
//        Operator.ADD.segno(num1,Operator.ADD.getOp(), num2);
//        Operator.ADD.segno(num1,Operator.SUBTRACT.getOp(), num2);
//        Operator.ADD.segno(num1,Operator.MULTIPLY.getOp(), num2);
//        Operator.ADD.segno(num1,Operator.DIVIDE.getOp(), num2);

//! 2) Modo senza lavorare con il construct
//        Operator.ADD.operation(num1,Operator.ADD,num2);
//        Operator.ADD.operation(num1,Operator.SUBTRACT,num2);
//        Operator.ADD.operation(num1,Operator.MULTIPLY,num2);
//        Operator.ADD.operation(num1,Operator.DIVIDE,num2);

    }
}
