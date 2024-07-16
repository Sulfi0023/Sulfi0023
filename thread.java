
class Num extends Thread{
    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println(i);

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}

public class Main{

    public static void main(String[] args) {
        Runnable book = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("mango Db");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Num num = new Num();

        Thread t=new Thread(book);
        //book.UpdateDB();
        //num.Print();
        t.start();
        num.start();

        System.out.println("End of the program");


    }

}
