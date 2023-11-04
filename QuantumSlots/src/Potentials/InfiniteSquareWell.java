package Potentials;

import Model.Potentials;

public class InfiniteSquareWell extends PotentialFunction {
    // Infinite square well is defined by two ends where the wavefunction
    // is zero and standing waves between the ends.
    int leftEnd = -1;
    int rightEnd = 1;

    public InfiniteSquareWell() {this.potentialStructure = Potentials.InfiniteSquareWell;}

    public float wavefunction(float x, float t, int n) {
        double E_n;
        double total = 0;
        for (int i = 0; i < n; i++) {
            E_n = Math.pow(n,2) * Math.pow(Math.PI, 2) * Math.pow(hbar,2) / 4 * m;
            total += Math.sqrt(1/n) * Math.sin(n * Math.PI * x / 2) * Math.cos(E_n * t/hbar);
        }
    }
}
