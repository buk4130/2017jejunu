import View.AskView;

/**
 * Created by seonghohong on 2017. 4. 27..
 */
public class Main {

    public static void main(String args[]) {
        controller();
    }

    public static void controller() {
        ListGetter listGetter = new ListGetter();
        AskView view = new AskView();

        view.askNum();
        int listLength = listGetter.getNum();
        view.askList();
        int[] numList = listGetter.getList(listLength);

        Calculator calculator = new Calculator();

        int listSum = calculator.getListSum(numList);

        calculator.setOddEvenList(numList);
        //int[] oddNum = calculator.getOddList();
        //int[] evenNum = calculator.getEvenList();

        int[] sortList = calculator.getSortList(numList);

        
    }
}
