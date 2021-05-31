package lab3.decorator;

public class Whip extends Topping{
    public Whip(Beverage mainBeverage) {
        super("cream", 2, mainBeverage);
    }
}
