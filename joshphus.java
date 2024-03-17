import java.util.*;
import java.io.*;

public class joshphus {
    public static int solution(int n, int k) {
        if(n == 1){
            return 0;
        }
        return (solution(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
       
        System.out.print(solution(n,k));
    }
}