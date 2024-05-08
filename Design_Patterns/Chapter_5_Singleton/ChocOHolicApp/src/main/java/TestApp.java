public class TestApp {
    public static void main(String[] args) {
        ChocolateBoiler cb1 = ChocolateBoiler.getInstance();
        ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
        System.out.println(cb1);
        System.out.println(cb2);
    }
}
