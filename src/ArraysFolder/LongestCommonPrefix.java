package ArraysFolder;

public class LongestCommonPrefix {

    //Unfinished
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix longest = new LongestCommonPrefix();
        longest.longestCommonPrefix(strs);
    }

    public String longestCommonPrefix(String[] strs){
        String answer = "";
        
        for(int i = 0; i <strs.length; i++ ){
            // access the words, get the length of the word, string[i] == string[j]
            for(int j = 0; j < strs.length; j++){
                String currentWord = strs[i];
                String compareWord = strs[j];
                if(currentWord.charAt(j) == compareWord.charAt(j)){
                    System.out.println(currentWord.charAt(i));
                }

            }
        }
        return answer;
    }
}
