package lab5;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statistics statObj = new Statistics(); // Varargs (member method) дуудахад зориулж объект үүсгэв

        System.out.print("Хэдэн тоон дээр статистик үйлдэл гүйцэтгэх вэ (2-5): ");
        int n = sc.nextInt();

        if (n < 2 || n > 5) {
            System.out.println("Алдаа: Зөвхөн 2-5 параметр хүлээн авна.");
            return;
        }

        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("%d-р тоог оруул: ", i + 1);
            a[i] = sc.nextDouble();
        }

        double mOver = 0, sOver = 0;

        // Static Overloaded методуудыг дуудах
        switch (n) {
            case 2:
                mOver = Statistics.calculateMean(a[0], a[1]);
                sOver = Statistics.calculateStdDev(a[0], a[1]);
                break;
            case 3:
                mOver = Statistics.calculateMean(a[0], a[1], a[2]);
                sOver = Statistics.calculateStdDev(a[0], a[1], a[2]);
                break;
            case 4:
                mOver = Statistics.calculateMean(a[0], a[1], a[2], a[3]);
                sOver = Statistics.calculateStdDev(a[0], a[1], a[2], a[3]);
                break;
            case 5:
                mOver = Statistics.calculateMean(a[0], a[1], a[2], a[3], a[4]);
                sOver = Statistics.calculateStdDev(a[0], a[1], a[2], a[3], a[4]);
                break;
        }

        // Varargs (Member) методуудыг дуудах
        double mVar = statObj.meanVarargs(a);
        double sVar = statObj.stdDevVarargs(a);

        // Үр дүнг хэвлэх
        System.out.println("\n--- Үр дүнгийн харьцуулалт ---");
        System.out.printf("Overloaded Арга: Дундаж = %.4f, Хазайлт = %.4f\n", mOver, sOver);
        System.out.printf("Varargs Арга:    Дундаж = %.4f, Хазайлт = %.4f\n", mVar, sVar);

        sc.close();
    }
}