import java.util.Scanner;

public class player {
    public static void main(String[] args) {
        player play = new player();
        play.player1();
        play.player2();
        play.player3();
    }

    String name;
    int age;
    String country_name;
    double total_runs;

    public void get_data()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter player name ");
        name = s.next();
        System.out.println("Enter player age ");
        age = s.nextInt();
        System.out.println("Enter player country name ");
        country_name = s.next();
        System.out.println("Enter player total runs ");
        total_runs = s.nextDouble();

    }

    public void show_data()
    {
        System.out.println("*******************************************");
        if (total_runs>= 5000) {
            System.out.println("Player details");
            System.out.println(name);
            System.out.println(age);
            System.out.println(country_name);
            System.out.println(total_runs);
        }else{
            System.out.println("Players total runs is less then 5000");
        }
        System.out.println("*******************************************");
        

    }

    public void player1()
    {
        player play = new player();
        play.get_data();
        play.show_data();
    }

    public void player2()
    {
        player play = new player();
        play.get_data();
        play.show_data();
    }

    public void player3()
    {
        player play = new player();
        play.get_data();
        play.show_data();
    }    
}
