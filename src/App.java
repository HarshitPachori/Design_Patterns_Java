import lambda_exp.Add;
import lambda_exp.MyInterFace;
import lambda_exp.MyInterfaceImpl;

public class App {
    public static void main(String[] args) throws Exception {

        // by interface implementaion and storing in base class object
        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        myInterfaceImpl.greet();

        // by interface implementaion and storing in parent class object
        MyInterFace myInterFace = new MyInterfaceImpl();
        myInterFace.greet();

        // by using annoymous class
        MyInterFace myInterFace2 = new MyInterFace() {
            @Override
            public void greet() {
                System.out.println("Hello Harshit, I am greeting you from MyInterface Anonymous Class");
            }
        };
        myInterFace2.greet();

        // by using the lambda function
        MyInterFace myInterface3 = () -> System.out.println("hii i am lambda expresssion");
        myInterface3.greet();

        Add add = (a, b) -> a + b;
        System.out.println(add.sum(2, 5));
        System.out.println(add.sum(25, 75));

        // thread using anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("the value of i is : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.setName("Johnn");
        t1.start();

        // thread using lambda function

        Runnable r2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 * " + i + " = " + 2 * i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(r2);
        t2.setName("Ramu");
        t2.start();
    }
}
