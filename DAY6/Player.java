package com.learn;

public class Player 
{
	String name; 
	int truns; 
	int wicket; 
	int matches; 
	String country; 
	int century; 
	//String category = null ;
	public Player(String name, int truns, int wicket, int matches, String country, int century) 
	{
		
		this.name = name;
		this.truns = truns;
		this.wicket = wicket;
		this.matches = matches;           
		this.country = country;
		this.century = century;
		//this.category = category;
		
	}
	 public void displayplayerdetails()
	   {
		   System.out.println(name+ "    "+ truns+ "    "+ wicket+ "      "+ matches+"     "+country+"     "+century);
		   System.out.println("---------------------------------------------------------------------------------------");
		   
	   }

}
