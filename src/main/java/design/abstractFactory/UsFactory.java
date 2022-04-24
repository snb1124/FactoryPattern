package design.abstractFactory;

public class UsFactory extends Factory{
    UsFactory(){
        System.out.println("미국산 제품 입니다.");
    }
    @Override
    public TireProduct creatTire() {
            System.out.println("미국산 타이어 입니다");
        return new UsTireProduct();
    }

    @Override
    public DoorProduct creatDoor() {
        System.out.println("미국산 문짝 입니다");
        return null; // 졸려.,.
    }
}
