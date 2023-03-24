public class calculation {
    int a,b,c;

    void init(){
    a=20;
    b=10;
    }
    void addition()
    {
        c = a+b;
        System.out.println("The Addition is:" + temp );
    }

    void substraction()
    {
        c = a-b;
        System.out.println("The Substraction is:" + temp);
    }

    void multiplication()
    {
        c = a*b;
        System.out.println("The multiplication is :" + temp);
    }

    void division()
    {
        c = a/b;
        System.out.println("The Division is :" + temp);
    }    
}



class cal {
    public static void main(String[] args) {
        
        calculation C = new calculation();  //creating object of calculation class
        C.init();
        C.addition();
        C.substraction();
        C.multiplication();
        C.division();
    }
}
