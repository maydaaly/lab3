public class operation1 {
    double withdraw(double withdraw, double balance) {
        if (withdraw > 100 && withdraw < 7000) {
            if (balance >= withdraw)
                return balance - withdraw;
            else System.out.print("there's no enough money");
            return balance;
        } else System.out.print("enter a valid amount of money");
        return balance;
    }
}
