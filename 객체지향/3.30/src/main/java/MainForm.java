import view.AskView;
import view.ResultView;

/**
 * Created by seonghohong on 2017. 3. 30..
 */
public class MainForm {

    public static void main(String args[]) {
        controller();
    }

    public static void controller() {

        AskView askView = new AskView();
        NumberGetter numberGetter = new NumberGetter();

        //숫자를 물어보고 가지고 오기
        askView.ask("첫째 숫자");
        int num1 = numberGetter.setNum();
        askView.ask("두번째 숫자");
        int num2 = numberGetter.setNum();
        askView.ask("세번째 숫자");
        int num3 = numberGetter.setNum();

        ResultView resultView = new ResultView();
        CompareNum compareNum = new CompareNum(num1, num2, num3);

        int firstNum = compareNum.getFirstNum();
        resultView.showResult("첫번째", firstNum);
        int secondNum = compareNum.getSecondNum();
        resultView.showResult("두번째", secondNum);
    }
}
