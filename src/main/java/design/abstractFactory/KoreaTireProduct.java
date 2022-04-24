package design.abstractFactory;

public class KoreaTireProduct extends TireProduct{


    @Override
    public void makeAssemble() {
        System.out.println("한국산타이어 장착");
    }
}
