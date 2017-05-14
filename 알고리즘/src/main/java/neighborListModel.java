/**
 * Created by samsung on 2017-05-14.
 */
public class neighborListModel {

    private String[] neighList;
    private int[] friendshipList;

    public neighborListModel(String[] neighList, int[] friendshipList) {
        this.neighList = neighList;
        this.friendshipList = friendshipList;
    }

    public String getNeigh(int neighborCode) {
        String neighborName;

        if(neighborCode < neighList.length) neighborName = neighList[neighborCode];
        else neighborName = null;

        return neighborName;
    }

    public int getFriendshipList(int friendshipCode) {
        int friendship;

        if (friendshipCode < friendshipList.length) friendship = friendshipList[friendshipCode];
        else  friendship = 0;

        return friendship;
    }
}
