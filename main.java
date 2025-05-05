import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop laptop;

        System.out.println("Pilih laptop: [1] ASUS [2] Toshiba [3] MacBook");
        int pilihan = input.nextInt();
        input.nextLine(); // konsumsi newline

        switch (pilihan) {
            case 1:
                laptop = new ASUS();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            case 3:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak valid. Default ASUS digunakan.");
                laptop = new ASUS();
        }

        String command = "";
        do {
            System.out.print("Input command [ON, OFF, UP, DOWN, EXIT]: ");
            command = input.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    laptop.powerOn();
                    break;
                case "OFF":
                    laptop.powerOff();
                    break;
                case "UP":
                    laptop.volumeUp();
                    break;
                case "DOWN":
                    laptop.volumeDown();
                    break;
                case "EXIT":
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Perintah tidak dikenali.");
            }

        } while (!command.equals("EXIT"));
    }
}
