public class Wolf extends Animal{

    final static private double maxHealth = 20;
    final static private double damage = 4;
    Wolf(double health,double fullHealth,double[]position){
        super("Wolf",Math.max(health,maxHealth),Math.max(fullHealth,maxHealth),position);
    }

    private double attack(Animal animal){
        double distance = DistanceCalculator.calculateDistance(this,animal);
        if (distance == 0.0){
            System.out.println("Два животных не могут быть друг в друге. Будет подразумеваться, что расстояние между ними 1");
            distance=1;
        }
        double loss = ((this.getHealth() / this.getFullHealth()) * damage) / (distance * distance);
        animal.setHealth(animal.getHealth() - loss);
        return loss;
    }

    public int kill(Animal animal){
        int secondToKill = 0;
        while (animal.getHealth() > 0){
            attack(animal);
            secondToKill++;
        }
        return secondToKill;
    }
}