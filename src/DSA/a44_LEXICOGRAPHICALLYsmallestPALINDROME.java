package DSA;

public class a44_LEXICOGRAPHICALLYsmallestPALINDROME {
    public String smallestPalindrome(String s) {
        int [] freq = new int [26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        char middleChar = 0;

        for(int i = 0; i<26; i++){
            while(freq[i] >= 2){
                firstHalf.append((char)(i + 'a'));
                freq[i] -=2;
            }
            if(freq[i] == 1 && middleChar == 0){
                middleChar = (char)(i + 'a');
            }
        }

        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        if(middleChar != 0){
            return firstHalf.toString() + middleChar + secondHalf;
        }else{
            return firstHalf.toString() + secondHalf;
        }
    }
}
