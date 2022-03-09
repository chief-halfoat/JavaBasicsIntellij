package replit;

public class Main {
        public static void main(String [] args){
            StoreProduct obj1 = new StoreProduct("Eggs", 3, "Produce", true, 10);
            obj1.display();
        }
    }

    class StoreProduct{
        String label;
        double price;
        String category;
        boolean hasExpiration;
        int stock;

        public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
            this.label = label;
            this.price = price;
            this.category = category;
            this.hasExpiration = hasExpiration;
            this.stock = stock;
        }

        public StoreProduct(String label, double price, int stock) {
            String category = "misc";
            boolean hasExpiration=false;
            this.label = label;
            this.price = price;
            this.stock = stock;
        }

        public StoreProduct(String label, double price) {
            int stock = 0;
            this.label = label;
            this.price = price;
        }

        void display(){
            System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
        }
    }

