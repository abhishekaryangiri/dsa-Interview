package practice.d4;

public class $18longestName {
	 // Function to display longest names
    // contained in the array
    public static ArrayList<String> solve(String arr[],
                                          int N)
    {
       
        // Edge Case
        if (N == 0) {
            ArrayList<String> temp
                = new ArrayList<String>();
            return temp;
        }
        // Initialize Max
        int Max = arr[0].length();
 
        // Create an arraylist res
        ArrayList<String> res = new ArrayList<String>();
 
        // Insert first element in res
        res.add(arr[0]);
 
        // Traverse the array
        for (int i = 1; i < N; i++) {
 
            // If string with greater length
            // is found
            if (arr[i].length() > Max) {
                Max = arr[i].length();
                res.clear();
                res.add(arr[i]);
            }
 
            // If string with current max length
            else if (arr[i].length() == Max) {
                res.add(arr[i]);
            }
        }
 
        // Return the final answer
        return res;
    }
        
}
