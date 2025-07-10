package Ecommerce2;

public class Vivo extends CommonForCompanies implements Mobiles {
    // // int price = 15000;
    // // int RAM = 16;
    // // int ROM = 128;
    // // int batteryCap = 5000;

    // private int price;
    // private int RAM;
    // private int ROM;
    // private int batteryCap;

    // public int getPrice(int price) {
    // return price;
    // }

    // public void setPrice(int price) {
    // this.price = price;
    // }

    // public int getRAM() {
    // return RAM;
    // }

    // public void setRAM(int rAM) {
    // RAM = rAM;
    // }

    // public int getROM() {
    // return ROM;
    // }

    // public void setROM(int rOM) {
    // ROM = rOM;
    // }

    // public int getBatteryCap() {
    // return batteryCap;
    // }

    // public void setBatteryCap(int batteryCap) {
    // this.batteryCap = batteryCap;
    // }

    public void configure() {
        setPrice(16000);
        setRAM(16);
        setROM(128);
        setBatteryCap(6000);
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
}
