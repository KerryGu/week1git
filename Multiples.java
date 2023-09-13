public class Multiples {
    public static int main(int n, int a, int b){
        int i = 1;
        while(i < n) {
            boolean multipleby3 = i % a == 0;
            boolean multipleby5 = i % b == 0;
            if (multipleby3 || multipleby5) {
                i++;
            }

        }
        return i;

    }

}
