package Controller;

import Model.Player;
import Model.Potentials;
import Potentials.PotentialFunction;
import Service.RewardService;

public class HomeController {
    private Player player;
    private RewardService rewardService;
    private PotentialFunction potential;
    private double timer;

    public void placeBet(int bet){
        player.setBet(bet);
    }

    public void selectRange(float selector1, float selector2){
        // Check if in the right range? or assume that the gui controls the bounds
        player.setSelectors(selector1, selector2);
    }

    public void tick(){
        // Check for the measurement event
        // Update timer

    }

    public void changePotential(Potentials potential){
        potential = potential;
    }
    public double measure(){
        return potential.measure(timer);
    }

    private boolean didYaWinSon(double position){
        return position >= player.getSelector1position() && position <= player.getSelector2position();
    }

    public void updateCoins(){
        if (didYaWinSon(measure())){
            int reward = rewardService.getReward(potential.getPotentialStructure(), player.getSelector1position(), player.getSelector2position(), timer, player.getBet());
            player.setCoins(reward + player.getCoins());
        }
    }

}
