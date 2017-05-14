/**
 * Created by samsung on 2017-05-14.
 */
public class Controller {

    String[] 성호Neighbor = {"승호", "동완", "재현", "택종"};
    int[] 성호Friendship = {10, 9, 7, 8};

    String[] 승호Neighbor = {"영훈", "성호"};
    int[] 승호Frienship = {8, 10};

    String[] 동완Neighbor = {"형남", "영훈", "성호"};
    int[] 동완FriendShip = {5, 6, 9};

    String[] 재현Neighbor = {"은형", "지완", "형남", "성호"};
    int[] 재현Frienship = {2, 1, 4, 7};

    String[] 택종Neighbor = {"영훈", "성호"};
    int[] 택종Frienship = {8, 10, 8};

    String[] 철환Neighbor = {"영훈", "형남"};
    int[] 철환Frienship = {6, 9};

    String[] 형남Neighbor = {"동완", "재현", "철환"};
    int[] 형남Frienship = {5, 4, 9};

    String[] 다민Neighbor = {"은형"};
    int[] 다민Frienship = {3};

    String[] 은형Neighbor = {"다민", "재현"};
    int[] 은형Frienship = {3, 2};

    String[] 지완Neighbor = {"재현", "택종", "동환"};
    int[] 지완Frienship = {1, 10, 1};

    String[] 송지Neighbor = {"택종", "동환"};
    int[] 송지Frienship = {8, 7};

    String[] 동건Neighbor = {"동환"};
    int[] 동건Frienship = {2};

    String[] 효석Neighbor = {"동환"};
    int[] 효석Frienship = {4};

    neighborListModel 성호;
    neighborListModel 승호;
    neighborListModel 동완;
    neighborListModel 재현;
    neighborListModel 택종;
    neighborListModel 철환;
    neighborListModel 형남;
    neighborListModel 다민;
    neighborListModel 은형;
    neighborListModel 지완;
    neighborListModel 송지;
    neighborListModel 동건;
    neighborListModel 효석;
    neighborListModel[] models;

//    public Controller(String[] listName) {
//        this.listName = listName;
//    }

    public void makeNeighborList() {
        models = {성호(성호Neighbor, 성호Friendship)};
    }

    public void run() {

    }
}
