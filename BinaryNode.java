/**
 * Created by matteo on 06/02/16.
 */
public class BinaryNode {
    BinaryNode Left;
    BinaryNode Right;
    public BinaryNode(){
        this.Left=null;
        this.Right=null;
    }
    public void addRight(BinaryNode rgt){
        this.Right = rgt;
    }
    public void addLeft(BinaryNode lft){
        this.Left = lft;
    }
    public BinaryNode getRight(){
        return this.Right;
    }
    public BinaryNode getLeft(){
        return this.Left;
    }
}
