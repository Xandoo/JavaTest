/**
 * Created by DDaub on 12/16/2016.
 */
public class BST {
    public BstNode rootNode;

    public BST(int i)
    {
        rootNode = new BstNode(i);
    }

    public void addNode(int i)

    {

        BstNode currentNode = rootNode;

        boolean finished = false;

        do

        {

            BstNode curLeftNode = currentNode.leftNode;

            BstNode curRightNode = currentNode.rightNode;

            int curIntData = currentNode.intData;



            if (i > curIntData) //look down the right branch right

            {

                if (curRightNode == null)

                { //create a new node referenced with currentNode.rightNode

                    currentNode.rightNode = new BstNode(i);

                    finished = true;

                }

                else

                { //keep looking by assigning a new current node one level down

                    currentNode = currentNode.rightNode;

                }

            }

            else //look down the left branch

            {

                if (curLeftNode == null)

                { //create a new node referenced with currentNode.leftNode

                    currentNode.leftNode = new BstNode(i);

                    finished = true;

                }

                else

                { //keep looking by assigning a new current node one level down

                    currentNode = currentNode.leftNode;

                }

            }

        } while (!finished);

    }

    public void traverseAndPrint(BstNode currentNode)

    {

        System.out.println("data = " + currentNode.intData);

        //To aid in your understanding, you may want to just ignore this indented

        //portion and just print the integer. In that case, change the line above to a

        //println instead of a print

        if (currentNode.leftNode == null)

        {

            System.out.println(" left = null");

        }

        else

        {

            System.out.println(" left = " + (currentNode.leftNode).intData);

        }



        if (currentNode.rightNode == null)

        {

            System.out.println(" right = null");

        }

        else

        {

            System.out.println(" right = " + (currentNode.rightNode).intData);

        }

        System.out.println("");



        if (currentNode.leftNode != null)

            traverseAndPrint(currentNode.leftNode);



        if (currentNode.rightNode != null)

            traverseAndPrint(currentNode.rightNode);

    }

    public boolean find(int i)
    {
        BstNode currentNode = rootNode;

        boolean finished = false;

        do

        {

            BstNode curLeftNode = currentNode.leftNode;

            BstNode curRightNode = currentNode.rightNode;

            int curIntData = currentNode.intData;



            if (i > curIntData) //look down the right branch right

            {

                if (curRightNode == null)

                { //create a new node referenced with currentNode.rightNode

                    return false;

                }

                else

                { //keep looking by assigning a new current node one level down
                    if(curRightNode.intData == i)
                    {
                        return true;
                    }

                    currentNode = currentNode.rightNode;

                }

            }

            else //look down the left branch

            {

                if (curLeftNode == null)

                { //create a new node referenced with currentNode.leftNode

                    return false;

                }

                else

                { //keep looking by assigning a new current node one level down

                    if (curLeftNode.intData == i)
                    {
                        return true;
                    }

                    currentNode = currentNode.leftNode;

                }

            }

        } while (!finished);

        return false;
    }
}
