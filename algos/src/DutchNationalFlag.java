import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {

        /*
        Dutch National flaag algorithm sorts the array in o(n) time, and o(1) space
        if the number of elemenets is 3
         */
        int[] arrayToSort = {0,2,1,1,2,1,1,2,0};
        int low = 0, mid =0, high = arrayToSort.length-1;
        while(mid<=high){
            int temp=0;
            switch(arrayToSort[mid]){
                case 0:
                    temp = arrayToSort[low];
                    arrayToSort[low]=arrayToSort[temp];
                    arrayToSort[mid]=arrayToSort[low];
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arrayToSort[high];
                    arrayToSort[high]=arrayToSort[mid];
                    arrayToSort[mid]=temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arrayToSort));
    }
}
