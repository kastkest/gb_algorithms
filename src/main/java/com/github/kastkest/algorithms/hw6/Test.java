package com.github.kastkest.algorithms.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        List<Tree> treeList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            treeList.add(new TreeImpl());
            for (Tree tree : treeList) {
                tree.add(new Random().nextInt(1) * 50 - 25);
                tree.display();
            }
        }




//        Tree<Integer> tree = new TreeImpl<>();
//
//        tree.add(60);
//        tree.add(50);
//        tree.add(66);
//        tree.add(40);
//        tree.add(55);
//        tree.add(70);
//        tree.add(31);
//        tree.add(45);
//        tree.add(42);
//        tree.add(43);
//        tree.add(69);
//        tree.add(67);
//        tree.add(68);
//        tree.add(81);
//
//        tree.display();
//
//        tree.remove(40);
//
//        tree.display();
////
//        tree.traverse(Tree.TraversMode.IN_ORDER);
//        tree.traverse(Tree.TraversMode.PRE_ORDER);
//        tree.traverse(Tree.TraversMode.POST_ORDER);

    }
}
