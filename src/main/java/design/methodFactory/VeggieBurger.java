package design.methodFactory;


public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("야채버거가 준비중");
    }
}
