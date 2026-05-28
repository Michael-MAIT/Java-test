public class Primaerzahlen {
    public static void main(String[] args) {
        for (int i=2; i<100;i++) {
            boolean primaerzahl = true;
            for (int x=2; x<i; x++) {
                if (i%x==0) {
                    primaerzahl = false;
                break;
                }
            }
            if (primaerzahl == true) {
            System.out.println(i);
            }
        }
    }
}