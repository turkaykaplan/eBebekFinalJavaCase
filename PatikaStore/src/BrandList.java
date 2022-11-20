import java.util.Comparator;
import java.util.TreeSet;

public class BrandList {
    private int id;
    private String name;
    private static TreeSet<BrandList> brandAllList=new TreeSet<>(new Comparator<BrandList>() {
        @Override
        public int compare(BrandList o1, BrandList o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    public BrandList(int brandID, String brandName) {
        this.id= brandID;
        this.name = brandName;

    }

    static {allBrands();}

    public int getId() {
        return id;}

    public void setId(int id) {
        this.id = id;}

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public static void allBrands(){
        brandAllList.add(new BrandList(1,"Samsung"));
        brandAllList.add(new BrandList(2,"Lenovo"));
        brandAllList.add(new BrandList(3,"Apple"));
        brandAllList.add(new BrandList(4,"Huawei"));
        brandAllList.add(new BrandList(5,"Casper"));
        brandAllList.add(new BrandList(6,"Asus"));
        brandAllList.add(new BrandList(7,"HP"));
        brandAllList.add(new BrandList(8,"Xiaomi"));
        brandAllList.add(new BrandList(9,"Monster"));
    }
    public static void printAllBrands() {
        System.out.println("Markalar: ");
        for (BrandList brands : brandAllList) {
            System.out.println(brands.id+ "-" + brands.getName());
        }
    }
    public static BrandList getBrand(int id){
        for (BrandList brands : brandAllList) {
            if(id==brands.getId()){
                return brands;
            }
        }
        return null;
    }

}
