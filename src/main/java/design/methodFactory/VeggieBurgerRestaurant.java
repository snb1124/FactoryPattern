package design.methodFactory;

public class VeggieBurgerRestaurant extends Restaurant {


    @Override
    public Burger createBurger() {

        return new VeggieBurger();
    }
}
