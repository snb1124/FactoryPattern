package design.simpleFactory;

public class UnknownMenu implements Burger{


    @Override
    public void prepare() {
        System.out.println("메뉴에 없는 주문입니다. ");
    }
}
