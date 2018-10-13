import java.util.Arrays;

public class BST1
{
    int value = 0;

    BST1 izq, der, father;

    public BST1() {
        izq = null;
        der = null;
    }

    private void insert1 (int n, BST1 father){
        if(value == 0) {
            value = n;
        } else if (n < value) {
            if (izq == null) {
                izq = new BST1();
            }
            izq.insert1(n, this);
        } else if (n > value){
            if (der ==  null){
                der = new BST1();
            }
            der.insert1(n, this);
        } else {
            System.out.println("Ya se ingreso este elemento: " + n);
        }
    }

    public void insert (int n) {
        insert1(n, null);
    }

    public void delete (int n) {
        if (value != 0) {
            if (n == value) {
                delete1(n);
            } else if (n < value && izq != null) {
                izq.delete(n);
            } else if (n > value && der != null) {
                der.delete(n);
            }
        }
    }

    private void delete1 (int n) {
        if (izq != null && der != null) {
            BST1 min = der.minimun();
            this.value = min.value;
            der.delete(min.value);
        } else if (izq != null || der != null) {
            BST1 step;
            if (izq != null) {
                step = izq;
                this.value = step.value;
                this.izq = step.izq;
                this.der = step.der; 
            } else if (der != null) {
                step = der;
                this.value = step.value;
                this.izq = step.izq;
                this.der = step.der; 
            }  
        } else {
            if (father != null) {
                if (this == father.izq) {
                    father.izq = null;
                }
                if (this == father.der) {
                    father.der = null;
                }
                father = null;
            }
            value = 0;
        }
    }
 
    private BST1 minimun() {
        if (izq != null && !izq.isEmpty()) {
            return izq.minimun() ;
        }
        return this;
    }

    public boolean exists (int n) {
        if (value != 0) {
            if (n == value){
                return true;
            } else if (n < value && izq != null) {
                return izq.exists(n);
            } else if (n > value && der != null) {
                return der.exists(n);
            } 
        }
        return false;
    }

    public int get (int n){
        if (value!= 0) {
            if (n == value) {
                return value;
            } else if (n < value && izq != null) {
                return izq.get(n);
            } else if (n > value && der != null) {
                return der.get(n);
            }
        }
        return 0;
    }

    public boolean isLeaf(){
        return value != 0 && izq == null && der == null;
    }

    public boolean isEmpty(){
        return value == 0;
    }

    public void preorder() {
        preorder1("");
    }

    private void preorder1(String prefix) {
        if(value != 0) {
            System.out.println(prefix + value);
            if (izq != null) {
                izq.preorder1(prefix + "  ");
            }
            if (der != null) {
                der.preorder1(prefix + "  ");
            }
        }
    }

    public void postorder() {
        postorder1("");
    }

    private void postorder1(String prefix) {
        if(value != 0) {
            if (izq != null) {
                izq.postorder1(prefix + "  ");
            }
            if (der != null) {
                der.postorder1(prefix + "  ");
            }
            System.out.println(prefix + value);
        }
    }

    public void inorder() {
        inorder1("");
    }

    private void inorder1(String prefix) {
        if(value != 0) {
            if (izq != null) {
                izq.inorder1(prefix + "  ");
            }
            System.out.println(prefix + value);
            if (der != null) {
                der.inorder1(prefix + "  ");
            }
        }
    }

    public static void main (String [] args) {
        BST1 tree = new BST1();
        Arrays.asList(50, 30, 20, 40, 70, 60, 80).forEach(tree::insert);
        System.out.println("Preorder");
        tree.preorder();
        System.out.println("Postorder");
        tree.postorder();
        System.out.println("Inorder");
        tree.inorder();
    }
}
