package Ecommerce;

public class Oppo implements Mobiles {
    int price;
    int RAM;
    int ROM;
    int batteryCap;

    public Oppo() {
        // price = 12000;
        // RAM = 16;
        // ROM = 124;
        // batteryCap = 5000;
    }

    public Oppo(int price, int RAM, int ROM, int batteryCap) {
        this.price = price;
        this.RAM = RAM;
        this.ROM = ROM;
        this.batteryCap = batteryCap;
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

    // public void disp() {
    // System.out.println("Mobile Price");
    // System.out.println("Mobile RAM ");
    // System.out.println("Mobile ROM");
    // System.out.println("Mobile Battery");
    // }

}
