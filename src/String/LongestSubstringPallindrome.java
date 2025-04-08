package String;

public class LongestSubstringPallindrome {

    public static void main(String[] args) {
        System.out.println(longestSubstringPallindrome("babad"));
    }


    public static String longestSubstringPallindrome(String str) {

        int start = 0;
        int maxLength = 1;
        int n = str.length();

        if(n<2){
            return str;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 1; j++) {
                int low = i;
                int high = i + j;
                while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)) {
                    int currentLength = high - low + 1;
                    if (currentLength > maxLength) {
                        start = low;
                        maxLength = currentLength;
                    }
                    low--;
                    high++;
                }
            }
        }

        return str.substring(start, start + maxLength);
    }

}
