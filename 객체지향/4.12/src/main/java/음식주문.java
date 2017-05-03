import java.util.Scanner;

/**
 * Created by seonghohong on 2017. 4. 19..
 */
public class 음식주문 {
    private int 음식코드;
    private int 음식개수;

    private Scanner scanner;

    public 음식주문() {
        scanner = new Scanner(System.in);
    }

    public int 음식코드받기() {
        System.out.println("원하시는 음식명에 대한 코드를 입력하세요!");
        음식코드 = scanner.nextInt();

        return 음식코드;
    }

    public int 음식개수받기() {
        System.out.println("원하시는 수량을 입력하세요!");
        음식개수 = scanner.nextInt();

        return 음식개수;
    }
}
