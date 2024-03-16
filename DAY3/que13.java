// Floyd's Triangle 

public class que13 {
    public static void main(String[] args) {
        int num = 5;
        int number = 1;
        int i,j;


        for (i=1;i<=num;i++){
            for (j=1;j<=i;j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        
    }
    
}
