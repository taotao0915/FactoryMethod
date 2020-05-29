public class AppleFactyory implements FruitFactory {

    @Override
    public Fruit provide() {
        return new Apple();
    }
}
