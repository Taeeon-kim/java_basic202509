package basic.loop;

public class WhileExample {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        System.out.println("================");
        //특정값이 소수인지, 아닌지 판별하는 문제
        int num = 23;
        int k = 2;
        boolean s = false;
        while (k <= num) {
            if(num % k == 0){
                s = true;
                break;
            }
            k++;
        }
//        for (int j = 1; j <= num; j++) {
//            if(num % j == 0){
//                count++;
//            }
//        }
        if(s){
            System.out.println("소수 입니다.");
        } else{
            System.out.println("소수가 아닙니다");
        }
    }

}
