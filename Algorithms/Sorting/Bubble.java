import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int data[] = {52,31,25,12,48,44,38,9,37,29,43,16,22,28,41};
        sort(data);
        System.out.println(Arrays.toString(data));
    }
    public static void sort(int data[]){
        int n = data.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                // (n - i - 1) ignores comparing elements that have already been compared
                if(data[j] > data[j + 1]){
                    // swapping
                    int value = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = value;
                }
            }
        }
    }
}
