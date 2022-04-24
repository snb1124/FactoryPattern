package design.abstractFactory;

public class KoreaDoorProduct extends DoorProduct{

    @Override
    public void makeAssemble() {
        System.out.println("한국산 문짝 장착중");
    }
}
