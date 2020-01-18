import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de pagini:");
        int maxPage = scanner.nextInt();
        scanner.nextLine();

        Proiector sony = new Proiector("usb", "vga", maxPage);
        Telecomanda telecomanda = new Telecomanda(sony);

        System.out.print("Introduceti o comanda: ");
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("switch on")) {
                telecomanda.switchOn();
            }
            else if (line.equalsIgnoreCase("switch off")) {
                telecomanda.switchOff();
            }
            else if (line.equalsIgnoreCase("show sources")) {
                telecomanda.showSources();
            }
            else if (line.startsWith("select source:")) {
                String source = line.substring(line.indexOf(":") + 1);
                telecomanda.selectSource(source);
            }
            else if (line.equalsIgnoreCase("volume up")) {
                telecomanda.volumeUp();
            }
            else if (line.equalsIgnoreCase("volume down")) {
                telecomanda.volumeDown();
            }
            else if (line.equalsIgnoreCase("zoom in")) {
                telecomanda.zoomIn();
            }
            else if (line.equalsIgnoreCase("zoom out")) {
                telecomanda.zoomOut();
            }
            else if (line.equalsIgnoreCase("page up")) {
                telecomanda.pageUp();
            }
            else if (line.equalsIgnoreCase("page down")) {
                telecomanda.pageDown();
            }
            else if (line.equalsIgnoreCase("freeze")) {
                telecomanda.freeze();
            }
            else if (line.equalsIgnoreCase("unfreeze")) {
                telecomanda.unfreeze();
            } else {
                System.out.println("Comanda introdusa este gresita.");
            }
            System.out.print("Introduceti o alta comanda: ");
        }
    }
}
