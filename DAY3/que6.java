// Java Program to Print Pyramid Number Pattern
public class que6 {
    public static void main(String[] args) {
        int num =5;
        int i,j;

        for(i=0;i<num;i++){

            for(j=0;j<num-i-1;j++){
                System.out.print(" ");
            }

            for(int k=0;k<2*i+1;k++){
                System.out.print(i);
            }
            System.out.println();
        }

        
        
    }
    
    
}
