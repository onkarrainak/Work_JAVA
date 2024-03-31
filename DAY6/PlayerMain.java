import java.util.ArrayList;
import java.util.Scanner;



public class PlayerMain 
{
   public static void main(String[] args) 
   {
	   ArrayList<Player> al=PlayerCRUD.createplayer();
		  PlayerCRUD.displayplayer(al);
		  int choices = 0;
		  Scanner s = new Scanner(System.in);
		  choices = s.nextInt();
		  switch (choices)
		  {
		  case 1 :
			  PlayerCRUD.Maxruns(al);
//			  PlayerCRUD.displayplayer(al);
			  break;
			  
		  case 2 :
			  PlayerCRUD.removeplayer(al);
//			  PlayerCRUD.displayplayer(al);
			  break;
		  }
//		PlayerCRUD.Maxruns(al);  
//		 PlayerCRUD.removeplayer(al);
////		 PlayerCRUD.displayplayer(al);
//		 // PlayerCRUD.Catagory(al);
   }
}
