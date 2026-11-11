import java.util.Scanner;
public class multiplication_table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 1;i<=k;i++){
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}