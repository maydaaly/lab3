import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class atmmachineTest {
    atmmachine x;
    operation1 w;
    operation2 d;
    @BeforeEach
    public void ATM() {
        x = new atmmachine();
        d = new operation2();
        w = new operation1();
    }
    class amount{
        int moneyy (int x){
            return Math.max(x, 0);
        }
    }
    @Test
    public void balance (){
        amount y = new amount();
        x.operations(2,y.moneyy(7000));
        Assertions.assertEquals(x.balance, 7000.0);
    }
    @Test
    public void withdraw(){
        amount y = new amount();
        double z =w.withdraw(1500,y.moneyy(3000));
        Assertions.assertEquals(z,1500.0);
    }
    @Test
    public void deposit(){
        amount y = new amount();
        double z = d.deposit(4600,y.moneyy(9000));
        Assertions.assertEquals(z,13600.0);
    }
    @AfterEach
    public void clean(){
        x=null ;
    }
}
