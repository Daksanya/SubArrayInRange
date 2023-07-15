import java.util.Scanner;

public class SubArrayInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int start= sc.nextInt();
        int end= sc.nextInt();
        for (int i=start;i<=end;i++){
            System.out.println(array[i]);
        }
    }
}
