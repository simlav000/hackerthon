package Service;

import Model.Potentials;

public class RewardService {
    public int getReward(Potentials potential, float selector1, float selector2, float time, int bet){
        switch (potential){
            case InfiniteSquareWell:
                return -1;
            default:
                throw new IllegalArgumentException("Potential not handled");
        }
    }
}
