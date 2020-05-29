public class BananaFactyory implements FruitFactory {

    @Override
    public Fruit provide() {
        return new Banana();
    }
}
