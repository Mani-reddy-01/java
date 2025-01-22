public class Day_10 {
    public static void main(String[] args) {
        // Example input arrays
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};
        
        // Lengths of the arrays
        int m = nums1.length;
        int n = nums2.length;

        // Call the merge function
        int[] result = mergeArrays(nums1, m, nums2, n);

        // Print the merged array
        System.out.println("Merged Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] newArr = new int[m + n]; // Create a new array for the merged result
        int p1 = 0; // Pointer for nums1
        int p2 = 0; // Pointer for nums2
        int idx = 0; // Pointer for newArr

        // Merge elements from nums1 and nums2 while both have elements left
        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                newArr[idx++] = nums1[p1++]; // Add element from nums1
            } else {
                newArr[idx++] = nums2[p2++]; // Add element from nums2
            }
        }

        // Add any remaining elements from nums1
        while (p1 < m) {
            newArr[idx++] = nums1[p1++];
        }

        // Add any remaining elements from nums2
        while (p2 < n) {
            newArr[idx++] = nums2[p2++];
        }

        return newArr; // Return the merged array
    }
}


