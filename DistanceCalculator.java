public class DistanceCalculator {
    public static double calculateDistance(Animal first, Animal second) {
        double[] wolfPosition = first.getPosition();
        double[] sheepPosition = second.getPosition();
        // Рассчет расстояния между волком и овцой.
        // Возведение в квадрат разности координат по каждой из осей (x, y, z),
        // затем сумма всех трех значений и извлечение квадратного корня из этой суммы = расстояние.
        double distance = Math.sqrt(Math.pow(wolfPosition[0] - sheepPosition[0], 2) +
                Math.pow(wolfPosition[1] - sheepPosition[1], 2) +
                Math.pow(wolfPosition[2] - sheepPosition[2], 2));
        return distance;
    }
}
