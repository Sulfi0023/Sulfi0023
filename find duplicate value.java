import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum +arr[i];
        }
        boolean Dupe = false;
        try{
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("Dupe Num :"+ arr[i]);
                        Dupe = true;
                        break;
                    }
                }
            }
            int d = sum /0;
        }
        catch(ArithmeticException e){
            if (!Dupe) {
                System.out.println("No dupe");
            }
        }

    }
}
