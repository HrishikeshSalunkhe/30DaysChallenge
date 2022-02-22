package fourthDay.strings;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aaaabcderababababbb";
        int array[] = new int[26];
        int max =0;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            array[ch -'a'] +=1;
            if(array[max] < array[ch-'a']){
                max = ch-'a';
            }
        }
        System.out.println(array[max]);

    }
}
