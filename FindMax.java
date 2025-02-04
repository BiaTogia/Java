public class FindMax {

    public void findMinMax(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);

        }
    }

