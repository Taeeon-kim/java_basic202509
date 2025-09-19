package basic.loop;

public class LoopNesting {

    public static void main(String[] args) {
         // 30 ~ 100 사이의 소수가 몇개 있는지 세봐

        int num = 0;
        for (int i = 98; i <= 100; i++) {
            int count =0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 2){
                num++;
            }
        }
        System.out.println("소수 갯수 count = " + num);
    }
}
