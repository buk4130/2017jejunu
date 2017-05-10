package 출력자모음;
/**
 * Created by samsung on 2017-05-10.
 */
public class 차림표출력자 extends 출력자<차림표> {
    private 차림표 차림;

    protected void 출력값설정(차림표 차림) { this.차림 = 차림; }

    protected void 출력() {

        System.out.println("* 음식명과 가격 ");
        for(int i=0; i<차림.메뉴리스트.length; i++){
            int 메뉴인덱스 = 1;
            System.out.println(""+메뉴인덱스+"."+차림.메뉴리스트[i]+" : "+차림.메뉴가격리스트[i]+" ");
        }
    }
}
