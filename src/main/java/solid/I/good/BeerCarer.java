package solid.I.good;

public class BeerCarer implements BearFeeder, BearCleaner{
    @Override
    public void washBeer() {
        System.out.println("wash time");
    }

    @Override
    public void feedBeer() {
        System.out.println("clean time");
    }
}
