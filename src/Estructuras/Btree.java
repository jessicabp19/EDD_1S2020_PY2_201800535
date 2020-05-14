/*
 * Geek for geeks
 */
package Estructuras;

// A Btree  
public class Btree {

    public BTreeNode root; // Pointer to root node 
    public int t; // Minimum degree 

    // Constructor (Initializes tree as empty) 
    public Btree(int t) {
        this.root = null;
        this.t = t;
    }

    // function to traverse the tree 
    public void traverse() {
        if (this.root != null) {
            this.root.traverse();
        }
        System.out.println();
    }

    // function to search a key in this tree 
    public BTreeNode search(int k) {
        if (this.root == null) {
            return null;
        } else {
            return this.root.search(k);
        }
    }

    public void insert(int k) {
        if (root == null) {
            // Allocate memory for root 
            root = new BTreeNode(t, true);
            root.getKeys()[0] = k;  // Insert key 
            root.setN(1);  // Update number of keys in root 
        } else // If tree is not empty 
        {
            // If root is full, then tree grows in height 
            if (root.getN() == 2 * t - 1) {
                // Allocate memory for new root 
                BTreeNode s = new BTreeNode(t, false); //*

                // Make old root as child of new root 
                s.getC()[0] = root;

                // Split the old root and move 1 key to the new root 
                s.splitChild(0, root);

                // New root has two children now.  Decide which of the 
                // two children is going to have new key 
                int i = 0;
                if (s.getKeys()[0] < k) {
                    i++;
                }
                s.getC()[i].insertNonFull(k);

                // Change root 
                root = s;
            } else // If root is not full, call insertNonFull for root 
            {
                root.insertNonFull(k);
            }
        }
    }

    public void remove(int k) {
        if (null==root) {//!root
            System.out.println("The tree is empty\n");
            return;
        }
        // Call the remove function for root 
        root.remove(k);

        // If the root node has 0 keys, make its first child as the new root 
        //  if it has a child, otherwise set root as NULL 
        if (root.getN() == 0) {
            BTreeNode tmp = root;
            if (root.isLeaf()) {
                root = null;
            } else {
                root = root.getC()[0];
            }

            // Free the old root 
            //delete tmp;
        }
        return;
    }
}
