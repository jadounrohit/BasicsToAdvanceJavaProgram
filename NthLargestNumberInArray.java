package arrays_problems;

public class NthLargestNumberInArray {
	    // Quick Select algorithm
	    public static int findKthLargest(int[] array, int k) {
	        return quickSelect(array, 0, array.length - 1, array.length - k);
	    }
	    // Helper method for Quick Select
	    private static int quickSelect(int[] array, int left, int right, int k) {
	        if (left == right) {
	            return array[left];
	        }
	        int pivotIndex = partition(array, left, right);
	        if (k == pivotIndex) {
	            return array[k];
	        } else if (k < pivotIndex) {
	            return quickSelect(array, left, pivotIndex - 1, k);
	        } else {
	            return quickSelect(array, pivotIndex + 1, right, k);
	        }
	    }
	    // Partition method for Quick Select
	    private static int partition(int[] array, int left, int right) {
	        int pivot = array[right];
	        int i = left;
	        for (int j = left; j < right; j++) {
	            if (array[j] <= pivot) {
	                swap(array, i, j);
	                i++;
	            }
	        }
	        swap(array, i, right);
	        return i;
	    }
	    // Swap method
	    private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	    
	    public static void main(String[] args) {
	        int[] numbers = {3, 2, 1, 5, 6, 4, 7, 9, 8, 20};
	        int position = 5;
	        int kthLargest = findKthLargest(numbers, position);
	        System.out.println("The " + position + "th largest element is " + kthLargest);
	    }
}

