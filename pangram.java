import java.util.*;
import java.lang.String;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String string =s.nextLine();
        ip pi=new ip(string);
        Thread t1 = new Thread(pi);
        t1.start();
    }  }
class ip implements Runnable {
    private String string;
    public ip(String string) {
        this.string = string;
    }
    public void run()
    {  string = string.toLowerCase();
        boolean allLetterPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            if (!string.contains(String.valueOf(ch)))
            {
                allLetterPresent = false;
                break;  }  }
        if (allLetterPresent)
            System.out.println("Pangram String");
        else
            System.out.println("Not a Pangram String");
    }
}
