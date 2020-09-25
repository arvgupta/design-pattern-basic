package decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Caramel caramel=new Caramel(new Espresso());//if new instead of Espresso we can pass it
        System.out.println("cost of caramel "+caramel.cost());
    }
}
