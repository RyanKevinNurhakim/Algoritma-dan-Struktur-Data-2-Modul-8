package tugas08;
public class BinaryTreeApp {
    public static void main(String[] args) {  
        BinaryTre tree=new BinaryTre();
    
        Node node;
    
        node = new Node('D');
        tree.insert(node);
    
        node = new Node('B');
        tree.insert(node);
    
        node = new Node('A');
        tree.insert(node);
    
        node = new Node('C');
        tree.insert(node);
    
        node = new Node('F');
        tree.insert(node);
    
        node = new Node('E');
        tree.insert(node);
    
        node = new Node('G');
        tree.insert(node);
    
        System.out.print("Traversal dengan preorder : ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder : ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inorder : ");
        tree.inOrder();
        System.out.println();
        
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }   
}
    

