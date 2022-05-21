
import org.junit.Assert;
import org.junit.Test;
public class coffeeMachineTest {
    @Test
    public void test1() {
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("machine is turned on", c.poweron());
    }

    @Test
    public void test2() {
        coffeeMachine c = new coffeeMachine();
        c.Power = true;
        Assert.assertEquals("Error", c.poweron());
    }

    @Test
    public void test3() {
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("press the power button", c.insert(50));
    }

    @Test
    public void test4() {
        coffeeMachine c = new coffeeMachine();
        c.poweron();
        Assert.assertEquals("money inserted", c.insert(50));
    }

    @Test
    public void test5() {
        coffeeMachine cm = new coffeeMachine();
        cm.poweron();
        cm.poweroff();
        Assert.assertEquals("press the power button", cm.insert(50));
    }

    @Test
    public void test6() {
        coffeeMachine cm = new coffeeMachine();
        Assert.assertEquals("machine is turned on", cm.poweron());
        Assert.assertEquals("money inserted", cm.insert(50));
    }

    @Test
    public void test7() {
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("machine is turned on", c.poweron());
        Assert.assertEquals("money inserted", c.insert(50));
        Assert.assertEquals("machine is turned off", c.poweroff());
    }

    @Test
    public void test8() {
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("press the power button", c.Coffeemaker(2));
    }

    @Test
    public void test9() {
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("machine is turned on", c.poweron());
        Assert.assertEquals("money inserted", c.insert(120));
        Assert.assertEquals(3 + " coffee are ready", c.Coffeemaker(3));
    }

    @Test
    public void test10() {
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("machine is turned on", c.poweron());
        Assert.assertEquals("money inserted", c.insert(120));
        Assert.assertEquals(3 + " coffee are ready", c.Coffeemaker(4));
    }

    @Test
    public void test11() {
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("machine is turned on", c.poweron());
        Assert.assertEquals("money inserted", c.insert(50));
        Assert.assertEquals(1 + " coffee are ready", c.Coffeemaker(1));
    }

    @Test
    public void test12() {
        coffeeMachine c = new coffeeMachine();
        Assert.assertEquals("machine is turned on", c.poweron());
        Assert.assertEquals("money inserted", c.insert(150));
        Assert.assertEquals(3 + " coffee are ready", c.Coffeemaker(3));
        Assert.assertEquals("machine is turned off", c.poweroff());
    }
}