import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(countSan(647));

    }

    public static int countSan(int san) {
        int count = 0;
        while (true) {
            if (san == 0) {
                break;
            } else {
                san /= 10;
                count++;
            }
        }
        return count;
    }


}