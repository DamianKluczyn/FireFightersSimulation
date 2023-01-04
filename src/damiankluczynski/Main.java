package damiankluczynski;

import damiankluczynski.units.AllUnits;
import damiankluczynski.strategies.Fire;
import damiankluczynski.strategies.Local;
import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.System.exit;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AllUnits allUnits = new AllUnits();

        double xMax = 50.154564013341734;
        double xMin = 49.95855025648944;
        double yMax = 20.02470275868903;
        double yMin = 19.688292482742394;

        while (true) {
            System.out.println("\n1. Sekunda symulacji");
            System.out.println("0. Exit");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    double[] coords = new double[2];
                    coords[0] = xMin + (Math.random() * (xMax - xMin + 1));
                    coords[1] = yMin + (Math.random() * (yMax - yMin + 1));

                    if (random() < 0.3) {
                        System.out.println("Zdarzenie PZ: " + coords[0] + ", " + coords[1]);
                        allUnits.setStrategy(new Fire());
                        allUnits.start(coords);
                    } else {
                        System.out.println("Zdarzenie MZ: " + coords[0] + ", " + coords[1]);
                        allUnits.setStrategy(new Local());
                        allUnits.start(coords);
                    }
                    allUnits.step();
                    break;
                case 0:
                    exit(0);
                default:
                    System.out.println("Zla opcja");
                    break;
            }

        }
    }
}