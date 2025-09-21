
public class main
{
    public static void main(String[] args) {
        int startingBalance = 5000;
        int interestRate = (int) 0.17;
        System.out.println("interest rate due after first month" + (startingBalance * interestRate));
        System.out.println("interest rate due after two month" + ((startingBalance + startingBalance * interestRate) * interestRate));

        }
    }
