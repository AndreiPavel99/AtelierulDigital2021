package lab3.factory;

public class EuropeanPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type){
        Pizza pizza = null;

        switch(type){
            case "Sweet":
                pizza = new QuatroPizza();
                break;
            case "ChickenPizza":
                pizza = new SimplePizza();
                break;
            default:
                pizza = new SimplePizza();
        }

        return pizza;
    }
}
