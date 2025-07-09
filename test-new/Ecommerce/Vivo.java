package Ecommerce;

public class Vivo extends Oppo {
    // int price = 15000;
    // int RAM = 16;
    // int ROM = 128;
    // int batteryCap = 5000;

    public Vivo() {

    }

    public Vivo(int price, int RAM, int ROM, int batteryCap) {
        super(price, RAM, ROM, batteryCap);
    }

    public void mobilePrice() {
        System.out.println("Mobile Price - " + price + "/-");
    }

    public void mobileRAM() {
        System.out.println("Mobile RAM - " + RAM + "GB");
    }

    public void mobileROM() {
        System.out.println("Mobile ROM - " + ROM + "GB");
    }

    public void mobilebatteryCapacity() {
        System.out.println("Mobile Battery Capacity - " + batteryCap + "mAh");
    }
}
