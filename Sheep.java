public class Sheep extends Animal{
    final static private double maxHealth = 8;
    Sheep(double health,double fullHealth,double[]position){
        super("Sheep",Math.max(health,Sheep.maxHealth),Math.max(fullHealth,Sheep.maxHealth),position);
    }
}