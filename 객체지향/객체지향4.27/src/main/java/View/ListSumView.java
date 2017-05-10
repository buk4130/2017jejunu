package View;

/**
 * Created by seonghohong on 2017. 5. 3..
 */
public class ListSumView  extends ViewWork<Integer>{

    private int listSum;

    public void setResult(Integer listSum) {
        this.listSum = listSum;
    }

    public void showResult() { System.out.println("리스트의 홀수의 개수는 "+listSum+" 입니다."); }
}
