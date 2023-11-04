package Potentials;

import Model.Potentials;

public abstract class PotentialFunction {
    Potentials potentialStructure;

    public Potentials getPotentialStructure() {
        return potentialStructure;
    }

    public float measure(double time){
        return 0;
    }
}
