package lab3.decorator;

public class Chocolate extends Topping{
    public Chocolate(Beverage mainBeverage) {
        super("choco", 5, mainBeverage);
    }
}
