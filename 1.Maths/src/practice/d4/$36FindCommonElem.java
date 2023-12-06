package practice.d4;

public class $36FindCommonElem {
	 // Function to find the intersection of two arrays
    static void findIntersection(int[] arr1, int[] arr2,
                                 int[] temp, int m, int n,
                                 int[] k)
    {
        int i = 0, j = 0;
        // Loop to find the intersection of arr1[] and
        // arr2[]
        while (i < m && j < n) {
            // ith element can't be a common element
            if (arr1[i] < arr2[j]) {
                i++;
            }
            // jth element can't be a common element
            else if (arr2[j] < arr1[i]) {
                j++;
            }
            // if arr1[i] == arr2[j]
            else {
                temp[k[0]] = arr1[i];
                i++;
                j++;
                k[0]++;
            }
        }
    }
 
    
    
}
