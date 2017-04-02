package books.eckel.concurrency.blockingQueueBreadDealer;

public class Toast  {

    public enum State {DRY,BUTTERED,JAMMED}
    private final int id;
    private State state = State.DRY;

    public Toast(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
