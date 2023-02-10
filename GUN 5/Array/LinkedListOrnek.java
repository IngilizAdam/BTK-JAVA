import java.util.LinkedList;

public class LinkedListOrnek {
    public static void main(String[] args) {
        LinkedList bagliListe = new LinkedList<Integer>();
        System.out.println("Boyut: " + bagliListe.size());
        bagliListe.add(5);
        System.out.println("0. Indexteki Eleman: " + bagliListe.get(0));
        System.out.println("Boyut: " + bagliListe.size());
    }
}
