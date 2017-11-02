public class BinaryNode {

    private String value;
    private BinaryNode parent;
    private BinaryNode leftChild;
    private BinaryNode rightChild;

    public BinaryNode(String setValue) {
        value = setValue;
        parent = null;
        leftChild = null;
        rightChild = null;
    }

    public void setLeftChild(BinaryNode target) {
        leftChild = target;
        target.parent = this;
    }

    public void setRightChild(BinaryNode target) {
        rightChild = target;
        target.parent = this;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    public BinaryNode getParent() {
        return parent;
    }

    public String getValue() {
        return value;
    }

}
