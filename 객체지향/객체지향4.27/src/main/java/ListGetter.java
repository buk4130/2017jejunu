import java.util.Scanner;

/**
 * Created by seonghohong on 2017. 4. 27..
 */
public class ListGetter {

    private Scanner scanner;
    private int listSize;

    public ListGetter() {
        scanner = new Scanner(System.in);
    }

    public int getNum() {
        listSize = scanner.nextInt();

        return listSize;
    }

    public int[] getList(int listLength) {

        int temp;
        int[] list = new int[listLength];

        for(int i=0; i<listLength; i++) {
            int index = 1;

            temp = scanner.nextInt();
            System.out.println(""+index+"번쨰 입력 값은 "+temp+" 입니다.");
            list[i] = temp;
            index++;
        }

        return list;
    }
}
