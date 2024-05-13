import java.util.Arrays;

public class String2 {

    static void removeDuplicate(char str[], int length) {
        int index = 0;
        for (int i = 0; i < length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }

    public static void main(String[] args) {
        String str2 = "ipl 2024 will be won by Rajasthan royals";
        char str[] = str2.toCharArray();
        int len = str.length;
        removeDuplicate(str, len);
    }
    
}
