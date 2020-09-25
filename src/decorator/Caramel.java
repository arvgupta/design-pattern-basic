package decorator;

public class Caramel extends AddOnDecorator{

    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost()+2;
    }
}
