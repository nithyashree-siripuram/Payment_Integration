package SESD_Labtest;
interface wallet_payment {
    void payment(int amount);
}
class card_payment implements wallet_payment {
    public void payment(int amount) {
        if (amount>0) {
            System.out.println("Sent amount is " + amount * 100 + " paise");
        } else {
            System.out.println("Amount should be positive");
        }
    }
}
class UPI_payment implements wallet_payment {
    public void payment(int amount) {
        if (amount>0) {
            System.out.println("Sent amount is " + amount + " rupees");
        } else {
            System.out.println("Amount should be positive");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the payment type:");
        System.out.println("1. Card Payment");
        System.out.println("2. UPI Payment");
        int ch = sc.nextInt();
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        wallet_payment payment;
        switch (ch) {
            case 1:
                payment = new card_payment();
                payment.payment(amount);
                break;
            case 2:
                payment = new UPI_payment();
                payment.payment(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}

}