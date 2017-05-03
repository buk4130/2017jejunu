package View;

/**
 * Created by seonghohong on 2017. 5. 3..
 */
public class OddNumView implements ResultView<Integer> {

    private int oddNum;

    public void setResult(Integer oddNum) {
        this.oddNum = oddNum;
    }

    public void showResult() {
        System.out.println("리스트의 홀수의 개수는 "+oddNum+" 입니다.");
    }
}
