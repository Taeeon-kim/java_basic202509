package basic.constate;

public class IfExample2 {
    public static void main(String[] args) {
        int age = 70;

        if (age >= 20) {
            if(age < 40){
                System.out.println("청년 입니다");
            } else if(age < 65){
                System.out.println("장년층 입니다");
            } else{
                System.out.println("노년층 입니다.");
            }
        } else if (age>=17) {
            System.out.println("당신은 고등학생입니다");
        } else if (age >= 14) {
            System.out.println("당신은 중학생입니다.");
        } else if (age >= 8) {
            System.out.println("당신은 초등학생입니다.");
        } else{
            System.out.println("미취학 아동입니다");
        }
    }
}
