public class laptop {
    void  brand_name(){
        String c_name  = "victus";
        System.out.println(c_name);
    }

    void ram(){
        String modlname = "BMW";
        System.out.println(modlname);
    }

    void price (){
        String pricee =  "1000000$";
        System.out.println(pricee);
    }
    public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.brand_name();
        l1.ram();
        l1.price();   }
}
