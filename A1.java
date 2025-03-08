public class A1 {
    private final String name;
    private final String friend;

    public A1(String name, String friend) {
        this.name = name;
        this.friend = friend;
    }

    public void hello() {
        System.out.println("hello " + friend + "my name is " + name);
    }
}
