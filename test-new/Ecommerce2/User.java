package Ecommerce2;

public class User {
    public static void main(String[] args) {
        System.out.println("    ");
        System.out.println("OPPO Features");

        // Oppo ne = new Oppo();
        // ne.configure();

        // Oppo ne = new Oppo();
        // ne.configure();
        // ne.mobilePrice();
        // ne.mobileRAM();
        // ne.mobileROM();
        // ne.mobilebatteryCapacity();

        Mobiles Oppo = new Oppo();
        Oppo.configure();
        Oppo.mobilePrice();
        Oppo.mobileRAM();
        Oppo.mobileROM();
        Oppo.mobilebatteryCapacity();

        System.out.println("  ");

        System.out.println(" -------REDMI Features ------");
        Mobiles Redmi = new Redmi();
        Redmi.configure();
        Redmi.mobilePrice();
        Redmi.mobileRAM();
        Redmi.mobileROM();
        Redmi.mobilebatteryCapacity();

        System.out.println("  ");
        System.out.println("----- VIVO Features ------");
        Mobiles Vivo = new Vivo();
        Vivo.configure();
        Vivo.mobilePrice();
        Vivo.mobileRAM();
        Vivo.mobileROM();
        Vivo.mobilebatteryCapacity();
    }

}
