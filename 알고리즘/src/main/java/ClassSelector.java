/**
 * Created by samsung on 2017-05-15.
 */
public class ClassSelector {

    int[] neighbor0 = {1, 2, 3, 4};
    int[] friendship0 = {10, 9, 7, 8};

    int[] neighbor1 = {14, 0};
    int[] friendship1 = {8, 10};

    int[] neighbor2 = {6, 14, 0};
    int[] friendship2 = {5, 6, 9};

    int[] neighbor3 = {8, 9, 6, 0};
    int[] friendship3 = {2, 1, 4, 7};

    int[] neighbor4 = {10, 9, 0};
    int[] friendship4 = {8, 10, 8};

    int[] neighbor5 = {14, 6};
    int[] friendship5 = {6, 9};

    int[] neighbor6 = {2, 3, 5};
    int[] friendship6 = {5, 4, 9};

    int[] neighbor7 = {8};
    int[] friendship7 = {3};

    int[] neighbor8 = {7, 3};
    int[] friendship8 = {3, 2};

    int[] neighbor9 = {3, 4, 13};
    int[] friendship9 = {1, 10, 1};

    int[] neighbor10 = {4, 13};
    int[] friendship10 = {8, 7};

    int[] neighbor11 = {13};
    int[] friendship11 = {2};

    int[] neighbor12 = {13};
    int[] friendship12 = {4};

    int[] neighbor13 = {10, 9, 11, 12};
    int[] friendship13 = {7, 1, 2, 15};

    int[] neighbor14 = {1, 2, 5};
    int[] friendship14 = {8, 6, 6};

    NeighborListmodel neighborListmodel0;
    NeighborListmodel neighborListmodel1;
    NeighborListmodel neighborListmodel2;
    NeighborListmodel neighborListmodel3;
    NeighborListmodel neighborListmodel4;
    NeighborListmodel neighborListmodel5;
    NeighborListmodel neighborListmodel6;
    NeighborListmodel neighborListmodel7;
    NeighborListmodel neighborListmodel8;
    NeighborListmodel neighborListmodel9;
    NeighborListmodel neighborListmodel10;
    NeighborListmodel neighborListmodel11;
    NeighborListmodel neighborListmodel12;
    NeighborListmodel neighborListmodel13;
    NeighborListmodel neighborListmodel14;

    public ClassSelector() {
        neighborListmodel0 = new NeighborListmodel(neighbor0, friendship0);
        neighborListmodel1 = new NeighborListmodel(neighbor1, friendship1);
        neighborListmodel2 = new NeighborListmodel(neighbor2, friendship2);
        neighborListmodel3 = new NeighborListmodel(neighbor3, friendship3);
        neighborListmodel4 = new NeighborListmodel(neighbor4, friendship4);
        neighborListmodel5 = new NeighborListmodel(neighbor5, friendship5);
        neighborListmodel6 = new NeighborListmodel(neighbor6, friendship6);
        neighborListmodel7 = new NeighborListmodel(neighbor7, friendship7);
        neighborListmodel8 = new NeighborListmodel(neighbor8, friendship8);
        neighborListmodel9 = new NeighborListmodel(neighbor9, friendship9);
        neighborListmodel10 = new NeighborListmodel(neighbor10, friendship10);
        neighborListmodel11 = new NeighborListmodel(neighbor11, friendship11);
        neighborListmodel12 = new NeighborListmodel(neighbor12, friendship12);
        neighborListmodel13 = new NeighborListmodel(neighbor13, friendship13);
        neighborListmodel14 = new NeighborListmodel(neighbor14, friendship14);
    }

    public NeighborListmodel getClassOfNum(int num) {

        NeighborListmodel neighborListModel;

        if (num == 0) neighborListModel = neighborListmodel0;
        else if (num == 1) neighborListModel = neighborListmodel1;
        else if (num == 2) neighborListModel = neighborListmodel2;
        else if (num == 3) neighborListModel = neighborListmodel3;
        else if (num == 4) neighborListModel = neighborListmodel4;
        else if (num == 5) neighborListModel = neighborListmodel5;
        else if (num == 6) neighborListModel = neighborListmodel6;
        else if (num == 7) neighborListModel = neighborListmodel7;
        else if (num == 8) neighborListModel = neighborListmodel8;
        else if (num == 9) neighborListModel = neighborListmodel9;
        else if (num == 10) neighborListModel = neighborListmodel10;
        else if (num == 11) neighborListModel = neighborListmodel11;
        else if (num == 12) neighborListModel = neighborListmodel12;
        else if (num == 13) neighborListModel = neighborListmodel13;
        else if (num == 14) neighborListModel = neighborListmodel14;
        else neighborListModel = null;

        return neighborListModel;
    }
}
