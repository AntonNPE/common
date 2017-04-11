package forta.task2.binarySearcher;

public class CustomLinkedList  {


    private CustomNode first;

    private CustomNode last;

    private int size;

    public CustomNode getFirst() {
        return first;
    }

    public CustomNode getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }

    private void setFirst(CustomNode first) {
        this.first = first;
    }

    private void setLast(CustomNode last) {
        this.last = last;
    }

    public void add (int aElement){

        CustomNode l = last;
        CustomNode nNode = new CustomNode(l,null,aElement);
        last = nNode;
        if (l==null){
            first = nNode;
        }
        else {
            l.setNexNode(nNode);
        }
        size++;
    }

}
