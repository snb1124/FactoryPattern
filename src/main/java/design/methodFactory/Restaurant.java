package design.methodFactory;

public abstract class Restaurant {
    public Burger orderBurger() {

            Burger burger = createBurger();
            return burger;

    }
    public abstract Burger createBurger();

    public static void main(String args[]){
        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();

        beefBurger.prepare();
    }
}

