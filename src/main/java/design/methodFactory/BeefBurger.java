package design.methodFactory;



public class BeefBurger implements Burger {

    @Override
    public void prepare() {
            System.out.println("소고기버거가 준비중");
    }

}

