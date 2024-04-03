public class Single {
    public static void main(String[] args) 
    {
        B b = new B();
        b.methodeA();
        b.methodeB();
        
    }
}
// Create Super class
class A 
{
    public void methodeA()
    {
    System.out.println("We are in methode A ");
    }

}

// Create Sub class
class B extends A {
    public void methodeB()
    {
        System.out.println("We are in methode B ");
    }
    
}




