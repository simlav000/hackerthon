package Controller;

import Model.Player;
import Model.Potentials;
import Potentials.PotentialFunction;
import Service.RewardService;

public class HomeController {
    private Player player;
    private RewardService rewardService;
    private PotentialFunction potential;

    public void placeBet(int bet){
        player.setBet(bet);
    }

    public void selectRange(float selector1, float selector2){
    }

    public void tick(){

    }

    public void changePotential(Potentials potential){}
    public void measure(){}

}
