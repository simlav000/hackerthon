package Potentials;

import Model.Potentials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InfiniteSquareWell extends PotentialFunction {
    double squareWellWidth;
    /**
     * Default constructor for the infinite square well.
     * It creates a wave function with only the first eigenbasis
     */
    public InfiniteSquareWell() {
        super(Potentials.InfiniteSquareWell);
        squareWellWidth = 1;
    }

    /**
     * Constructor
     * @param basisFunctions Holds the values for which eigenbasis to use
     * @param magnitudes Holds the value of the magnitudes of the eigenbasis
     * @param squareWellWidth The width of the infinite square well
     */
    public InfiniteSquareWell(ArrayList<Integer> basisFunctions, ArrayList<Double> magnitudes, double squareWellWidth) {
        super(Potentials.InfiniteSquareWell, basisFunctions, magnitudes);
        this.squareWellWidth = squareWellWidth;
    }
    @Override
    public double evaluate(double position, double time) {
        return 0;
    }

    @Override
    public double makeMeasurement(double position, double time) {
        return 0;
    }

    @Override
    public double eigenBasis(double position, int basisNumber) {
        return 0;
    }
}
