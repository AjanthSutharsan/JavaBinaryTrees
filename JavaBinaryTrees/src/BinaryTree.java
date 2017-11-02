public class BinaryTree {

    private BinaryNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public void addNode(String value, boolean recursively) {
        if (root == null) {
            root = new BinaryNode(value);
        } else {
            if (recursively) {
                addNodeRecursively(root, value);
            } else {
                addNodeIteratively(root, value);
            }
        }
    }

    public void addNodeRecursively(BinaryNode node, String value) {
        if (value.compareTo(node.getValue()) < 0) {
            if (node.getLeftChild() == null) {
                node.setLeftChild(new BinaryNode(value));
            } else {
                addNodeRecursively(node.getLeftChild(), value);
            }
        } else {
            if (node.getRightChild() == null) {
                node.setRightChild(new BinaryNode(value));
            } else {
                addNodeRecursively(node.getRightChild(), value);
            }
        }
    }

    public void addNodeIteratively(BinaryNode node, String value) {
        BinaryNode newNode = new BinaryNode(value);
        while (true) {
            if (newNode.getValue().compareTo(node.getValue()) < 0) {
                if (node.getLeftChild() == null) {
                    node.setLeftChild(newNode);
                    break;
                } else {
                    node = node.getLeftChild();
                }
            } else {
                if (node.getRightChild() == null) {
                    node.setRightChild(newNode);
                    break;
                } else {
                    node = node.getRightChild();
                }
            }
        }
    }


}

