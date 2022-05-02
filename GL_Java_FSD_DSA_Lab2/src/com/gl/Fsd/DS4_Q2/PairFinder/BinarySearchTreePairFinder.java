package com.gl.Fsd.DS4_Q2.PairFinder;

import java.util.LinkedHashSet;
import java.util.Set;

public class BinarySearchTreePairFinder {

	private BinarySearchTree tree;
	private boolean found = false;

	public BinarySearchTreePairFinder(BinarySearchTree tree) {

		this.tree = tree;
	}

	public void findPair(int sum) {

		Set<Integer> nodes = new LinkedHashSet<Integer>();

		findPairInternal(sum, tree.getRoot(), nodes);

		if (!found) {
			System.out.println("\tFor the Given, Sum [" + sum + "] \nMatching nodes NOT found");
		}
	}

	private boolean findPairInternal(int sum, BinarySearchTreeNode aNode, Set<Integer> nodes) {

		if (aNode == null) {
			return false;
		}

		found = findPairInternal(sum, aNode.getLeftNode(), nodes);
		if (found) {
			return true;
		}

		int difference = sum - aNode.getData();

		if (nodes.contains(difference)) {

			found = true;
			System.out.println("\tFor the Given, Sum [" + sum + "] \nMatching nodes are  -> [" + aNode.getData() + ", "
					+ difference + "]");
			return found;
		} else {

			nodes.add(aNode.getData());
		}

		if (!found) {
			return findPairInternal(sum, aNode.getRightNode(), nodes);
		} else {
			return true;
		}
	}

}
