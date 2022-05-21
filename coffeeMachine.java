public class coffeeMachine {
     float money;
     private final float price = 40;
     boolean Power = false;
     boolean Light = false;
     boolean Busy = false;
     int coffee;

    public String insert(float money){
        if(Power) {
            this.money = money;
            return "money inserted";
        }
        else{
            return "press the power button";
        }
    }
    public String poweron(){
        if(!Power) {
            Power = true;
            Light = true;
            return "machine is turned on";
        }
        else{
            return "Error";
        }
    }
    public String poweroff(){
        if(Power) {
            Light = false;
            Power = false;
            return "machine is turned off";
        }
        else{
            return "Error";
        }
    }
    public String Coffeemaker(int coffee){
        if(Power) {
            int i= 0;
            if (money >= price) {
                while(money>= price && coffee > 0){
                    money -= price;
                    Busy = true;
                    coffee --;
                    i++;
                }
            }
            else {
                return "no enough money";
            }
            Busy = false;
            return i+ " coffee are ready";
        }
        else{
            return "press the power button";
        }
    }
}
