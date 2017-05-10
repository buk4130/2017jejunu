package 출력자모음;

import java.util.Scanner;

/**
 * Created by samsung on 2017-05-10.
 */
public class 질문자 {
    private int 반환값;

    private Scanner scanner;

    public 질문자() {scanner = new Scanner(System.in);}

    public int 정수받아오기() {
        반환값 = scanner.nextInt();
        return 반환값;
    }
}
