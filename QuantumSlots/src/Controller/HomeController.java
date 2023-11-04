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
        // Check if in the right range? or assume that the gui controls the bounds
        player.setSelectors(selector1, selector2);
    }

    public void tick(){
        // Check for the measurement event


    }

    public void changePotential(Potentials potential){
        potential = potential;
    }
    public void measure(){}

}
