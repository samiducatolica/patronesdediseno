package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(String species, String color, int x, int y) {
        TreeType treeType = TreeFactory.getTreeType(species, color);
        Tree tree = new TreeImpl(treeType, x, y);
        trees.add(tree);
    }

    public void displayTrees() {
        for (Tree tree : trees) {
            tree.display(tree.getX(), tree.getY());
        }
    }

    private static class TreeImpl implements Tree {
        private final TreeType treeType;
        private final int x;
        private final int y;

        public TreeImpl(TreeType treeType, int x, int y) {
            this.treeType = treeType;
            this.x = x;
            this.y = y;
        }

        @Override
        public void display(int x, int y) {
            treeType.display(x, y);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}