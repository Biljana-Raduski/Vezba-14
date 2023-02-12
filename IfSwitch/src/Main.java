public class Main {
    public static void main(String[] args) {

        int x = 523134;
        int y = 325423;

        if (x % y == 0) {
            System.out.println("Ostatak deljenja ne postoji");

        } else if (x % y > 1000) {
            System.out.println("Ostatak deljenja je veci od 1000");

        } else System.out.println("Ostatak deljenja je manji od 1000");
    }
}