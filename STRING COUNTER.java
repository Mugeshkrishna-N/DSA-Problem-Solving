import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] input=new String[n];
        for(int i=0;i<n;i++)
        {
            input[i]=sc.next();
        }
       // String[] input = {"RAJU", "BALA", "RAJU", "BALA", "GUNA", "BALA"};
        Map<String, Integer> countMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for (int i=0;i<input.length;i++) {
            countMap.put(input[i], countMap.getOrDefault(input[i], 0) + 1);
            result.add(input[i].substring(0, 2).toLowerCase() + "_" + countMap.get(input[i]));
        }
        
        System.out.println(result);
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.next();
        }

        Map<String, Integer> countMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String str : input) {
            if (countMap.containsKey(str)) {
                countMap.put(str, countMap.get(str) + 1);
            } else {
                countMap.put(str, 1);
            }
            result.add(str.substring(0, 2).toLowerCase() + "_" + countMap.get(str));
        }

        System.out.println(result);
    }
}


