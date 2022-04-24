package design.abstractFactory;

public class Assembly {
    public static void main(String args[]){
        Factory korf = new KoreaFactory();
        korf.creatDoor();


        Factory usf = new UsFactory();
        usf.creatTire();
    }
}
