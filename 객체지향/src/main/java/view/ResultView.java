package view;

/**
 * Created by seonghohong on 2017. 4. 6..
 */
public class ResultView {

    private String what;
    private int result;

    public ResultView(String what, int result) {
        this.what = what;
        this.result = result;
    }

    public void showResult() {
        System.out.println(""+what+"의 결과는 "+result+"입니다.");
    }
}
