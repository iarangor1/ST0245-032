
/**
 * Write a description of class Familiar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Familiar implements Comparable<Familiar>
{
    private String name;

    private boolean alive;

    private int age;

    private int id;

    /**
     * Constructor for objects of class Familiar
     */
    public Familiar(String name, boolean alive, int age, int id) {
        this. name = name;
        this.alive = alive;
        this.age = age;
        this.id = id;
    }

    @Override
    public int compareTo(Familiar fam) {
        if (id == fam.id) {
            return 0;
        } else if (id < fam.id) {
            return -1;
        } else {
            return 1;
        }
    }

    public int getId() {
        return id;
    }

    public String toString(){
        if (alive) {
            return name + ", " + age + " años, " + "vive.";
        }
        return name + ", " + "muerto.";
    }
}
