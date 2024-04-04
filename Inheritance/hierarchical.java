public class hierarchical {
    public static void main(String[] args) {
    
        System.out.println("features of B object");
        B b = new B();
        b.methodeA();
        b.methodeB();

        System.out.println("features of C object");
        C c = new C();
        c.methodeA();
        c.methodeC();
    }
}


class A {
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


class C extends A
{
    public void methodeC()
    {
        System.out.println("We are in class C methode");

    }
}
