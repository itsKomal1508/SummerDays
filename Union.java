class Union {
    public static void main(String args[]) {
        int arr1[] = {1, 1, 2, 3, 4, 4, 5};
        int arr2[] = {2, 3, 4, 5, 6};
        int n = arr1.length + arr2.length;
        int unionArr[] = new int[n];
        
        int i = 0, j = 0, idx = -1;

        while (i < arr1.length && j < arr2.length) {
            int val;
            if (arr1[i] < arr2[j]) {
                val = arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                val = arr2[j++];
            } else {
                val = arr1[i];
                i++;
                j++;
            }

            if (idx == -1 || unionArr[idx] != val) {
                unionArr[++idx] = val;
            }
        }

        // Handle remaining elements of arr1
        while (i < arr1.length) {
            if (idx == -1 || unionArr[idx] != arr1[i]) {
                unionArr[++idx] = arr1[i];
            }
            i++;
        }

        // Handle remaining elements of arr2
        while (j < arr2.length) {
            if (idx == -1 || unionArr[idx] != arr2[j]) {
                unionArr[++idx] = arr2[j];
            }
            j++;
        }

        // Print final union array
        for (int k = 0; k <= idx; k++) {
            System.out.print(unionArr[k] + " ");
        }
    }
}
