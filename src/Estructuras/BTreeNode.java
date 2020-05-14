/*
 * Geeks for Geeks
 */
package Estructuras;

// A BTree node  
public class BTreeNode {

    private int[] keys; // An array of keys 
    private int t; // Minimum degree (defines the range for number of keys) 
    private BTreeNode[] C; // An array of child pointers 
    private int n; // Current number of keys 
    private boolean leaf; // Is true when node is leaf. Otherwise false 

    // Constructor 
//    BTreeNode(int t, boolean leaf) {
//        this.t = t;
//        this.leaf = leaf;
//        this.keys = new int[2 * t - 1];
//        this.C = new BTreeNode[2 * t];
//        this.n = 0;
//    }
    BTreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        this.keys = new int[2 * t - 1];
        this.C = new BTreeNode[2 * t];
        this.n = 0;
    }

    // A function to traverse all nodes in a subtree rooted with this node 
    public void traverse() {
        // There are n keys and n+1 children, travers through n keys 
        // and first n children 
        int i = 0;
        for (i = 0; i < this.getN(); i++) {
            // If this is not leaf, then before printing key[i], 
            // traverse the subtree rooted with child C[i]. 
            if (this.isLeaf() == false) {
                getC()[i].traverse();
            }
            System.out.print(getKeys()[i] + " ");
        }

        // Print the subtree rooted with last child 
        if (isLeaf() == false) {
            getC()[i].traverse();
        }
    }

    // A function to search a key in the subtree rooted with this node. 
    public BTreeNode search(int k) { // returns NULL if k is not present. 

        // Find the first key greater than or equal to k 
        int i = 0;
        while (i < getN() && k > getKeys()[i]) {
            i++;
        }

        // If the found key is equal to k, return this node 
        if (getKeys()[i] == k) {
            return this;
        }

        // If the key is not found here and this is a leaf node 
        if (isLeaf() == true) {
            return null;
        }

        // Go to the appropriate child 
        return getC()[i].search(k);

    }

    public int findKey(int k) {//Eliminar
        int idx = 0;
        while (idx < getN() && getKeys()[idx] < k) {
            ++idx;
        }
        return idx;
    }

    public void insertNonFull(int k) {
        // Initialize index as index of rightmost element 
        int i = getN() - 1;

        // If this is a leaf node 
        if (isLeaf() == true) {
            // The following loop does two things 
            // a) Finds the location of new key to be inserted 
            // b) Moves all greater keys to one place ahead 
            while (i >= 0 && getKeys()[i] > k) {
                getKeys()[i + 1] = getKeys()[i];
                i--;
            }

            // Insert the new key at found location 
            getKeys()[i + 1] = k;
            setN(getN() + 1);
        } else // If this node is not leaf 
        {
            // Find the child which is going to have the new key 
            while (i >= 0 && getKeys()[i] > k) {
                i--;
            }

            // See if the found child is full 
            if (getC()[i + 1].getN() == 2 * getT() - 1) {
                // If the child is full, then split it 
                splitChild(i + 1, getC()[i + 1]);

                // After split, the middle key of C[i] goes up and 
                // C[i] is splitted into two.  See which of the two 
                // is going to have the new key 
                if (getKeys()[i + 1] < k) {
                    i++;
                }
            }
            getC()[i + 1].insertNonFull(k);
        }
    }

    public void splitChild(int i, BTreeNode y) {
        // Create a new node which is going to store (t-1) keys 
        // of y 
        BTreeNode z = new BTreeNode(y.getT(), y.isLeaf()); //*
        z.setN(getT() - 1);

        // Copy the last (t-1) keys of y to z 
        for (int j = 0; j < getT() - 1; j++) {
            z.getKeys()[j] = y.getKeys()[j + getT()];
        }

        // Copy the last t children of y to z 
        if (y.isLeaf() == false) {
            for (int j = 0; j < getT(); j++) {
                z.getC()[j] = y.getC()[j + getT()];
            }
        }

        // Reduce the number of keys in y 
        y.setN(getT() - 1);

        // Since this node is going to have a new child, 
        // create space of new child 
        for (int j = getN(); j >= i + 1; j--) {
            getC()[j + 1] = getC()[j];
        }

        // Link the new child to this node 
        getC()[i + 1] = z;

        // A key of y will move to this node. Find the location of 
        // new key and move all greater keys one space ahead 
        for (int j = getN() - 1; j >= i; j--) {
            getKeys()[j + 1] = getKeys()[j];
        }

        // Copy the middle key of y to this node 
        getKeys()[i] = y.getKeys()[getT() - 1];

        // Increment count of keys in this node 
        setN(getN() + 1);
    }

    public void remove(int k) {
        int idx = findKey(k);
        // The key to be removed is present in this node 
        if (idx < getN() && getKeys()[idx] == k) {
            // If the node is a leaf node - removeFromLeaf is called 
            // Otherwise, removeFromNonLeaf function is called 
            if (isLeaf()) {
                removeFromLeaf(idx);
            } else {
                removeFromNonLeaf(idx);
            }
        } else {// If this node is a leaf node, then the key is not present in tree 
            if (isLeaf()) {
                System.out.println("The key " + k + " is does not exist in the tree\n");
                return;
            }
            // The key to be removed is present in the sub-tree rooted with this node 
            // The flag indicates whether the key is present in the sub-tree rooted 
            // with the last child of this node 
            boolean flag = ((idx == getN()) ? true : false);

            // If the child where the key is supposed to exist has less that t keys, 
            // we fill that child 
            if (getC()[idx].getN() < getT()) {
                fill(idx);
            }

            // If the last child has been merged, it must have merged with the previous 
            // child and so we recurse on the (idx-1)th child. Else, we recurse on the 
            // (idx)th child which now has atleast t keys 
            if (flag && idx > getN()) {
                getC()[idx - 1].remove(k);
            } else {
                getC()[idx].remove(k);
            }
        }
        return;
    }

    public void removeFromLeaf(int idx) {
        // Move all the keys after the idx-th pos one place backward 
        for (int i = idx + 1; i < getN(); ++i) {
            getKeys()[i - 1] = getKeys()[i];
        }
        // Reduce the count of keys 
        setN(getN() - 1);
        return;
    }

    public void removeFromNonLeaf(int idx) {
        int k = getKeys()[idx];

        // If the child that precedes k (C[idx]) has atleast t keys, 
        // find the predecessor 'pred' of k in the subtree rooted at 
        // C[idx]. Replace k by pred. Recursively delete pred 
        // in C[idx] 
        if (getC()[idx].getN() >= getT()) {
            int pred = getPred(idx);
            getKeys()[idx] = pred;
            getC()[idx].remove(pred);
        } // If the child C[idx] has less that t keys, examine C[idx+1]. 
        // If C[idx+1] has atleast t keys, find the successor 'succ' of k in 
        // the subtree rooted at C[idx+1] 
        // Replace k by succ 
        // Recursively delete succ in C[idx+1] 
        else if (getC()[idx + 1].getN() >= getT()) {
            int succ = getSucc(idx);
            getKeys()[idx] = succ;
            getC()[idx + 1].remove(succ);
        } // If both C[idx] and C[idx+1] has less that t keys,merge k and all of C[idx+1] 
        // into C[idx] 
        // Now C[idx] contains 2t-1 keys 
        // Free C[idx+1] and recursively delete k from C[idx] 
        else {
            merge(idx);
            getC()[idx].remove(k);
        }
        return;
    }

    public int getPred(int idx) {
        // Keep moving to the right most node until we reach a leaf 
        BTreeNode cur = getC()[idx];
        while (!cur.isLeaf()) {
            cur = cur.getC()[cur.getN()];
        }
        // Return the last key of the leaf 
        return cur.getKeys()[cur.getN() - 1];
    }

    public int getSucc(int idx) {
        // Keep moving the left most node starting from C[idx+1] until we reach a leaf 
        BTreeNode cur = getC()[idx + 1];
        while (!cur.isLeaf()) {
            cur = cur.getC()[0];
        }
        // Return the first key of the leaf 
        return cur.getKeys()[0];
    }

    public void fill(int idx) {
        // If the previous child(C[idx-1]) has more than t-1 keys, borrow a key 
        // from that child 
        if (idx != 0 && getC()[idx - 1].getN() >= getT()) {
            borrowFromPrev(idx);
        } // If the next child(C[idx+1]) has more than t-1 keys, borrow a key 
        // from that child 
        else if (idx != getN() && getC()[idx + 1].getN() >= getT()) {
            borrowFromNext(idx);
        } // Merge C[idx] with its sibling 
        // If C[idx] is the last child, merge it with with its previous sibling 
        // Otherwise merge it with its next sibling 
        else {
            if (idx != getN()) {
                merge(idx);
            } else {
                merge(idx - 1);
            }
        }
        return;
    }

    public void borrowFromPrev(int idx) {
        BTreeNode child = getC()[idx];
        BTreeNode sibling = getC()[idx - 1];

        // The last key from C[idx-1] goes up to the parent and key[idx-1] 
        // from parent is inserted as the first key in C[idx]. Thus, the  loses 
        // sibling one key and child gains one key 
        // Moving all key in C[idx] one step ahead 
        for (int i = child.getN() - 1; i >= 0; --i) {
            child.getKeys()[i + 1] = child.getKeys()[i];
        }

        // If C[idx] is not a leaf, move all its child pointers one step ahead 
        if (!child.isLeaf()) {
            for (int i = child.getN(); i >= 0; --i) {
                child.getC()[i + 1] = child.getC()[i];
            }
        }
        // Setting child's first key equal to keys[idx-1] from the current node 
        child.getKeys()[0] = getKeys()[idx - 1];

        // Moving sibling's last child as C[idx]'s first child 
        if (!child.isLeaf()) {
            child.getC()[0] = sibling.getC()[sibling.getN()];
        }

        // Moving the key from the sibling to the parent 
        // This reduces the number of keys in the sibling 
        getKeys()[idx - 1] = sibling.getKeys()[sibling.getN() - 1];
        child.setN(child.getN() + 1);
        sibling.setN(sibling.getN() - 1);

        return;
    }

    public void borrowFromNext(int idx) {
        BTreeNode child = getC()[idx];
        BTreeNode sibling = getC()[idx + 1];
        // keys[idx] is inserted as the last key in C[idx] 
        child.getKeys()[(child.getN())] = getKeys()[idx];

        // Sibling's first child is inserted as the last child 
        // into C[idx] 
        if (!(child).isLeaf()) {
            child.getC()[(child.getN()) + 1] = sibling.getC()[0];
        }

        //The first key from sibling is inserted into keys[idx] 
        getKeys()[idx] = sibling.getKeys()[0];

        // Moving all keys in sibling one step behind 
        for (int i = 1; i < sibling.getN(); ++i) {
            sibling.getKeys()[i - 1] = sibling.getKeys()[i];
        }

        // Moving the child pointers one step behind 
        if (!sibling.isLeaf()) {
            for (int i = 1; i <= sibling.getN(); ++i) {
                sibling.getC()[i - 1] = sibling.getC()[i];
            }
        }
        // Increasing and decreasing the key count of C[idx] and C[idx+1] 
        // respectively 
        child.setN(child.getN() + 1);
        sibling.setN(sibling.getN() - 1);

        return;
    }

    // A function to merge C[idx] with C[idx+1] 
    // C[idx+1] is freed after merging 
    public void merge(int idx) {
        BTreeNode child = getC()[idx];
        BTreeNode sibling = getC()[idx + 1];
        // Pulling a key from the current node and inserting it into (t-1)th 
        // position of C[idx] 
        child.getKeys()[getT() - 1] = getKeys()[idx];

        // Copying the keys from C[idx+1] to C[idx] at the end 
        for (int i = 0; i < sibling.getN(); ++i) {
            child.getKeys()[i + getT()] = sibling.getKeys()[i];
        }

        // Copying the child pointers from C[idx+1] to C[idx] 
        if (!child.isLeaf()) {
            for (int i = 0; i <= sibling.getN(); ++i) {
                child.getC()[i + getT()] = sibling.getC()[i];
            }
        }

        // Moving all keys after idx in the current node one step before - 
        // to fill the gap created by moving keys[idx] to C[idx] 
        for (int i = idx + 1; i < getN(); ++i) {
            getKeys()[i - 1] = getKeys()[i];
        }

        // Moving the child pointers after (idx+1) in the current node one 
        // step before 
        for (int i = idx + 2; i <= getN(); ++i) {
            getC()[i - 1] = getC()[i];
        }
        // Updating the key count of child and the current node 
        child.setN(child.getN() + sibling.getN() + 1);
        setN(getN() - 1);

        // Freeing the memory occupied by sibling 
        //delete(sibling);
        return;
    }

    public int[] getKeys() {
        return keys;
    }

    public void setKeys(int[] keys) {
        this.keys = keys;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public BTreeNode[] getC() {
        return C;
    }

    public void setC(BTreeNode[] C) {
        this.C = C;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

}
