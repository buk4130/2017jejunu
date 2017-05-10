import View.*;

/**
 * Created by seonghohong on 2017. 4. 27..
 */
public class Main {

    //질문 클래스
    private static MenuView menuView = new MenuView();
    private static AskView askNumView = new AskView();

    //결과 보여주는 클래스
    private static ViewWork listSumView = new ListSumView();
    private static ViewWork bigNumView = new BigNumView();
    private static ViewWork oddNumView = new OddNumView();
    private static ViewWork evenNumView = new EvenNumView();
    private static ViewWork sortListView = new SortListView();

    //배열 받아오는 클래스
    private static ListGetter listGetter = new ListGetter();

    //계산 클래스
    private static Calculator calculator = new Calculator();

    public static void main(String args[]) {
        setClass();
    }

    public static void setClass() {
        MenuController menuController = new MenuController(menuView, askNumView,
                listSumView, bigNumView, oddNumView, evenNumView, sortListView,
                listGetter, calculator);

        menuController.menuOrder();
    }
}
