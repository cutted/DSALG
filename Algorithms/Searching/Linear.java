import java.util.Arrays;
import java.util.Scanner;

public class Linear {

    public static void main(String[] args) {
        int[] data = {5,12,16,18,23,27,28,34,38,43,47,50,53,59};
        System.out.println("Data = " + Arrays.toString(data));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println(search(data, target));
    }

    public static boolean search(int data[], int target){
        int n = data.length;
        for(int i = 0; i < n; i++){
            if (data[i] == target) {
                return true;
            }
        }
        return false;
    }
}
