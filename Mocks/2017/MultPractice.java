// APCSA 2017 Q2 (Modified, removed interface)

public class MultPractice {

    private int first;
    private int second;


    public MultPractice(int a, int b) {
        first = a;
        second = b;
    };

    public String getProblem() {
        String s = first + " TIMES " + second;
        return s;
    }

    public void nextProblem() {
        second++;
    }

    // for funsies
    public int getAnswer() {
        int answer = first * second;
        return answer;
    }

}
