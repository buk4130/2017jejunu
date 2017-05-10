package View;

/**
 * Created by seonghohong on 2017. 5. 3..
 */
public class BigNumView extends ViewWork<Integer>{
    private int bigNum;

    public void setResult(Integer bigNum) {
        this.bigNum = bigNum;
    }

    public void showResult() { System.out.println("입력하신 수중에 가장 큰 수는 "+bigNum+" 입니다."); }
}
