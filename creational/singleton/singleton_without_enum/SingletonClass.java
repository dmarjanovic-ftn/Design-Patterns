package creational.singleton.singleton_without_enum;

public class SingletonClass {

    private SingletonClass() {
        this.attribute = "test";
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }

    private static SingletonClass instance = null;
    private String attribute;

}
