
/**
 * Write a description of class Ejemplos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class Ejemplos
{
    public static void main (String [] args) {
        BST tree = new BST();
        //Arrays.asList(50, 30, 20, 40, 70, 60, 80).forEach(tree::insert);
        // 2.1
        tree.pre_post("50 30 24 5 28 45 98 52 60");
        
        //BST1 tree1 = new BST1();
        //Arrays.asList(50, 30, 20, 40, 70, 60, 80).forEach(tree1::insert);
        System.out.println("Número de elementos");
        System.out.println(tree.elements());
        System.out.println("Altura máxima del árbol");
        System.out.println(tree.maxHeight());
        System.out.println("Preorden");
        tree.preorder();
        System.out.println("Postorden");
        tree.postorder();
        System.out.println("Inorden");
        tree.inorder();
        System.out.println("Por niveles");
        tree.byLevels();
    }
}
