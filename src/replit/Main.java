package replit;

public class Main extends Method{
    Main(int[][] array){
        super(array);
    }

    public static void main(String[] args){
        int[][] a= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        new Main(a).summing();
    }
}