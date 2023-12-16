import java.sql.Array;

abstract class Animal {
    private String name;
    private double health;

    private double fullHealth;

    private double[] position = new double[3];

    public Animal(String name, double health,double fullHealth,double[]position) {
        this.name = name;
        this.health = health;
        this.fullHealth = fullHealth;
        this.position = position;
    }

    public double getHealth(){ return this.health;}
    public double getFullHealth(){ return this.fullHealth;}

    public double[] getPosition(){ return this.position;}

    public void setHealth(Double health){
        this.health = health;
    }
}
