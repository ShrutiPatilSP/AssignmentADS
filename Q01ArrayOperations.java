import java.util.Arrays;

public class Q01ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 20, 0, 8, 15};

        // Find the second largest element
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);

        // Move all zeros to the end
        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }

    // Function to find the second largest element
    private static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr)
			{
            if (num > largest) 
			{
                secondLargest = largest;
                largest = num;
            } 
			else if (num > secondLargest && num != largest) 
			{
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    // Function to move all zeros to the end while maintaining the order of non-zero elements
    private static void moveZerosToEnd(int[] arr) {
        int index = 0; // Position to place non-zero elements

        // Traverse the array and move non-zero elements forward
        for (int num : arr) 
		{
            if (num != 0)
			{
                arr[index++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length)
	    {
            arr[index++] = 0;
        }
    }
}
