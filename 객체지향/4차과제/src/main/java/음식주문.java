import java.util.Scanner;

/**
 * Created by seonghohong on 2017. 4. 25..
 */
public class 음식주문 {
    private int 음식개수;

    private Scanner scanner;

    public 음식주문() {
        scanner = new Scanner(System.in);
    }


    public int 음식개수받기(String 음식이름) {
        System.out.println(""+음식이름+"의 원하시는 수량을 입력하세요!");
        음식개수 = scanner.nextInt();

        return 음식개수;
    }
}
