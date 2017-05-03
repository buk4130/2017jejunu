package View;

/**
 * Created by seonghohong on 2017. 5. 3..
 */
public class ListSumView  implements ResultView<Integer>{

    private int listSum;

    public void setResult(Integer listSum) {
        this.listSum = listSum;
    }

    public void showResult() {
        System.out.println("입력하신 숫자들의 합은 "+listSum+" 입니다.");
    }
}
