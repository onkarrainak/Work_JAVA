// Java Program to Print Inverted half Pyramid
public class que10 {
    public static void main(String[] args){

        int num = 5;
        int i,j;

        for(i=num;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }

    }
}
