package indohome;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        Thosiba thosiba = new  Thosiba();
        Macbook macbook = new Macbook();
        LaptopUser lnv = new LaptopUser(lenovo);
        LaptopUser tsb = new LaptopUser(thosiba);
        LaptopUser mcbk = new LaptopUser(macbook);
        Scanner sc = new Scanner(System.in);
        String pilihan;
        do {
            System.out.println("Pilih merk Laptop: ");
            System.out.println("1. Lenovo");
            System.out.println("2. Toshiba");
            System.out.println("3. Macbook");
            System.out.println("4. Exit");
            System.out.print("Pilihan: ");
            pilihan = sc.nextLine();
            switch (pilihan) {
                case "1":
                    System.out.println("Pilih Menu:  ");
                    System.out.println("1. Power ON");
                    System.out.println("2. Power OFF");
                    System.out.println("3. Volume UP");
                    System.out.println("4. Volume DOWN");
                    System.out.println("5. Exit");
                    System.out.print("Pilihan: ");
                    pilihan = sc.nextLine();
                    switch (pilihan) {
                        case "1":
                            lnv.turnOnLaptop();
                            break;
                        case "2":
                            lnv.turnOffLaptop();
                            break;
                        case "3":
                            lnv.makeLaptopLouder();
                            break;
                        case "4":
                            lnv.makeLaptopSilent();
                            break;
                        case "5":
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Pilih Menu: ");
                    System.out.println("1. Power ON");
                    System.out.println("2. Power OFF");
                    System.out.println("3. Volume UP");
                    System.out.println("4. Volume DOWN");
                    System.out.println("5. Exit");
                    System.out.print("Pilihan: ");
                    pilihan = sc.nextLine();
                    switch (pilihan) {
                        case "1":
                            tsb.turnOnLaptop();
                            break;
                        case "2":
                            tsb.turnOffLaptop();
                            break;
                        case "3":
                            tsb.makeLaptopLouder();
                            break;
                        case "4":
                            tsb.makeLaptopSilent();
                            break;
                        case "5":
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                    break;
                case "3":
                    System.out.println("Pilih Menu: ");
                    System.out.println("1. Power ON");
                    System.out.println("2. Power OFF");
                    System.out.println("3. Volume UP");
                    System.out.println("4. Volume DOWN");
                    System.out.println("5. Exit");
                    System.out.print("Pilihan: ");
                    pilihan = sc.nextLine();
                    switch (pilihan) {
                        case "1":
                            mcbk.turnOnLaptop();
                            break;
                        case "2":
                            mcbk.turnOffLaptop();
                            break;
                        case "3":
                            mcbk.makeLaptopLouder();
                            break;
                        case "4":
                            mcbk.makeLaptopSilent();
                            break;
                        case "5":
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                    break;

                case "4":

                    System.out.println("Exit");
                    break;

                default:

                    System.out.println("Pilihan tidak ada");
                    break;
            }

        } while (!pilihan.equals("4"));
    }
}
//Nama: Piky Paelani
//Kelas: TI22J