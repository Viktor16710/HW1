class Solution {
    public void duplicateZeros(int[] arr) {
       int array[] = {1, 0, 2, 3, 0, 4, 5, 0};

    for (int i = array.length - 1; i >= 0; i--) {
        if (arr[i] == 0) {
            for (int j = array.length - 1; j > i; j--) {
                arr[j] = arr[j-1];
            }
        }
    }

    for (int k = 0; k < arr.length; k++) {
        System.out.println(arr[k]);
    }
    }
}