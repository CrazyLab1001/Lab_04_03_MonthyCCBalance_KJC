public class Main {
    public static void main(String[] args) {
        double creditCardBalance = 5000.00;
        double INTEREST_RATE = .17;
        double interestDue = creditCardBalance * INTEREST_RATE;
        System.out.println("You'd owe " + interestDue + " after one month.");
        creditCardBalance = interestDue + creditCardBalance;
        interestDue = creditCardBalance * INTEREST_RATE;
        System.out.println("You'd owe " + interestDue + " after two months.");
    }
}