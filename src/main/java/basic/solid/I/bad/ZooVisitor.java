package basic.solid.I.bad;

public class ZooVisitor implements BeerKeeper{
    @Override
    public void washBeer() {
        //todo unsupproted
    }

    @Override
    public void feedBeer() {
        System.out.println("feed");
    }

    @Override
    public void petBeer() {
        //todo pet is not allowed
    }
}
