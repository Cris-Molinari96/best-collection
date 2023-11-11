package _1_javaExerciseForGithub._1_javaBasic._17_otherUsefulType;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }
    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!
        accountBanck(questionableFundsEuro);
    }
    static void accountBanck(long question){
        System.out.println(question);
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age                                                                                         --> short
     *    2b: The age of a baby in months                                                                 --> byte
     *    2c: Money in a hedgefund in euros                                                            --> long
     *    2d: Price of a good in euros on amazon.com                                          --> float
     *    2e: The exact weight of an apple measured by scientific equipment --> double
     *    2f: The number of kilometers from any 2 places in the world              --> short
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate myBirthday = LocalDate.of(1996, Month.DECEMBER, 18);
        LocalDate todayDate = LocalDate.now();
        isYourBirthday(todayDate, myBirthday);



        LocalDate newDate = LocalDate.now();
        myDate(newDate);
        boolean checkDate = todayDate.isBefore(myBirthday);


        System.out.println(checkDate);
    }

    static LocalDate myDate(LocalDate date) {

        System.out.println(" The day of this month is : " + date.getDayOfMonth());
        System.out.println(" The day of this week is : " + date.getDayOfWeek());
        System.out.println(" The day of this year is : " + date.getDayOfYear());
        System.out.println(" This month is : " + date.getMonth());
        System.out.println(" The value of month is : " + date.getMonthValue());

        return date;

    }
        static void isYourBirthday(LocalDate date, LocalDate compareDate){

            if((date.getDayOfMonth() == compareDate.getDayOfMonth()) && (date.getMonth() == compareDate.getMonth()) ){
                System.out.println("It's your birthday today");
            }else {
                System.out.println("It's not your birthday" +"\n" + "Today is : " + date.getDayOfMonth() + "\n Your birthday is : "  + compareDate.getDayOfMonth());
            }
    }
}

