public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("Sefiller", "Victor Hugo", 2000, 500);
        System.out.println("Kitap1 stokta mi: " + kitap1.kitapStoktaMi());
        System.out.println("Kitap1 stokta mi: " + kitap1.kitapStoktaMi());
        
        System.out.println("Kitap 1 alabilir miyiz: " + kitap1.kitabiAl());
        System.out.println("Kitap1 stokta mi: " + kitap1.kitapStoktaMi());

        System.out.println("Kitap 1 alabilir miyiz: " + kitap1.kitabiAl());
        System.out.println("Kitap1 stokta mi: " + kitap1.kitapStoktaMi());

        Kitap kitap2 = new Kitap("Kizil", "Stefan Zweig", 2005, 100);
        kitap2.print();
        System.out.println("Kitap2 stokta mi: " + kitap2.kitapStoktaMi());

        kitap1.kitapVer();
        System.out.println("Kitap1 stokta mi: " + kitap1.kitapStoktaMi());
        
        kitap1.print();

    }
}
