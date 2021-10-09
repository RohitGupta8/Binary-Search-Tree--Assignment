package com.bl.binarysearchtree;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryNodeTest {

    @Test
    public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }
}
