import java.util.*;
public class equalsumsubset {
    public static void solution(int[] arr, int vidx, int n, int k, int[] subsetsum, int ssssf, ArrayList<ArrayList<Integer>> ans) {
        if (vidx == n) {
            if (ssssf == k) {
                boolean flag = true;
                for (int i = 1; i < k; i++) {
                    if (subsetsum[i] != subsetsum[i - 1]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    for (int i = 0; i < k; i++) {
                        System.out.print(ans.get(i) + " ");
                    }
                    System.out.println();
                }
            }
            return;
        }
        for (int i = 0; i < k; i++) {
            if (ans.get(i).size() > 0) {
                ans.get(i).add(arr[vidx]);
                subsetsum[i] += arr[vidx];
                solution(arr, vidx + 1, n, k, subsetsum, ssssf, ans);
                ans.get(i).remove(ans.get(i).size() - 1);
                subsetsum[i] -= arr[vidx];
            } else {
                ans.get(i).add(arr[vidx]);
                subsetsum[i] += arr[vidx];
                solution(arr, vidx + 1, n, k, subsetsum, ssssf + 1, ans);
                ans.get(i).remove(ans.get(i).size() - 1);
                subsetsum[i] -= arr[vidx];
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            sum += arr[i];

    }
    int k = scn.nextInt();
    if(k==0){
        System.out.println(" ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]+ " ");
        }
        return;
    }
    if(k>n || sum%k!=0){
        System.out.println(" ");
        return;
    }
    int[] subsetsum = new int[k];
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    for(int i = 0; i < k; i++){
        ans.add(new ArrayList<>());
    }
    solution(arr,0,n,k,subsetsum,0,ans);
    }

    
}
    
    
    

