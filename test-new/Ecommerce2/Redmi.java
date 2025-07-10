package Ecommerce2;

public class Redmi extends CommonForCompanies implements Mobiles {
    public void configure() {
        setPrice(20000);
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

}
