import java.util.ArrayDeque;

public class Main
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        /* INSERT WORDS HERE */

        tree.addNode("Pear", true);
        tree.addNode("Grape", true);
        tree.addNode("Pineapple", true);
        tree.addNode("Lemon", true);
        tree.addNode("Grapefruit", true);
        tree.addNode("Lime", true);
        tree.addNode("Apple", true);
        tree.addNode("Strawberry", true);
        tree.addNode("Raspberry", true);
        tree.addNode("Melon", true);
        tree.addNode("Kiwi", true);
        tree.addNode("Blueberry", true);
        tree.addNode("Blackcurrant", true);
        tree.addNode("Banana", true);

        /* - - - - - - - - - */

        System.out.println("In-Order:");
        inOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("Pre-Order:");
        preOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("Post-Order:");
        postOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("Stack-Printed:");
        stackPrint(tree.getRoot());
        System.out.println();
    }

    private static void inOrderTraverse(BinaryNode node) {
        if (node.getLeftChild() != null) inOrderTraverse(node.getLeftChild());
        System.out.println(node.getValue());
        if (node.getRightChild() != null) inOrderTraverse(node.getRightChild());
    }

    private static void preOrderTraverse(BinaryNode node) {
        System.out.println(node.getValue());
        if (node.getLeftChild() != null) preOrderTraverse(node.getLeftChild());
        if (node.getRightChild() != null) preOrderTraverse(node.getRightChild());
    }

    private static void postOrderTraverse(BinaryNode node) {
        if (node.getLeftChild() != null) postOrderTraverse(node.getLeftChild());
        if (node.getRightChild() != null) postOrderTraverse(node.getRightChild());
        System.out.println(node.getValue());
    }

    public static void stackPrint(BinaryNode root)
    {
        ArrayDeque<BinaryNode> stack = new ArrayDeque<>();
        BinaryNode node = root;

        while (node != null) {
            stack.push(node);
            node = node.getLeftChild();
        }

        while (stack.size() > 0)
        {

            node = stack.pop();
            String line = "";
            for (BinaryNode parent = node.getParent();
                 parent != null;
                 parent = parent.getParent())
            {
                line += "----";
            }
            line += "-> " + node.getValue();

            System.out.println(line);

            if (node.getRightChild() != null)
            {
                node = node.getRightChild();
                while (node != null)
                {
                    stack.push(node);
                    node = node.getLeftChild();
                }
            }

        }



    }



}