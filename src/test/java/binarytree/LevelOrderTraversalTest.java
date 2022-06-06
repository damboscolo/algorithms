package binarytree;

import binarytree.models.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTraversalTest {

    LevelOrderTraversal t = new LevelOrderTraversal();

    @Test
    public void testLevelOrderTraversal() {
        BinaryTree tree = new BinaryTree(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(2, 3),
                List.of(4, 5, 6, 7),
                List.of(8)
        );
        assertEquals(t.traversal(tree.root), expected);
    }
}