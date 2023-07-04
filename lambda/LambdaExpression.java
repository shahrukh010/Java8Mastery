
interface Interf{

    public void updateProduct();

}

interface FunSum {

    public int sum(int a, int b);

}

class ThreadDemo{


    public ThreadDemo(){
        process();
    }

    public void process(){

        Runnable runnable = ()->{

            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
public class LambdaExpression {


    public static void main(String[]args){

        Interf intf = ()->System.out.println("product updated");

        intf.updateProduct();

        FunSum sum = (a,b)->a+b;

        int result  = sum.sum(11,22);
        System.out.println(result);

        ThreadDemo demo = new ThreadDemo();
    }
}
