
package basic;
abstract class Match {
    private int currentScore;
    private float currentOver;
    private int target;
    public int getCurrentScore() {
        return currentScore;
    }
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
    public float getCurrentOver() {
        return currentOver;
    }
    public void setCurrentOver(float currentOver) {
        this.currentOver = currentOver;
    }
    public int getTarget() {
        return target;
    }
    public void setTarget(int target) {
        this.target = target;
    }
    public abstract float calculateRunRate();
    public abstract int calculateBalls();
    public void display(double reqRunRate, int balls) {
        System.out.println("Required Run Rate: " + reqRunRate);
        System.out.println("Required Balls: " + balls);
        System.out.println("Need  "+(target-currentScore)+ " runs in "+balls+ " balls ");
    }
}

class ODIMatch extends Match {
    public ODIMatch(int currentScore, float currentOver, int target) {
        setCurrentScore(currentScore);
        setCurrentOver(currentOver);
        setTarget(target);
    }

    public float calculateRunRate() {
        return (getTarget() - getCurrentScore()) / (50 - getCurrentOver());
    }

    public int calculateBalls() {
        return (int) ((50 - getCurrentOver()) * 6);
    }
}

class TestMatch extends Match {
    public TestMatch(int currentScore, float currentOver, int target) {
        setCurrentScore(currentScore);
        setCurrentOver(currentOver);
        setTarget(target);
    }
    public float calculateRunRate() {
        return (getTarget() - getCurrentScore()) / (90 - getCurrentOver());
    }

    public int calculateBalls() {
        return (int) ((90 - getCurrentOver()) * 6);
    }
}
class T20Match extends Match {
    public T20Match(int currentScore, float currentOver, int target) {
        setCurrentScore(currentScore);
        setCurrentOver(currentOver);
        setTarget(target);
    }
    public float calculateRunRate() {
        return (getTarget() - getCurrentScore()) / (20 - getCurrentOver());
    }
    public int calculateBalls() {
        return (int) ((20 - getCurrentOver()) * 6);
    }
}

