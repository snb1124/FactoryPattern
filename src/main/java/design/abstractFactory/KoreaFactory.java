package design.abstractFactory;

public class KoreaFactory extends Factory{

    KoreaFactory(){
        System.out.println("한국 공장에서 생성되는 제품입니다");
    }

    @Override
    public TireProduct creatTire() {
        System.out.println("한국산 타이어");
        return new KoreaTireProduct();
    }

    @Override
    public DoorProduct creatDoor() {
        System.out.println("한국산 문짝");
        return new KoreaDoorProduct();
    }
}
