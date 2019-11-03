import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int data[] = {52,31,25,12,48,44,38,9,37,29,43,16,22,28,41};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int data[]){
        int n = data.length;
        if (n < 2) return;
        int middle = n / 2;
        int S1[] = Arrays.copyOfRange(data, 0, middle);
        int S2[] = Arrays.copyOfRange(data, middle, n);
        sort(S1);
        sort(S2);
        merge(S1, S2, data);
    }

    public static void merge(int S1[], int S2[], int data[]) {
        int i = 0;
        int j = 0;
        while (i + j < data.length) {
            if (j == S2.length || (i < S1.length && compare(S1[i], S2[j]) < 0)) {
                data[i + j] = S1[i++];
            }
            else {
                data[i + j] = S2[j++];
            }
        }
    }
    
    public static int compare(int a, int b){
        if(a < b) return -1;
        else if(a == b) return 0;
        else return 1;
    }
}
