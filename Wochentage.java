package alextestquestions;

public class Wochentage {

    public static void berechnung(int tag, int monat, int jahr) {

        int w = 0;  // 0==sonntag, 6==samstag
        int d = tag;
        int m = monat;
        int c = jahr / 100; //jahrzehnt
        int y = jahr - (jahr / 100) * 100;

        if (m < 3) {
            m = m + 12;
            if (y == 0) {
                c = c - 1;
                y = 99;
            } else {
                y = y - 1;
            }
        }
        w = (d + (26 * (m + 1)) / 10 + (5 * y) / 4 + c / 4 + 5 * c - 1) % 7;

        switch (w) {
            case 0:
                System.out.println("Sonntag");
                break;
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnestag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            default:
                System.out.println("nan");
        }
    }

    public static void main(String[] args) {

        int d = 31;
        int m = 7;
        int y = 1990;

        berechnung(d, m, y);

    }
}
