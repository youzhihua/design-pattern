package decorate;

public class Earrings implements Clothes{
    @Override
    public void clothesDes() {
        System.out.println("这是一对金闪闪的耳环");
    }

    @Override
    public void clothesEffect() {
        System.out.println("这对耳环可以增加十点智力和30点魅力");
    }
}
