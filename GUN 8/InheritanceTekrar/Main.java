public class Main {
    public static void main(String[] args) {
        Ev ev1 = new Ev(2, 1, 100, "Klasik", true);
        //ev1 = new Ev(3, 1, 100, "Klasik", true);
        System.out.println(ev1.getMetrekare());
        //ev1.metrekare = 10;
        //ev1.setMetrekare(10);
        System.out.println(ev1);

        IkiOdaliEv ikiOdaliEv1 = new IkiOdaliEv(1, 90, "Modern", true, true);
        System.out.println(ikiOdaliEv1.getOdaSayisi());
        System.out.println(ikiOdaliEv1);
        ikiOdaliEv1.setOdaSayisi(3);
        System.out.println(ikiOdaliEv1);

        BirBalkonlu birBalkonlu = new BirBalkonlu(80, "Amerikan", false, false, true);
        System.out.println(birBalkonlu.toString());
    }
}
