package com.learn;

import java.util.ArrayList;

//import com.tech.Product;

public class PlayerCRUD 
{
	static ArrayList<Player> createplayer() 
	{
		
		ArrayList<Player> al = new ArrayList<>();
		Player p1 = new Player("Sachin",25000,15,2500,"India",101);
		Player p2 = new Player("Sharma",15000,10,1200,"India",45);
		Player p3 = new Player("Gayle",12000,50,1000,"West-Indies",50);
		Player p4 = new Player("Bumrah",3000,158,500,"India",1);
		Player p5 = new Player("Bravo",7000,200,1000,"West-Indies",5);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		return al;
	}

	public static void displayplayer(ArrayList<Player> al) 
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Name     T.runs     Wickets     Matches     Country     ");
		System.out.println("--------------------------------------------------------");
		for(Player obj : al)
		
			obj.displayplayerdetails();
			
	}

	public static void Maxruns(ArrayList<Player> al) 
	{
		System.out.println("Player who has runs more than 10,000");
		System.out.println("--------------------------------------------------------");
		System.out.println("Name     T.runs     Wickets     Matches     Country     Century      ");
		System.out.println("--------------------------------------------------------");
		for (Player obj : al)
		{
			if(obj.truns >10000)
			{
				
				obj.displayplayerdetails();
			}
		}
	}

	public static void removeplayer(ArrayList<Player> al) 
	{
		System.out.println("Player more than 100 wickets");
		int position =0;
		System.out.println("--------------------------------------------------------");
		System.out.println("Name     T.runs     Wickets     Matches     Country     Century     ");
		System.out.println("--------------------------------------------------------");
		for(Player obj : al)
		{
			if (obj.wicket<100)
			{
				position = al.indexOf(obj);
				
			}
			
			
		}
		al.remove(position);
	    
	}

//	public static void Catagory(ArrayList<Player> al) 
//	{
//		for(Player obj : al)
//		{
//			if(obj.century>50)
//			{
//				
//			}
//		}
//		
//	}
	 
	
	
	
	
	
	
}
