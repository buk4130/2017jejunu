import 출력자모음.*;

/**
 * Created by samsung on 2017-05-10.
 */
public class Main {
    private static 출력자 차림표출력자 = new 차림표출력자();
    private static 제어자 제어자실행;

    public static void main(String args[]) {
        String[] 음식리스트 = new String[] {"정식", "갈비탕", "비빔밥", "제육덮밥", "컵밥", "밥버거", "짜장면", "짬뽕", "국밥", "비빔국수"};
        int[] 차림가격리스트 = new int[] {9000, 8000, 7000, 6000, 5000, 4000, 3000, 2000, 1000, 10000};

        제어자실행 = new 제어자(차림표출력자);
    }
}
