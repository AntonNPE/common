package sierraBeits.ch15.counter;

public class Unit  {

    private int countAmount;
    private  static Unit unit;

    public int getCountAmount() {
        return countAmount;
    }

    private Unit (){

    }

    public static Unit  getUnit(){
        if (unit==null) unit = new Unit();
         return unit;
    }


    public synchronized void increment (){
        countAmount++;
    }


}
