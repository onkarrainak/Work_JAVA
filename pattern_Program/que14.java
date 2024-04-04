public class que14 {
    public static void main(String[] args) {
        int num = 5;
        int i,j;

        for (i=1;i<=num;i++){
            for (j=1;j<=i;j++){
                int sum = i + j;
                if (sum %2 ==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
    
}
