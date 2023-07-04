
interface Interf{

    public void updateProduct();

}

interface FunSum {

    public int sum(int a, int b);

}
public class LambdaExpression {


    public static void main(String[]args){

        Interf intf = ()->System.out.println("product updated");

        intf.updateProduct();

        FunSum sum = (a,b)->a+b;

        int result  = sum.sum(11,22);
        System.out.println(result);
    }
}
