public class Primzahlen {
    public static void main(String[] args) {
        for (int i=2; i<100;i++) {
            boolean primzahl = true;
            for (int x=2; x<i; x++) {
                if (i%x==0) {
                    primzahl = false;
                break;
                }
            }
            if (primzahl == true) {
            System.out.println(i);
            }
        }
    }
}