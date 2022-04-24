package design.abstractFactory;

public class UsTireProduct extends TireProduct{

    @Override
    public void makeAssemble() {
        System.out.println("미국산 타이어 장착");
    }
}
