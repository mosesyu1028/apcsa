public class LightBoard {

    private boolean[][] lights;

    // (a)
    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {

                if (Math.random() < 0.4) {
                    lights[r][c] = true;
                }
                else {
                    lights[r][c] = false;
                }

                // cool one-liner
                // lights[r][c] = Math.random() < 0.4;
            }
        }
    }
    
    // (b)
    public boolean evaluateLight(int row, int col) {

        // Determine amount of lights in column
        int lightsOn = 0;
        for (int r = 0; int r < row; r++) {
            if (lights[r][col]) {
                lightsOn++;
            }
        }

        // Check based on rules
        // 1. if on AND even, false
        if (lights[row][col] && lightsOn % 2 == 0) {
            return false;
        }
        // 2. if off AND % 3, true
        else if (lights[row][col] == false && lightsOn % 3 == 0) {
            return true;
        }
        // 3. else, return light status
        return lights[row][col];
    }
}
