public class atmmachine {
    double balance = 0;
    operation1 w = new operation1();
    operation2 d = new operation2();
    boolean pass = false;
    boolean validCard = true;
    boolean ValidPassword = true;

    public String insertCard() {
        if (validCard) {
            return "welcome to CIB atm machine ";
        } else {
            return "not a valid card";
        }
    }

    public String Password() {
        if (validCard) {
            System.out.println("Enter Password");
            if (ValidPassword) {
                pass = true;
                return "user logged in";
            } else {
                return "Wrong password";
            }
        } else {
            return "try again";
        }
    }

    public double operations(int x, double money) {
        switch (x) {
            case 1:
                this.balance = w.withdraw(money, balance);
            case 2:
                this.balance = d.deposit(money, balance);
        }
        return balance;
    }
}
