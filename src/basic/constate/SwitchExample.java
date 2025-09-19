package basic.constate;

public class SwitchExample {

    public static void main(String[] args) {
        String gender = "M";
        switch (gender){
            case "M", "m", "남", "ㅡ":
                System.out.println("남성입니다");
                break;
            case "F", "f", "여", "ㄹ":
                System.out.println("여성입니다");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

    }
}
