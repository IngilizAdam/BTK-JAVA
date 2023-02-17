import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String okunan = in.nextLine();
        okunan = okunan.toLowerCase();

        // sesli harfler = a, e, i, u, o

        int sesliHarfSayisi = 0;
        for(int i = 0; i < okunan.length(); i++){
            char karakter = okunan.charAt(i);
            if(karakter == 'a' || karakter == 'e' || karakter == 'i'|| karakter == 'u' || karakter == 'o'){
                sesliHarfSayisi++;
            }
            System.out.println((i+1) + " tane karakteri kontrol ettim ve " + sesliHarfSayisi + " tane sesli harf buldum");
            try{
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(sesliHarfSayisi + " tane sesli harf var");
        System.out.println((okunan.length() - sesliHarfSayisi) + " tane sessiz harf var");
    }
}
