package practice.d4;

public class $20MaxConsRep {
    // function to find out the maximum repeating
    // character in given string
    static char maxRepeating(String str)
    {
        int len = str.length();
        int count = 0;
 
        // Find the maximum repeating character
        // starting from str[i]
        char res = str.charAt(0);
        for (int i=0; i<len; i++)
        {
            int cur_count = 1;
            for (int j=i+1; j<len; j++)
            {
                if (str.charAt(i) != str.charAt(j))
                    break;
                cur_count++;
            }
 
            // Update result if required
            if (cur_count > count)
            {
                count = cur_count;
                res = str.charAt(i);
            }
        }
        return res;
    }
 
    // Driver code
    public static void main(String args[])
    {
 
        String str = "aaaabbbbbbbbbaaccde";
        System.out.println(maxRepeating(str));  
        //Time Complexity : O(n^2) 
       // Space Complexity : O(1)
    }
}
