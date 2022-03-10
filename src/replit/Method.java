package replit;
public class Method{
    int[][] array;

    Method(int[][] array){
        this.array=array;
    }

    void summing(){
        int sum = 0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                sum += array[i][j];
            }
        }

        System.out.print(sum);
    }

}
