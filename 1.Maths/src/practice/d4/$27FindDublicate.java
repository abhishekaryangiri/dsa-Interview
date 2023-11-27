package practice.d4;

public class $27FindDublicate {
	static ArrayList<Integer> duplicates(int arr[], int n)
	  {
	 
	    // Increment array elements by 1
	    for (int i = 0; i < n; i++) {
	      arr[i] += 1;
	    }
	 
	    // result list
	    ArrayList<Integer> res = new ArrayList<>();
	 
	    // count variable for count of
	    // largest element
	    int count = 0;
	 
	    for (int i = 0; i < n; i++) {
	 
	      // Calculate index value
	    	
	    	
	    	  int index = Math.abs(arr[i]) > n
	    		        ? Math.abs(arr[i]) / (n + 1)
	    		        : Math.abs(arr[i]);
	    		 
	    		      // Check if index equals largest element value
	    		      if (index == n) {
	    		        count++;
	    		        continue;
	    		      }
	    		 
	    		      // Get element value at index
	    		      int val = arr[index];
	    		 
	    		      // Check if element value is negative, positive
	    		      // or greater than n
	    		      if (val < 0) {
	    		        res.add(index - 1);
	    		        arr[index] = Math.abs(arr[index]) * (n + 1);
	    		      }
	    		      else if (val > n)
	    		        continue;
	    		      else
	    		        arr[index] = -arr[index];
	    		    }
	    
}
