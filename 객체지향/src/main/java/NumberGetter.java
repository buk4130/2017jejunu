import java.util.Scanner;

/**
 * Created by seonghohong on 2017. 3. 30..
 */
public class NumberGetter {

    private int inputNum;

    public int setNum(){
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        return inputNum;
    }
}
