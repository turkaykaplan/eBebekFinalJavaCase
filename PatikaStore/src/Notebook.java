import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends NotebookProducts {
    private final Scanner input = new Scanner(System.in);
    private static ArrayList<Notebook> allNotebooks = new ArrayList<>();
    public Notebook() {}
    public Notebook(int id, String name, double price, int discountRate, int stock,
                    double screenSize, int ram, int memory, BrandList brand) {
        super(id, name, price, discountRate, stock, screenSize, ram, memory, brand);
    }

    public void menuNotebook() {
        System.out.println("1-Notebook Ekle\n" + "2-Notebook Sil\n" + "3-Notebook Listesi\n" + "4-Markaya göre Notebook filtrele\n");
        System.out.println();
        System.out.print("Seçiminiz: ");
        int select = input.nextInt();
        switch (select) {
            case 1:
                addNotebookItem();
                break;
            case 2:
                deleteNotebookItem();
                break;
            case 3:
                getProduct();
                break;
            case 4:
                brandNotebookFilter();
                break;
            default:
                System.out.println("Geçersiz işlem yaptınız.");
                break;
        }
    }

    public void addNotebookItem() {
        System.out.print("Benzersiz Notebook ID no girin: ");
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

        BrandList.printAllBrands();
        System.out.print("Marka: ");
        BrandList brand = BrandList.getBrand(input.nextInt());
        Notebook notebook = new Notebook(id, name, price, discountRate, stock, screenSize, ram, memory, brand);
        allNotebooks.add(notebook);
    }

    public void print(ArrayList<Notebook> notebook) {
        System.out.println();
        System.out.println();
        if (notebook == null) notebook = allNotebooks;
        System.out.println("| ID | İsmi                  | Fiyatı          | Markası         |  Hafıza       | İndirim Oranı      | RAM    | Ekran Boyutu      | Stok    |");
        System.out.println();
        for (Notebook n : notebook) {
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(), n.getName(), n.getPrice(), n.getBrand().getName(),n.getMemory() , n.getDiscountRate(),
                    n.getRam(), n.getScreenSize(), n.getStock());
        }
    }
    public void getProduct() {
        print(null);
    }
    public void deleteNotebookItem() {
        getProduct();
        System.out.print("Silinecek Notebook ID No:");
        int id = input.nextInt();
        allNotebooks.remove(id - 1);
        System.out.println("Listenin Son Hali ");
        getProduct();
    }
    private void brandNotebookFilter() {
        getProduct();
        ArrayList<Notebook> filterBrandNotebooks = new ArrayList<>();
        System.out.print("Filtrelenecek Notebook Markası: ");
        String filterBrand = input.next();
        for (Notebook notebook : allNotebooks) {
            if (filterBrand.equals(notebook.getBrand().getName())) {
                filterBrandNotebooks.add(notebook);
            }
        }
        print(filterBrandNotebooks);

    }



}
