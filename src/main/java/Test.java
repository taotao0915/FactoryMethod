public class Test {
    public static void main(String[] args) {
        FruitFactory appleFactory = new AppleFactyory();
        appleFactory.provide().get();
        FruitFactory bananaFactory = new BananaFactyory();
        bananaFactory.provide().get();
    }
}
