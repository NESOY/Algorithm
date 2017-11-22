package BaekJoon;

import java.util.Scanner;

/**
 * Created by nesoy on 2017. 11. 16..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
public class Solution_1991 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();

        TreeNode[] nodeList = new TreeNode[size];
        for (int i = 0; i < size; i++) {
            nodeList[i] = new TreeNode((char) ('A' + i)); // 초기화
        }

        TreeNode rootNode = nodeList[0];

        for (int i = 0; i < size; i++) {
            char[] tokenList = scan.nextLine().toCharArray(); // 정보 파싱

            int index = tokenList[0] - 'A';
            if (tokenList[2] != '.') {
                int leftIndex = tokenList[2] - 'A';
                nodeList[index].leftNode = nodeList[leftIndex];
            }
            if (tokenList[4] != '.') {
                int rightIndex = tokenList[4] - 'A';
                nodeList[index].rightNode = nodeList[rightIndex];
            }
        }
        preorder(rootNode);
        System.out.println();
        order(rootNode);
        System.out.println();
        postOrder(rootNode);
    }

    public static void preorder(TreeNode root){
        System.out.print(root.Value);
        if(root.leftNode != null)
            preorder(root.leftNode);
        if(root.rightNode != null)
            preorder(root.rightNode);
    }
    public static void order(TreeNode root){
        if(root.leftNode != null) {
            order(root.leftNode);
        }
        System.out.print(root.Value);
        if(root.rightNode != null) {
            order(root.rightNode);
        }
    }
    public static void postOrder(TreeNode root){
        if(root.leftNode != null) {
            postOrder(root.leftNode);
        }
        if(root.rightNode != null) {
            postOrder(root.rightNode);
        }
        System.out.print(root.Value);
    }
}

class TreeNode {
    TreeNode leftNode;
    TreeNode rightNode;
    char Value;

    TreeNode(char Value) {
        this.Value = Value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "Value=" + Value +
                '}';
    }
}