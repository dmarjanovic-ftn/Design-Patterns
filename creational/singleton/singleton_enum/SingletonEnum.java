package creational.singleton.singleton_enum;

public enum SingletonEnum {
    INSTANCE;

    public void printHelloMessage() {
        System.out.println("Hello, friend!");
        message = "Hello, it's me...";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
