package replit;

public class R144 {
}


class Main2
{
    public static void main(String [] args){

        StoreProduct obj1 = new StoreProduct("Eggs", 3, "Produce", true, 10);
        StoreProduct obj2 = new StoreProduct("Paper Towels", 2, 24);
        StoreProduct obj3 = new StoreProduct("Paper Towels", 2);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}

class StoreProduct{
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String label, double price, int stock){
        category = "misc";
        hasExpiration = false;
        this.label=label;
        this.price=price;
        this.stock=stock;
    }
    StoreProduct(String label, double price){
        stock=0;
        this.label=label;
        this.price=price;
    }

    void display (){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}
// public class StoreProduct{
//   String lable;
//   double price;
//   String category;
//   boolean hasExpiration;
//   int stock;
//   StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock){
//     this.lable=lable;
//     this.price=price;
//     this.category=category;
//     this.hasExpiration=hasExpiration;
//     this.stock=stock;
//   }
//   StoreProduct(String lable, double price, int stock){
//     this.lable=lable;
//     this.price=price;
//     this.stock=stock;
//     this.category="misc";
//     this.hasExpiration=false;
//   }
//   StoreProduct(String lable, double price){
//     this.lable=lable;
//     this.price=price;
//     this.stock=0;
//   }
// public void display(){
//   System.out.print(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
// }
// }

