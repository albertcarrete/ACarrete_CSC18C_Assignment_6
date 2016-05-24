/*
 * Program: 	Assignment 6
 * Class: 		CSC-18C
 * Author: 		Albert Carrete
 * Date: 		Tue, May 24, 2016
 * ======================================================
 * Take the original BinaryTree class and convert it into
 * a template class. 
 * 
 * */
public class BinarySearchTreeDiscussion {

    public static void main(String[] args) {
        
        boolean valid = true;
        int type = 1;
        BinaryTree<Integer> integerTree = new BinaryTree<Integer>(Integer.class);
        BinaryTree<Float> floatTree		= new BinaryTree<Float>(Float.class);
        BinaryTree<String> stringTree 	= new BinaryTree<String>(String.class);
        
        // Receive input for the binary tree type. 
        do{
        	
        	System.out.println("Select the type of value you will be");
        	System.out.println("inputting into this binary tree." );
        	System.out.println("1) Integer");
        	System.out.println("2) Float");
        	System.out.println("3) String");
        	System.out.print("Enter a selection > ");
        	type = new java.util.Scanner(System.in).nextInt();
            
            if(type > 3 || type <= 0){
            	valid = false;
            	System.out.println("Error: Please enter a valid selection \n");
            }
        	
        }while(!valid);
        
        System.out.println("Enter an integer value and I will add it to the tree, and after");
        System.out.println("adding it to the tree, I'll do the pre-order, in-order, and post-order");
        System.out.println("traversals of what you have given me....");
        
        
        // Indefinite while loop to insert items
        while(true)
        {
        	// Switch based on which type we selected in the previous Scanner
            switch(type){
            
	            case 1 :
	                System.out.print("Enter an integer: ");
	                int integerVal = new java.util.Scanner(System.in).nextInt();
	                integerTree.add(integerVal);
	                printTree(integerTree);
	                break;
	            case 2 :
	                System.out.print("Enter a float: ");
	                float floatVal = new java.util.Scanner(System.in).nextFloat();
	                floatTree.add(floatVal);    
	                printTree(floatTree);
	                break;
	            case 3 :
	                System.out.print("Enter a string: ");
	                String stringVal = new java.util.Scanner(System.in).next();
	                stringTree.add(stringVal); 
	                printTree(stringTree);
	                break;
                
            }
        }
    }  
    
    /* Prints out the traverals for the inputted
     * tree. TODO: make this a native method of
     * BinaryTree */
    @SuppressWarnings("rawtypes")
	public static void printTree (BinaryTree tree){
        System.out.print("pre-order traversal: ");
        tree.preOrderTraversal();
        System.out.print("in-order traversal: ");
        tree.inOrderTraversal();
        System.out.print("post-order traversal: ");
        tree.postOrderTraversal();   	
    }
}
