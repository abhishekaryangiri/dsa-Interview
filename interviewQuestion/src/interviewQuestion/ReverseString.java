package interviewQuestion;

import java.util.Scanner;

public class ReverseString {
	//Creating performReverse() method to reverse a string  
    public static void performReverse(String str){    
        //Reverse string using StringBuilder  
        //Creating instance of the StringBuilder  
        StringBuilder newString = new StringBuilder(str);     
          
        //Using reverse() method to reverse string   
        newString.reverse();  
        //Showing reverse string   
        System.out.println("Reverse string using StringBuilder: "+newString.toString());      
          
        //Reverse string using string iteration  
        //Converting string to character array  
        char ch[] = str.toCharArray();    
        String reverseString="";    
        //Reverse string using character array  
        for(int i = ch.length-1; i >= 0 ; i--){    
            reverseString+=ch[i];    
        }  
        //Showing reverse string  
        System.out.println("Reverse string using string iteration: "+reverseString);   
    }  
    //main() method starts  
    public static void main(String[] args) {   
          
        //Getting string from the user  
        Scanner sc = new Scanner(System.in);   
        String name = sc.nextLine();  
          sc.close();
        //Calling performReverse() method to perform reverse  
        
       System.out.print(performReverse(name));  
    }  
}
