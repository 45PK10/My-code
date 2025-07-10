package Ecommerce2;

public class Oppo extends CommonForCompanies implements Mobiles {
    // private int price;
    // private int RAM;
    // private int ROM;
    // private int batteryCap;

    // // public Oppo() {
    // // // price = 12000;
    // // // RAM = 16;
    // // // ROM = 124;
    // // // batteryCap = 5000;
    // // }

    // // public Oppo(int price, int RAM, int ROM, int batteryCap) {
    // // this.price = price;
    // // this.RAM = RAM;
    // // this.ROM = ROM;
    // // this.batteryCap = batteryCap;
    // // }

    public void configure() {
        System.out.println("Configure Mobile");
        setPrice(12000);
        setRAM(16);
        setROM(128);
        setBatteryCap(5000);

    }

    public void mobilePrice() {
        System.out.println("Mobile Price - " + getPrice() + "/-");
    }

    public void mobileRAM() {
        System.out.println("Mobile RAM - " + getRAM() + "GB");
    }

    public void mobileROM() {
        System.out.println("Mobile ROM - " + getROM() + "GB");
    }

    public void mobilebatteryCapacity() {
        System.out.println("Mobile Battery Capacity - " + getBatteryCap() + "mAh");
    }

    // public void disp() {
    // System.out.println("Mobile Price");
    // System.out.println("Mobile RAM ");
    // System.out.println("Mobile ROM");
    // System.out.println("Mobile Battery");
    // }

}
