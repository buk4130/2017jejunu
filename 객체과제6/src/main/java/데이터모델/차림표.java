package 데이터모델;

/**
 * Created by samsung on 2017-05-10.
 */
public class 차림표 {
    private String[] 음식리스트;
    private int[] 음식가격리스트;

    public 차림표(String[] 음식리스트, int[] 음식가격리스트) {
        this.음식리스트 = 음식리스트;
        this.음식가격리스트 = 음식가격리스트;
    }

    public String 코드음식얻기(int 코드번호) {
        String 음식이름 = new String();
        int 코드인덱스 = 0;

        for (int i = 0; i < 음식리스트.length; i++) {
            if (코드번호 == 코드인덱스) 음식이름 = 음식리스트[i];
            코드인덱스++;
        }

        return 음식이름;
    }

    public int 음식개수얻기(){
        return 음식리스트.length;
    }

    public int 코드가격얻기(int 코드번호) {
        int 음식가격 = 0;
        int 코드인덱스 = 0;

        for (int i = 0; i < 음식가격리스트.length; i++) {
            if (코드번호 == 코드인덱스) 음식가격 = 음식가격리스트[i];
            코드인덱스++;
        }

        return 음식가격;
    }
}
