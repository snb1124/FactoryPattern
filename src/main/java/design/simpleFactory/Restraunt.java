package design.simpleFactory;

public class Restraunt{

    public Burger orderBurger(String request) {
        int productId;
        String addOns;
        Burger burger =null;

        if ("BEEF".equals(request)) {
            burger = new BeefBurger();
            burger.prepare();
            return burger;
        } else if ("VEGGIE".equals(request)) {
             burger = new VeggieBurger();
            burger.prepare();
            return burger;
        } else {
            return burger = new UnknownMenu();
        }
    }
    public static void main(String args[]){
        Restraunt order = new Restraunt();

        order.orderBurger("BEEF");
    }

}
