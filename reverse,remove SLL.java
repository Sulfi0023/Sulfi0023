import java.util.*;
public class Main
{
    Node head;

    class Node{
        int data;
        Node next;
        //Node head;

        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Main(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);

        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;
            }
            temp.next = newnode;
        }
    }


    public void search(int k) {
        Node temp = head;
        while (temp != null) {
            if (k == temp.data) {
                System.out.print("Found");
                break;
            } else
                temp = temp.next;
        }
    }
    public void dup(){
        Node current = head;

        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }

    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        //Node next = current.next;
        while (current != null){
            Node next = current.next ;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Main list = new Main();

        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        System.out.print("Search Element");
        int k=sc.nextInt();
        list.search(k);
        System.out.println("\nRemove Duplicate");
        list.dup();
        list.display();
        System.out.println("\nReverse");
        list.reverse();
        list.display();

    }
}
