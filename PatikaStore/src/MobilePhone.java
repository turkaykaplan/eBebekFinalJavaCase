import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone extends MobilePhoneProducts {
    private static final ArrayList<MobilePhone> allMobilePhones = new ArrayList<>();
    private  Scanner input = new Scanner(System.in);

    public MobilePhone() {}

    public MobilePhone(int id, String name, double price, int discountRate, int stock, double screenSize, int ram, int memory, BrandList brand, int battery, String color) {
        super(id, name, price, discountRate, stock, screenSize, ram, memory, brand, battery, color);
    }

    public void menuMobilePhone() {
        System.out.println("1-Cep Telefonu Ekle\n" + "2-Cep Telefonu Sil\n" + "3-Cep Telefonu Listesi\n" + "4-Markaya göre Cep Telefonu filtrele\n");
        System.out.println();
        System.out.print("Seçiminiz: ");
        int select = input.nextInt();
        switch (select) {
            case 1:
                addMobilePhoneItem();
                break;
            case 2:
                deleteMobilePhoneItem();
                break;
            case 3:
                getProduct();
                break;
            case 4:
                brandMobilePhoneFilter();
                break;
            default:
                System.out.println("Geçersiz işlem yaptınız.");
                break;
        }
    }


    public void addMobilePhoneItem() {
        System.out.print("Benzersiz Cep Telefonu ID no girin: ");
        int id = input.nextInt();
        System.out.print("İsmi::");
        String name = input.next();
        System.out.print("Fiyatı");
        double price = input.nextDouble();
        System.out.print("İndirim Oranı: :");
        int discountRate = input.nextInt();
        System.out.print("Ekran Boyutu:");
        double screenSize = input.nextDouble();
        System.out.print("RAM");
        int ram = input.nextInt();
        System.out.print("Hafıza: ");
        int memory = input.nextInt();
        System.out.print("Stok Miktarı:");
        int stock = input.nextInt();
        System.out.print("Batarya: ");
        int battery = input.nextInt();
        System.out.print("Renk: ");
        String color = input.next();

        BrandList.printAllBrands();
        System.out.print("Marka: ");
        BrandList brand = BrandList.getBrand(input.nextInt());
        MobilePhone mobilephone = new MobilePhone(id, name, price, discountRate, stock, screenSize, ram, memory, brand, battery, color);
        allMobilePhones.add(mobilephone);
    }

    public void print(ArrayList<MobilePhone> mobilephones) {
        System.out.println();
        System.out.println();
        if (mobilephones == null) mobilephones = allMobilePhones;
        System.out.println("| ID | İsmi          | Fiyatı          | Markası         |  Hafıza       |  İndirim Oranı      | RAM    | Ekran Boyutu      | Stok    | Renk   | Batarya ");
        System.out.println();
        for (MobilePhone m : mobilephones) {
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | \n",
                    m.getId(), m.getName(), m.getPrice(), m.getBrand().getName(), m.getMemory(), m.getDiscountRate(),
                    m.getRam(), m.getScreenSize(),  m.getStock(), m.getColor(), m.getBattery());
        }
    }

    public void getProduct() {
        print(null);
    }

    public void deleteMobilePhoneItem() {
        getProduct();
        System.out.print("Silinecek Cep Telefonu ID No:");
        int id = input.nextInt();
        allMobilePhones.remove(id - 1);
        System.out.println("Listenin Son Hali ");
        getProduct();
    }

    private void brandMobilePhoneFilter() {
        getProduct();
        ArrayList<MobilePhone> filterMobilePhones = new ArrayList<>();
        System.out.print("Filtrelenecek Cep Telefonu Markası: ");
        String filterBrand = input.next();
        for (MobilePhone mobilephone : allMobilePhones) {
            if (filterBrand.equals(mobilephone.getBrand().getName())) {
                filterMobilePhones.add(mobilephone);
            }
        }
        print(filterMobilePhones);

    }

}