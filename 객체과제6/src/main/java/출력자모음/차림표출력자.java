package 출력자모음;

import 데이터모델.차림표;

/**
 * Created by samsung on 2017-05-10.
 */
public class 차림표출력자 extends 출력자<차림표> {
    private 차림표 차림;

    protected void 출력값설정(차림표 차림) {
        this.차림 = 차림;
    }

    protected void 출력() {
        System.out.println("* 음식명과 가격 ");
        for(int i=0; i<차림.음식개수얻기(); i++){
            System.out.println(""+i+"." + 차림.코드음식얻기(i) + ": " + 차림.코드가격얻기(i) + "원");
        }
    }
}
