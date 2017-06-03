package 출력뷰.주문서메인뷰;

import java.util.ArrayList;

/**
 * Created by samsung on 2017-06-02.
 */
public class 계산기 {
    private int[] 개수리스트;
    private int[] 가격리스트;

    public int 총개수얻기 (int[] 개수리스트) {
        int 총개수 = 0;
        this.개수리스트 = 개수리스트;

        for(int i=0; i<개수리스트.length;i++) {
            총개수 += 개수리스트[i];
        }

        return 총개수;
    }

    public int 총가격얻기(int[] 가격리스트) {
        int 총가격 = 0;
        this.가격리스트 = 가격리스트;

        for(int i=0; i<가격리스트.length; i++) {
            총가격 += 가격리스트[i];
        }

        return 총가격;
    }
}
