//Вариант - 1


public class Main {
    public static void main(String[] args) {

        Sheep sheep = new Sheep(5,8,new double[] {1,1,0});
        Wolf wolf = new Wolf(10,20,new double[] {5,5,5});
        int seconds = wolf.kill(sheep);
        System.out.println(seconds);
    }
}