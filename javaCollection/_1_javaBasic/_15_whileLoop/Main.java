package _1_javaExerciseForGithub._1_javaBasic._15_whileLoop;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     *
     *     Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 5;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        while (yearsPast <= 5 || currentInvestmentValueEuros <= 15000 ) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;

        }
    }

    /**
     * 2: Write a while loop for our trading bot!
     *
     *    The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     *
     *    It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     *    It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     *
     *    On days where it sells, it can only sell 1000 pounds for euros.
     *
     *    Write a while loop
     *
     *    Use the calculation for exchange rate below
     *    1 + (Math.random() * 0.2);
     *
     *    to recalculate our rate every day (once per loop)
     *
     *    Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;

        // Write your while loop here

System.out.println(poundToEuroExchangeRate);
if(poundToEuroExchangeRate < 1.15){

    while(remainingPoundsToSell > 0){
        daysToSell++;
        maxPoundsToSellPerDay = (int) (Math.random() * 1000) + 1;
        remainingPoundsToSell -= maxPoundsToSellPerDay; // --> come faccio a farli prendere solo le sterline rimanenti e non creare un numero negativo ?
        System.out.println("Giorni trascorsi = " + daysToSell + " Sterline rimaste = " + remainingPoundsToSell + " Sterline vendute oggi = " + maxPoundsToSellPerDay);
    }

}else {
    System.out.println("pound To Euro Exchange Rate" + "> 1.15");
}

        System.out.println("It took " + daysToSell + " to exit that cursed economy");
    }

    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: fori
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     // A1: for i, perchè magari potrei accedere alla length mostrandomi tutti gli elementi che ho nell'array?
                    o anche un foreach ciclando le azioni che ha a disposizione ogni utente?
     *
     *
     * Q2: We have a _1_list of 1000 users to send emails to
     * A2: foreach credo forse sia un caso d'utilizzo migliore, meno sintassi da rispettare, ciclo uno user alla volta
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: utilizzerei while, impostandogli la condizione > 80 in modo che quando viene verificata esce dal ciclo
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4:  do while ? forse perchè non gli carico il file quindi la condizione dev'essere prima verificata ?
     */
}
