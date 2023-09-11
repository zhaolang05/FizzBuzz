public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int i = 100;
        while (i > 0){
            if (i % 2 == 0){
                i = i / 2;
                step = step + 1;
            }else{
                i = i - 1;
                step = step + 1;
            }
        }
        System.out.println(step);
    }
}
