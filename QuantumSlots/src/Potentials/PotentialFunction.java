package Potentials;

import Model.Potentials;

public abstract class PotentialFunction {
    double hbar = 1.05457182E-34;
    double m = 9.1093837E-31;
    Potentials potentialStructure;

    public Potentials getPotentialStructure() {
        return potentialStructure;
    }
}
