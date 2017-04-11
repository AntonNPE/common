package forta.task2.binarySearcher;

public class CustomNode {

    private CustomNode prevNode;
    private CustomNode nexNode;
    private int value;

    public CustomNode() {
    }

    public CustomNode(CustomNode prevNode, CustomNode nexNode, Integer value) {
        this.prevNode = prevNode;
        this.nexNode = nexNode;
        this.value = value;
    }

    public CustomNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(CustomNode prevNode) {
        this.prevNode = prevNode;
    }

    public CustomNode getNexNode() {
        return nexNode;
    }

    public void setNexNode(CustomNode nexNode) {
        this.nexNode = nexNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "value=" + value
                ;
    }
}
