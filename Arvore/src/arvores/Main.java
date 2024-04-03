package arvores;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        tree.insertSorted(5, tree.getRoot());
        tree.insertSorted(3, tree.getRoot());
        tree.insertSorted(8, tree.getRoot());
        tree.insertSorted(4, tree.getRoot());
        int size = tree.getLength();
        boolean result = tree.valueExist(8, tree.getRoot());
        System.out.println(result);
        System.out.println(size);
    }
}
