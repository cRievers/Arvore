package arvores;

public class Tree {
    private Node root;
    private int length;
    
    public Tree(){
        Node aux = new Node();
        this.root = aux;
        this.length = 0;
    }
    
    public Node getRoot(){
        return this.root;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public boolean insertSorted(int value, Node node){
        if(this.length == 0){
            Node rt = new Node(value);
            this.root = rt;
            this.length++;
            return true;
        }
        if(value > node.key){
            if(node.right != null)
                insertSorted(value, node.right);
            else{
                this.length++;
                return insertRight(value, node);
            }
        }else if (value < node.key){
            if(node.left != null)
                insertSorted(value, node.left);
            else{
                this.length++;
                return insertLeft(value, node);
            }
        }
        return false;
    }
    
    private boolean insertLeft(int value, Node father){
        Node node = new Node(value);
        father.left = node;
        return true;
    }
    
    private boolean insertRight(int value, Node father){
        Node node = new Node(value);
        father.right = node;
        return true;
    }
    
    public boolean valueExist(int value, Node node){
        if(this.length == 0){
            return false;
        }
        if(value == node.key){
            return true;
        }
        else if((value > node.key) && (node.right != null)){
            return valueExist(value, node.right);
        }
        else if ((value < node.key) && (node.left != null)){
            return valueExist(value, node.left);
        }
        return false;
    }
}
