package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println("object 1 "+singleton);
        singleton = Singleton.getInstance();
        System.out.println("object 2 "+singleton);

    }
}
