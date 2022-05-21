public class operation2 {
    public double deposit(double deposit, double balance) {
        if (deposit > 1000 && deposit < 10000) {
            balance = balance + deposit;
            return balance;
        } else System.out.print("enter a valid amount of money ");
        return balance;
    }
}


