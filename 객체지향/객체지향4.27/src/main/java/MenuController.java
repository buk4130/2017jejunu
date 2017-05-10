import View.AskView;
import View.MenuView;
import View.ViewWork;

/**
 * Created by seonghohong on 2017. 5. 3..
 */
public class MenuController {
    //질문 클래스
    private MenuView menuView;
    private AskView askNumView;

    //결과 보여주는 클래스
    private ViewWork listSumView;
    private ViewWork bigNumView;
    private ViewWork oddNumView;
    private ViewWork evenNumView;
    private ViewWork sortListView;

    //배열 받아오는 클래스
    private ListGetter listGetter;

    //계산 클래스
    private Calculator calculator;

    //배열
    int[] list;
    public MenuController(MenuView menuView, AskView askNumView,
                          ViewWork listSumView, ViewWork bigNumView, ViewWork oddNumView, ViewWork evenNumView, ViewWork sortListView,
                          ListGetter listGetter,
                          Calculator calculator) {
        this.menuView = menuView; this.askNumView = askNumView;
        this.listSumView = listSumView; this.bigNumView = bigNumView; this.oddNumView = oddNumView; this.evenNumView = evenNumView; this.sortListView = sortListView;
        this.listGetter = listGetter;
        this.calculator = calculator;
    }

    public void menuOrder() {
        //배열길이 받아오기
        askNumView.askNum();
        int listLength = listGetter.getNum();
        list = new int[listLength];

        //배열값 받아오기
        askNumView.askList();
        list = listGetter.getList(listLength);

        //홀수, 짝수 개수 정리
        calculator.setOddEvenList(list);
        //배열값 정리
        calculator.setSortList(list);

        while(true) {
            menuView.showMenu();
            int menuNum = listGetter.getNum();
            //menuNum에 따라 출력값 다루기
            if (menuNum == 1) {
                //1번 배열 총합 계산
                int listSum = calculator.getListSum(list);
                listSumView.viewWork(listSum);
                menuView.border();
            } else if(menuNum == 2) {
                int bigNum = calculator.getBigNum();
                bigNumView.viewWork(bigNum);
                menuView.border();
            } else if(menuNum == 3) {
                int evenNum = calculator.getEvenNum();
                int oddNum = calculator.getOddNum();
                evenNumView.viewWork(evenNum);
                oddNumView.viewWork(oddNum);
                menuView.border();
            } else if(menuNum == 4) {
                int[] sortList = calculator.getSortList();
                sortListView.viewWork(sortList);
                menuView.border();
            } else {
                break;
            }
        }
    }
}
