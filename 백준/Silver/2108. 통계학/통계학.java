import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(findAvg(arr)).append("\n");
        sb.append(findMid(arr)).append("\n");
        sb.append(findMaxCount(arr)).append("\n");
        sb.append(findArrange(arr)).append("\n");

        System.out.print(sb.toString());
    }

    public static int findAvg(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        int res = Math.round((float) sum / arr.size());
        return res;
    }

    public static int findMid(ArrayList<Integer> arr) {
        return arr.get(arr.size() / 2);
    }

    public static int findMaxCount(ArrayList<Integer> arr) {
        int maxCount = 0;
        int count = 1;
        int maxVal = arr.get(0);
        boolean secondFound = false;
        int secondVal = 0;

        for (int i = 1; i <= arr.size(); i++) {
            if (i < arr.size() && arr.get(i).equals(arr.get(i - 1))) count++;
            else {
                if (count > maxCount) {
                    maxCount = count;
                    secondFound = false;
                    maxVal = arr.get(i-1);
                } else if (count == maxCount && !secondFound) {
                    secondVal = arr.get(i-1);
                    secondFound = true;
                }
                count = 1;
            }
        }

        return secondFound ? secondVal : maxVal;
    }

    public static int findArrange(ArrayList<Integer> arr) {
        int max = arr.get(arr.size()-1);
        int min = arr.get(0);
        return Math.abs(max - min);
    }
}