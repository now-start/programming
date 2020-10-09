import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i >= 2; i--) {
            for (int j = i-1; j >= 1; j--) {
                for (int k = j-1; k >= 0; k--) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m) {
                    	list.add(sum);
                    }
                }
            }
        }
		
		list.sort(null);
		System.out.println(list.get(list.size()-1));
	}

}
