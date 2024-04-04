public class Multi 
{
    public static void main(String[] args) 
    {
        C c = new C();
        c.methodeA();
        c.methodeB();
        c.methodeC();
        
    }
    
}

class A 
{
    public void methodeA()
    {
        System.out.println("We are in class A methode");

    }
}

class B extends A
{
    public void methodeB()
    {
        System.out.println("We are in class B methode");

    }
}

class C extends B
{
    public void methodeC()
    {
        System.out.println("We are in class C methode");

    }
}


