import java.util.Scanner;
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long[] num = new long[a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextLong();
        }
        long k = 0;
        Arrays.sort(num);
        while (num[a - 1] >= a) {
            //注意两点：1 long  2 避免超时 max/n
            long tmp = num[a-1]/a;
            num[a - 1] -= a*tmp;
            for (int i = 0; i < a - 1; i++) {
                num[i] += tmp;
            }
            Arrays.sort(num);
            k+=tmp;
        }
        System.out.println(k);


    }
//    static List<List<Integer>> graph = new ArrayList<>();
//    static int max = 0;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] num = new int[n];
//        for (int i = 0; i < n; i++) {
//            num[i] = sc.nextInt();
//        }
//        for (int i = 0; i < num.length; i++) {
//            graph.add(new ArrayList<>());
//        }
//        // 构建图,邻接矩阵
//        for (int i = 0; i < n - 1; i++) {
//            int a = sc.nextInt() - 1;
//            int b = sc.nextInt() - 1;
//            graph.get(a).add(b);
//            graph.get(b).add(a);
//        }
//
//        for (int i = 0; i < num.length - 1; i++) {
//            dfs(num, i, 1);
//        }
//        System.out.println(max);
//
//    }
//
//    public static void dfs(int[] num, int start, int wayNum) {
//        max = Math.max(max, wayNum);
//        for (int i : graph.get(start)) {
//            if (num[i] > num[start]) {
//                dfs(num, i, wayNum + 1);
//            }
//        }
//    }

    
}