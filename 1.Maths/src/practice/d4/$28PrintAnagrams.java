package practice.d4;

public class $28PrintAnagrams {
	 // class for each word of duplicate array
    static class Word {
        String str; // to store word itself
        int index; // index of the word in the
        // original array
 
        // constructor
        Word(String str, int index)
        {
            this.str = str;
            this.index = index;
        }
    }
    
    // class to represent duplicate array.
    static class DupArray {
        Word[] array; // Array of words
        int size; // Size of array
 
        // constructor
        public DupArray(String str[], int size)
        {
            this.size = size;
            array = new Word[size];
 
            // One by one copy words from the
            // given wordArray to dupArray
            int i;
            for (i = 0; i < size; ++i) {
                // create a word Object with the
                // str[i] as str and index as i
                array[i] = new Word(str[i], i);
            }
        }
    }
    
    
    
}
