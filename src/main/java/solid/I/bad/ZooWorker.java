package solid.I.bad;

public class ZooWorker implements BeerKeeper{
    @Override
    public void washBeer() {
        System.out.println("wash");
    }

    @Override
    public void feedBeer() {
        System.out.println("feed");
    }

    @Override
    public void petBeer() {
        System.out.println("pet");
    }
}
