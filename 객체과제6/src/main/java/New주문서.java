import javax.swing.*;
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
    JLabel 차림표이름;

    String[] 음식리스트 = new String[]{"정식", "갈비탕", "비빔밥", "제육덮밥", "컵밥", "밥버거", "짜장면", "짬뽕", "국밥", "비빔국수"};
    int[] 차림가격리스트 = new int[]{9000, 8000, 7000, 6000, 5000, 4000, 3000, 2000, 1000, 10000};

    public New주문서() {
        setTitle("New주문서");
        setBounds(800, 600, 1400, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        메뉴버튼 = new JButton[음식리스트.length];
        차림표 = new JPanel();
        차림표이름 = new JLabel("홍식당 차림표");
        차림표.add(차림표이름);
        차림표.setBounds(200, 200, 1000, 500);

        int 버튼가로거리 = 250;
        int 버튼세로거리 = 150;
        int 세로인덱스 = 0;
        int 가로인덱스 = 0;
        int index = 1;

        for(int i=0; i<음식리스트.length; i++) {

            if (index % 2 == 0) {
                메뉴버튼[i] = new JButton(음식리스트[i]);
                메뉴버튼[i].setBounds(50 + 버튼가로거리 * 가로인덱스, 100 + 버튼세로거리 * 세로인덱스, 200, 100);
                세로인덱스++;
            } else {
                가로인덱스 = 0;
                메뉴버튼[i] = new JButton(음식리스트[i]);
                메뉴버튼[i].setBounds(50 + 버튼가로거리 * 가로인덱스, 100 + 버튼세로거리 * 세로인덱스, 200, 100);
                가로인덱스++;
            }
            index++;

            add(메뉴버튼[i]);
        }

        add(차림표);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

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
