public class Frogsimulation {

    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        /* implementation not shown */
    }

    public boolean simulate()
    {
        int position = 0;

        for (int i = 0; i < maxHops; i++) {
    		position += hopDistance();

            if (position >= goalDistance) {
                return true;
            }
            else if (position < 0) {
                return false;
            }

        }
        return false;

    }

    public double runSimulations(int num)
    {
        int successes = 0;
    	for (int i = 0; i < num; i++) {
            if (simulate()) {
              successes++;
            }
        }
        return (double) successes / num;

    }
}
