import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj x: ");
        int x = scan.nextInt();
        System.out.println("Podaj y: ");
        int y = scan.nextInt();
        scan.close();
        if (x > 0 && y > 0) {
            System.out.println("Punkt który podałeś leży w I ćwiartce");
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt który podałeś leży w II ćwiartce");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt który podałeś leży w III ćwiartce");
        } else if (x > 0 && y < 0) {
            System.out.println("Punkt który podałeś leży w IV ćwiartce");
        } else if (x == 0 && y == 0) {
            System.out.println("Punkt który podałeś jest początkiem układu współrzędnych");
        } else if (x == 0 && y != 0) {
            System.out.println("Współrzędna x znajduje się na osi");
        } else if (y == 0 && x != 0) {
            System.out.println("Współrzędna y znajduje się na osi");
        }
    }
}
