package com.gl.Fsd.DS4_Q2.PairFinder;

public class BinarySearchTreePairFinderTest {

	public static void main(String[] args) {

		test(130);
		test(500);
		test(60);
		test(190);

	}

	private static void test(int sum) {

		BinarySearchTree tree = sample1();

		BinarySearchTreePairFinder finder = new BinarySearchTreePairFinder(tree);

		finder.findPair(sum);

		System.out.println("---------------------------------------------");
	}

	private static BinarySearchTree sample1() {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(70);
		tree.insert(50);
		tree.insert(90);
		tree.insert(30);
		tree.insert(60);
		tree.insert(80);
		tree.insert(100);
		tree.insert(20);
		tree.insert(40);

		return tree;
	}
}
