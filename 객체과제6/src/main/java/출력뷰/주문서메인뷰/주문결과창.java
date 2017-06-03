package 출력뷰.주문서메인뷰;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by samsung on 2017-06-02.
 */
public class 주문결과창 extends JFrame {

    JTable 결과테이블;
    DefaultTableModel 결과;
    JScrollPane jScrollPane;

    JButton 카드, 현금, 할인;

    JLabel 결과총개수, 결과총가격;

    int 총개수 = 0;
    int 총가격 = 0;

    public 주문결과창(DefaultTableModel 결과, int 총개수, int 총가격) {
        this.결과 = 결과;
        this.총개수 = 총개수;
        this.총가격 = 총가격;

        setTitle("3번 테이블 주문서");
        setBounds(500, 300, 800, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String[] 결과컬럼 = {"음식이름", "음식개수", "합계"};
        결과.setColumnIdentifiers(결과컬럼);
        결과테이블 = new JTable(결과);
        jScrollPane = new JScrollPane(결과테이블);
        setLayout(null);
        jScrollPane.setBounds(100, 100, 600, 400);

        카드 = new JButton("카드");
        카드.setBounds(100,600,125,50);
        현금 = new JButton("현금");
        현금.setBounds(325,600,125,50);
        할인 = new JButton("할인");
        할인.setBounds(550,600,125,50);

        setLayout(null);
        결과총개수 = new JLabel("총개수 : " + 총개수 + " 개");
        결과총개수.setBounds(300, 500, 120, 20);
        결과총가격 = new JLabel("총가격 : " + 총가격 + " 원");
        결과총가격.setBounds(300, 520, 120, 20);

        add(jScrollPane);
        add(카드);
        add(현금);
        add(할인);
        add(결과총개수);
        add(결과총가격);
        setVisible(true);
    }

//    public static void main(String[] args) {
//        new 주문결과창();
//    }
}
