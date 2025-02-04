class problem1089 {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        int length = arr.length;

        // First pass to count zeros
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        // Second pass to shift elements and duplicate zeros
        // Traverse the array from the end to the beginning
        for (int i = length - 1; i >= 0; i--) {
            if (i + zeros < length) {
                arr[i + zeros] = arr[i];  // Shift the element to the right
            }
            // If the current element is zero, duplicate it
            if (arr[i] == 0) {
                if (i + zeros + 1 < length) {
                    arr[i + zeros + 1] = 0;  // Insert the duplicated zero
                }
                zeros--;  // Decrement the number of zeros to be inserted
            }
        }
    }
    public static void main(String[] args) {
        problem1089 solution = new problem1089();
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr1);
        System.out.print("Test case 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Expected: [1, 0, 0, 2, 3, 0, 0, 4]
        int[] arr2 = {1, 2, 3};
        solution.duplicateZeros(arr2);
        System.out.print("Test case 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Expected: [1, 2, 3]
        int[] arr3 = {0, 1, 7, 0, 2, 0};
        solution.duplicateZeros(arr3);
        System.out.print("Test case 3: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println(); // Expected: [0, 0, 1, 7, 0, 0]
    }
}
