import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int data[] = {52,31,25,12,48,44,38,9,37,29,43,16,22,28,41};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int data[]){
        int n = data.length;
        for(int i = 0; i < n - 1; i++){ // moves the border of the unsorted array
            int min = i; // finds the minimum index in unsorted array
            for(int j = i + 1; j < n; j++){
                if(data[j] < data[min]){
                    min = j;
                }
            }
            // swapping
            int value = data[min];
            data[min] = data[i];
            data[i] = value;
        }
    }
}
