import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String str="";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите строку");
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(str);
        System.out.println(reverseString(str));
        long begin = System.currentTimeMillis();
        for (int i=0;i<1000;i++){
            reverseString(str);
        }
        System.out.println(System.currentTimeMillis()-begin);
        long begin1 = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            reverseString(str);
        }
        System.out.println(System.currentTimeMillis()-begin);
        long begin2 = System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            reverseString(str);
        }
        System.out.println(System.currentTimeMillis()-begin2);

    }

    public static String reverseString(String str){
        char[] s = str.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s);
    }
}
