package singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.somethingMethod();
    }

}