// Java Program to Print Hollow Rectangle Pattern
public class que9 {
    public static void main(String[] args) {
        int num = 5;
        int i,j;

        for (i=1;i<=num;i++){
            for (j=1;j<=num;j++){

                if (i==1|| i==num || j==1||j==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            
            System.out.println();
        }
        
    }
}
