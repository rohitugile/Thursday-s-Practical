public class calculation {
    int a,b,temp ;

    void init(){
    a=20;
    b=10;
    }
    void addition()
    {
        temp = a+b;
        System.out.println("The Addition is:" + temp );
    }

    void substraction()
    {
        temp = a-b;
        System.out.println("The Substraction is:" + temp);
    }

    void multiplication()
    {
        temp = a*b;
        System.out.println("The multiplication is :" + temp);
    }

    void division()
    {
        temp = a/b;
        System.out.println("The Division is :" + temp);
    }    
}



class cal {
    public static void main(String[] args) {
        
        calculation C = new calculation();
        C.init();
        C.addition();
        C.substraction();
        C.multiplication();
        C.division();
    }
}