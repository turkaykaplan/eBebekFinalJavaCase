import java.util.Scanner;

public class Store {
    Scanner input = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("Patika Stoe Kullanıcı Menüsü !");
            System.out.println(" 1 - Cep telefonu için 1'i seçin.\n" +
                    " 2 - Notebook İşlemleri için 2'yi seçin.\n" +
                    " 3 - Markaları listelemek için 3'ü seçin.\n" +
                    " 4 - Çıkış yapmak için 4'ü seçin.");
            System.out.print("Seçiminiz: ");

            switch (input.nextInt()) {
                case 1:
                    MobilePhone mobilePhone=new MobilePhone();
                    mobilePhone.menuMobilePhone();
                    break;
                case 2:
                    Notebook notebook=new Notebook();
                    notebook.menuNotebook();
                    break;
                case 3:
                    BrandList.printAllBrands();
                    break;
                case 4:
                    System.out.println("Çıkış yaptınız.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz.");
                    break;
            }
        }
    }
}

