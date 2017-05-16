/**
 * Created by samsung on 2017-05-14.
 */
public class NeighborListmodel {

    private int[] neighList;
    private int[] friendshipList;

    public NeighborListmodel(int[] neighList, int[] friendshipList) {
        this.neighList = neighList;
        this.friendshipList = friendshipList;
    }

    public int getNeighbor(int nodeCode) {
        int neighborCode;

        if (nodeCode < neighList.length) neighborCode = neighList[nodeCode];
        else neighborCode = 0;

        return neighborCode;
    }

    public int getFriendshipList(int friendshipCode) {
        int friendship;

        if (friendshipCode < friendshipList.length) friendship = friendshipList[friendshipCode];
        else friendship = 0;

        return friendship;
    }

    public int getNeighborLength() {
        return neighList.length;
    }
}
