import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.isim = "hasan";
        person1.yas = 20;

        Person person2 = new Person();
        person2.isim = "hasan";
        person2.yas = 20;
        
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(new Scanner(System.in)));
        System.out.println(person1.esitMi(person2));

        //person1 = person2;
        //System.out.println(person1 == person2);
    }
}

/*
 * DEFAULT EQUALS METOTUNUN ICERIGI:
 * public boolean equals(Object object){
 *  return this == object;
 * }
 * 
 */