package TryingTrees;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        System.out.println("Корень: " + root.val);
        System.out.println("Левый потомок: " + root.left.val);
        System.out.println("Правый потомок: " + root.right.val);
        System.out.print("Обход: ");
        inOrder(root);

    }

    public static void inOrder (TreeNode node){
        if (node == null) return;

        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);


    }
}
/*
In-order (лево → корень → право) — для отсортированного вывода в BST

Pre-order (корень → лево → право)

Post-order (лево → право → корень)

Level-order (по уровням, как очередь)

 */

