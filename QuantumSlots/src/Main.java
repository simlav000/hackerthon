import Potentials.InfiniteSquareWell;
import Potentials.PotentialFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> basis = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Double> magn = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0));
        PotentialFunction pot = new InfiniteSquareWell(basis, magn, 2);
    }
}