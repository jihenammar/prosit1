import java.util.Scanner;

public class ZooManagement {

    int nbrCages;
    String zooName;

    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        while (true) {
            try {
                zoo.nbrCages = Integer.parseInt(scanner.nextLine());
                if (zoo.nbrCages > 0) {
                    break;
                } else {
                    System.out.println("Veuillez entrer un nombre positif.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
            }
        }

        scanner.close();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");
    }
}
