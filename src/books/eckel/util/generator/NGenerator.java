package books.eckel.util.generator;

public abstract class NGenerator  {

    private boolean state = true;

    public boolean isStop(){
        return state;
    }

    public void interrupt(){
        state = false;
    }


    public abstract int next();

}
