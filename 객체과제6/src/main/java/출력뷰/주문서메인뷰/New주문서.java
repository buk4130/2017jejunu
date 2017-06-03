package 출력뷰.주문서메인뷰;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by samsung on 2017-05-26.
 */
public class New주문서 extends JFrame implements MouseListener, ActionListener {

    JButton[] 메뉴버튼;
    JPanel 차림표;
    JLabel 차림표이름, 주문총개수, 주문총가격;

    JScrollPane jScrollPane;
    JTable 주문테이블;
    JButton 제거, 전체제거, 계산;
    DefaultTableModel 주문생성;

    String[] 음식리스트 = new String[]{"정식", "갈비탕", "비빔밥", "제육덮밥", "컵밥", "밥버거", "짜장면", "짬뽕", "국밥", "비빔국수"};
    int[] 음식가격리스트 = new int[]{9000, 8000, 7000, 6000, 5000, 4000, 3000, 2000, 1000, 10000};
    int[] 주문개수인덱스 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] 주문가격인덱스 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    계산기 계산기;
    int 총개수 = 0;
    int 총가격 = 0;

    public New주문서() {
        계산기 = new 계산기();

        setTitle("출력뷰.주문서메인뷰.New주문서");
        setBounds(800, 600, 1400, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        메뉴버튼 = new JButton[음식리스트.length];
        차림표 = new JPanel();
        차림표이름 = new JLabel("3번 테이블 계산");
        차림표.add(차림표이름);
        차림표.setBounds(30, 50, 500, 800);

        int 버튼가로거리 = 250;
        int 버튼세로거리 = 150;
        int 세로인덱스 = 0;
        int 가로인덱스 = 0;
        int index = 1;

        for (int i = 0; i < 음식리스트.length; i++) {

            if (index % 2 == 0) {
                메뉴버튼[i] = new JButton(음식리스트[i] + ": " + 음식가격리스트[i]);
                메뉴버튼[i].setBounds(50 + 버튼가로거리 * 가로인덱스, 100 + 버튼세로거리 * 세로인덱스, 200, 100);
                세로인덱스++;
            } else {
                가로인덱스 = 0;
                메뉴버튼[i] = new JButton(음식리스트[i] + ": " + 음식가격리스트[i]);
                메뉴버튼[i].setBounds(50 + 버튼가로거리 * 가로인덱스, 100 + 버튼세로거리 * 세로인덱스, 200, 100);
                가로인덱스++;
            }
            index++;

            add(메뉴버튼[i]);
        }


        String[] 주문컬럼 = {"음식이름", "음식개수", "합계"};
        주문생성 = new DefaultTableModel();
        주문생성.setColumnIdentifiers(주문컬럼);
        주문테이블 = new JTable(주문생성);
        jScrollPane = new JScrollPane(주문테이블);

        제거 = new JButton("주문 제거");
        전체제거 = new JButton("주문 초기화");
        계산 = new JButton("계산");

        setLayout(null);
        jScrollPane.setBounds(700, 50, 400, 500);
        제거.setBounds(700, 700, 120, 50);
        전체제거.setBounds(840, 700, 120, 50);
        계산.setBounds(980, 700, 120, 50);

        setLayout(null);
        주문총개수 = new JLabel("총개수 : " + 총개수 + " 개");
        주문총개수.setBounds(700, 600, 120, 20);
        주문총가격 = new JLabel("총가격 : " + 총가격 + " 원");
        주문총가격.setBounds(700, 620, 120, 20);

        add(차림표);
        add(jScrollPane);
        add(제거);
        add(전체제거);
        add(계산);
        add(주문총개수);
        add(주문총가격);
        setVisible(true);

        eventUP();

    }

    private void eventUP() {
        for (int i = 0; i < 음식리스트.length; i++) {
            메뉴버튼[i].addActionListener(this);
        }

        제거.addActionListener(this);
        전체제거.addActionListener(this);
        계산.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        Object 주문내용[] = new Object[3];
        int 행길이 = 주문테이블.getRowCount();
        int 주문존재인덱스 = -1;


        for (int a = 0; a < 메뉴버튼.length; a++) {
            if (ob == 메뉴버튼[a]) {
                for (int b = 0; b < 행길이; b++) {
                    if (주문테이블.getValueAt(b, 0) == 음식리스트[a]) 주문존재인덱스 = b;
                }
            }
        }


        for (int i = 0; i < 메뉴버튼.length; i++) {
            if (ob == 메뉴버튼[i] && 주문존재인덱스 == -1) {
                주문개수인덱스[i]++;
                주문가격인덱스[i] += 음식가격리스트[i];
                주문내용[0] = 음식리스트[i].toString();
                주문내용[1] = 주문개수인덱스[i];
                주문내용[2] = 음식가격리스트[i];

                주문생성.addRow(주문내용);

                총개수 = 계산기.총개수얻기(주문개수인덱스);
                주문총개수.setText("총개수 : " + 총개수 + " 개");

                총가격 = 계산기.총가격얻기(주문가격인덱스);
                주문총가격.setText("총가격 : " + 총가격 + " 원");
                break;
            } else if (ob == 메뉴버튼[i] && 주문존재인덱스 != -1) {
                주문개수인덱스[i]++;
                주문가격인덱스[i] += 음식가격리스트[i];
                int 가격 = 음식가격리스트[i] * 주문개수인덱스[i];
                주문테이블.setValueAt(주문개수인덱스[i], 주문존재인덱스, 1);
                주문테이블.setValueAt(가격, 주문존재인덱스, 2);

                총개수 = 계산기.총개수얻기(주문개수인덱스);
                주문총개수.setText("총개수 : " + 총개수 + " 개");

                총가격 = 계산기.총가격얻기(주문가격인덱스);
                주문총가격.setText("총가격 : " + 총가격 + " 원");

                break;
            }
        }

        if (ob == 제거) {
            int 선택된행 = 주문테이블.getSelectedRow();

            if (선택된행 != -1) {
                int index = 0;

                for (int i = 0; i < 음식리스트.length; i++) {
                    if (음식리스트[i] == 주문테이블.getValueAt(선택된행, 0)) {
                        index = i;
                        break;
                    }
                }

                주문생성.removeRow(선택된행);

                주문개수인덱스[index] = 0;
                주문가격인덱스[index] = 0;
            }

            총개수 = 계산기.총개수얻기(주문개수인덱스);
            주문총개수.setText("총개수 : " + 총개수 + " 개");

            총가격 = 계산기.총가격얻기(주문가격인덱스);
            주문총가격.setText("총가격 : " + 총가격 + " 원");
        }

        if (ob == 전체제거) {
            주문생성.setNumRows(0);
            주문개수인덱스 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            주문가격인덱스 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            총개수 = 계산기.총개수얻기(주문개수인덱스);
            주문총개수.setText("총개수 : " + 총개수 + " 개");

            총가격 = 계산기.총가격얻기(주문가격인덱스);
            주문총가격.setText("총가격 : " + 총가격 + " 원");
        }

        if(ob == 계산) {
            주문결과창 주문결과창 = new 주문결과창(주문생성, 총개수, 총가격);
        }
    }


    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new New주문서();
    }
}
