/**
 * Created by DDaub on 12/16/2016.
 */
public class Tester {
    public static void main(String[] args)
    {
        System.out.println("Start Program");

        BST bstObj = new BST(50);

        bstObj.addNode(56);

        bstObj.addNode(52);

        bstObj.addNode(25);

        bstObj.addNode(74);

        bstObj.addNode(54);

        bstObj.traverseAndPrint(bstObj.rootNode);

        System.out.println(bstObj.find(56));
        System.out.println("Memeos");
    }
}
