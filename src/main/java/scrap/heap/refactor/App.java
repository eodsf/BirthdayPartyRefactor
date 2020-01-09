package scrap.heap.refactor;

import scrap.heap.refactor.domain.Balloon;
import scrap.heap.refactor.domain.Cake;

import java.util.Map;

/**
 * Birthday Party App module
 */
public class App {
    /**
     * Returns the default application greeting
     *@return The default application greeting
     */
    public String getGreeting() {
        return "Hello world.";
    }

    //Note : I decided to effectively remove the main method here, in favor of driving all tests from JUnit;
    // the sample orders driven from here have been converted to the new APIs & are called from
    //scrap.heap.refactor.AppTest.testOrder
    /*
    public static void main(String[] args) {
    }
    */

    /**
     * Place a cake order; for now, the return is a confirmation message
     *
     * @param cake The cake to be ordered
     * @return A confirmation message
     */
    public String orderCake(final Cake cake) {

        final StringBuilder sb = new StringBuilder("Cake ordered :  ");
        sb.append(cake);
        return sb.toString();
    }

    /**
     * Place a balloon order; for now, the return is a confirmation message
     *
     * @param balloons The balloons to be ordered; a Map of balloon type to quantity
     * @return A confirmation message
     */
    public String orderBalloons(final Map<Balloon, Integer> balloons) {

        final StringBuilder sb = new StringBuilder("Balloons ordered :");
        for (Balloon balloon : balloons.keySet()) {
            sb.append("\n");
            sb.append(balloon);
            sb.append(" number : ");
            sb.append(balloons.get(balloon));
        }
        return sb.toString();
    }

    /**
     * Places a party party order for the specified balloons & cake
     *
     * @param balloons The balloons specified
     * @param cake     The cake specified
     * @return A confirmation message
     */
    public String order(final Map<Balloon, Integer> balloons, final Cake cake) {
        StringBuilder sb = new StringBuilder("Here is your confirmation for your party order:\n");
        sb.append(orderBalloons(balloons));
        sb.append("\n");
        sb.append(orderCake(cake));
        return sb.toString();
    }
}
