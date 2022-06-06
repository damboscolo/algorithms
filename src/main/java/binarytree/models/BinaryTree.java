package binarytree.models;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public TreeNode root;

    public BinaryTree(List<Integer> list) {
        this.root = buildTree(list, 0);
    }

    private TreeNode buildTree(List<Integer> list, int level) {
        if (level >= list.size()) return null;

        TreeNode root = new TreeNode(list.get(level));
        root.left = buildTree(list, 2 * level + 1);
        root.right = buildTree(list, 2 * level + 2);
        return root;
    }

    public List<Integer> preOrderList() { return preOrderList(this.root); }
    private List<Integer> preOrderList(TreeNode node) {
        if (node == null) return List.of();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(node.val);
        arrayList.addAll(preOrderList(node.left));
        arrayList.addAll(preOrderList(node.right));
        return arrayList;
    }

    public List<Integer> inOrderList() { return inOrderList(this.root); }
    private List<Integer> inOrderList(TreeNode node) {
        if (node == null) return List.of();

        List<Integer> arraylist = new ArrayList<>();
        arraylist.addAll(inOrderList(node.left));
        arraylist.add(node.val);
        arraylist.addAll(inOrderList(node.right));
        return arraylist;
    }

    public List<Integer> postOrderList() { return postOrderList(this.root); }
    private List<Integer> postOrderList(TreeNode node) {
        if (node == null) return List.of();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(postOrderList(node.left));
        arrayList.addAll(postOrderList(node.right));
        arrayList.add(node.val);
        return arrayList;
    }

    public void printInOrder(TreeNode node) {
        if (node == null) return;

        printInOrder(node.left);
        System.out.print(node.val + ", ");
        printInOrder(node.right);
    }
}
