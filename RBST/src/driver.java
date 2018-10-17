/*
* Lab Name: driver
        * Lab Purpose: Illistrate the capabilities of the Red Black BST class
        * Date: 10/17/18
        * Collaborators: None
        */
import javax.xml.transform.Source;

public class driver {
    public static void main(String[] args) {

        Node root = new Node(5,5,1);
        root.setLeft(new Node(6,6,1));
        root.getLeft().setLeft(new Node(7,7,1));
        RedBlackBST wow = new RedBlackBST(root);
        System.out.println(wow.isRBT());
        System.out.println(wow.isGParent(root));
        }
}
