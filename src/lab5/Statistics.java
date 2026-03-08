package lab5;
public class Statistics {

    // --- ДАХИН ТОДОРХОЙЛОГДСОН (OVERLOADED) МЕТОДУУД ---

    // Mean (Дундаж) - Static методууд
    public static double calculateMean(double a, double b) {
        return (a + b) / 2;
    }
    public static double calculateMean(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public static double calculateMean(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }
    public static double calculateMean(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    // StdDev (Стандарт хазайлт) - Static методууд
    public static double calculateStdDev(double a, double b) {
        double m = calculateMean(a, b);
        return Math.sqrt((Math.pow(a - m, 2) + Math.pow(b - m, 2)) / 2);
    }
    public static double calculateStdDev(double a, double b, double c) {
        double m = calculateMean(a, b, c);
        return Math.sqrt((Math.pow(a - m, 2) + Math.pow(b - m, 2) + Math.pow(c - m, 2)) / 3);
    }
    public static double calculateStdDev(double a, double b, double c, double d) {
        double m = calculateMean(a, b, c, d);
        return Math.sqrt((Math.pow(a - m, 2) + Math.pow(b - m, 2) + Math.pow(c - m, 2) + Math.pow(d - m, 2)) / 4);
    }
    public static double calculateStdDev(double a, double b, double c, double d, double e) {
        double m = calculateMean(a, b, c, d, e);
        return Math.sqrt((Math.pow(a - m, 2) + Math.pow(b - m, 2) + Math.pow(c - m, 2) + Math.pow(d - m, 2) + Math.pow(e - m, 2)) / 5);
    }

    // --- VARARGS МЕТОДУУД (ГИШҮҮН МЕТОД) ---

    public double meanVarargs(double... numbers) {
        double sum = 0;
        for (double x : numbers) sum += x;
        return sum / numbers.length;
    }

    public double stdDevVarargs(double... numbers) {
        double m = meanVarargs(numbers);
        double sumSq = 0;
        for (double x : numbers) sumSq += Math.pow(x - m, 2);
        return Math.sqrt(sumSq / numbers.length);
    }
}