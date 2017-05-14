package 출력자모음;

import 데이터모델.주문정보모델;

/**
 * Created by samsung on 2017-05-10.
 */
public class 가격출력문 extends 출력자<주문정보모델> {
    private 주문정보모델 주문정보;

    protected void 출력값설정(주문정보모델 주문정보) {this.주문정보 = 주문정보;}

    protected void 출력() {System.out.println("주문하신 내용은 "+주문정보.주문음식이름얻기()+" "+주문정보.주문음식개수얻기()+"개로 총 "+주문정보.주문가격얻기()+"원 입니다.");}
}
