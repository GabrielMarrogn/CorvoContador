import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int decimal = 0;

        for (int i = 0; i < 3;) {
            String a = br.readLine();
            if (!a.equals("caw caw")) {
                String b = a.replace("-", "0").replace("*", "1");
                int num = binario(b);
                decimal += num;
            }
            if(a.equals("caw caw")){
                i++;
                System.out.println(decimal);
                decimal = 0;
            }

        }

    }

    // transforma em decimal
    public static int binario(String b) {
        int decimal = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            decimal += Integer.parseInt("" + b.charAt(i)) * Math.pow(2, b.length() - 1 - i);
        }

        return decimal;
    }
}
