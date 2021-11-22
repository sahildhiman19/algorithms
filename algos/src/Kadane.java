public class Kadane {
    public static void main(String[] args) {
       /*
        this algorithm finds the largest subarray sum in a given array in o(n) time.
        and o(1) space.
        */
        int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};
        int i = 0;
        int end = 1;
        int max=arr[0];
        int sum = arr[0];
        int answer = arr[0];
        while (end < arr.length) {
            if(arr[end]>max) max = arr[end];
            sum += arr[end];
            if (sum > 0) {
                if (sum > answer) {
                    answer = sum;
                }
            } else {
                sum = 0;
            }
            end += 1;
        }
        if(answer<0){
            answer=max;
        }
        System.out.println(answer);
    }
}
