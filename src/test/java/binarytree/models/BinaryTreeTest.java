package binarytree.models;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTest {

    BinaryTree tree = new BinaryTree(List.of(1, 2, 3, 4, 5, 6, 7));

    @Test
    public void testPreInPostOrderList() {
        assertEquals(tree.preOrderList(), List.of(1, 2, 4, 5, 3, 6, 7));
        assertEquals(tree.inOrderList(), List.of(4, 2, 5, 1, 6, 3, 7));
        assertEquals(tree.postOrderList(), List.of(4, 5, 2, 6, 7, 3, 1));
    }

}