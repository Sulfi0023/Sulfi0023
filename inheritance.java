import java.util.*;
class enginner
{
    static int sem=8;
    static void print()
    {
        System.out.println("number of semester is:"+sem);
    }
}
class dept extends enginner
{
    void print1()
    {
        System.out.println("dept name is information technology");
    }
}
class main
{
    public static void main(String[] args)
    {
       dept obj=new dept();
       System.out.println(enginner.sem);
       obj.sem=7;
       System.out.println(enginner.sem);
       System.out.println(obj.sem);
    }


}
