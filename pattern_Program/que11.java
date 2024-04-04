// Inverted & Rotated Half Pyramid

public class que11 {
    public static void main(String[] args) { 
        int num = 5;
        int i,j;

        for (i = 1; i <=num; i++){
            for (j=1;j<=num-i;j++){
                System.out.print(" ");

            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
