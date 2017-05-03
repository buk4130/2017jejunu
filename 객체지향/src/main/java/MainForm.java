import view.AskView;
import view.ResultView;

/**
 * Created by seonghohong on 2017. 3. 30..
 */
public class MainForm {

    private static AskView askNum1;
    private static AskView asknum2;

    private static Calculater calculater;

    private static ResultView addResultView;
    private static ResultView minResultView;
    private static ResultView mulResultView;
    private static ResultView divResultView;
    private static ResultView bigNumResultView;

    public static void main(String args[]) {
        controller();
    }


    public static void controller() {

        //숫자를 물어보기
        askNum1 = new AskView("첫번째 숫자");
        asknum2 = new AskView("두번째 숫자");

        //숫자를 받아오기
        NumberGetter numberGetter = new NumberGetter();
        askNum1.ask();
        int num1 = numberGetter.setNum();
        asknum2.ask();
        int num2 = numberGetter.setNum();

        //숫자의 연산을 받기
        calculater = new Calculater(num1, num2);

        int addResult = calculater.add();
        int minResult = calculater.min();
        int mulResult = calculater.mul();
        int divResult = calculater.div();
        int bigNumber = calculater.bigNum();

        //view에 결과값들을 세팅
        addResultView = new ResultView("덧셈", addResult);
        minResultView = new ResultView("뺄셈", minResult);
        mulResultView = new ResultView("곱셈", mulResult);
        divResultView = new ResultView("나눗셈", divResult);
        bigNumResultView = new ResultView("큰 수", bigNumber);

        //결과값 출력
        addResultView.showResult();
        minResultView.showResult();
        mulResultView.showResult();
        divResultView.showResult();
        bigNumResultView.showResult();
    }
}
