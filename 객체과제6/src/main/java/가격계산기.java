import 차림표모델.차림표;

/**
 * Created by samsung on 2017-05-10.
 */
public class 가격계산기 {
    private 차림표 차림;

    public 가격계산기(차림표 차림) {this.차림 = 차림;}

    public int 가격계산하기(int 음식코드, int 음식개수) {
        int 음식가격 = 차림.코드가격얻기(음식코드);
        int 총_가격 = 음식가격*음식개수;

        return 총_가격;
    }
}
