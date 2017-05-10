package 출력자모음;

import 차림표모델.차림표;

/**
 * Created by samsung on 2017-05-10.
 */
public class 차림표출력자 extends 출력자<차림표> {
    private 차림표 차림;

    protected void 출력값설정(차림표 차림) {
        this.차림 = 차림;
    }

    protected void 출력() {
        int 음식인덱스 = 1;

        System.out.println("* 음식명과 가격 ");
        for(int i=0; i<차림.음식개수얻기(); i++){
            System.out.println(""+음식인덱스+"." + 차림.코드음식얻기(i) + ": " + 차림.코드가격얻기(i) + "원");
            음식인덱스++;
        }
    }
}
