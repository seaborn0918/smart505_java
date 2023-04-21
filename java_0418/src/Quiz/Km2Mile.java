package Quiz;

import java.util.Scanner;

public class Km2Mile extends Convert {
    public Km2Mile(double km) {
        setKm(km);
    }

    public void run() {
        System.out.println(getKm() / 1.6 + "mile");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("km을 mile로 바꿉니다.");
//        System.out.println("km을 입력하세요");
//        double km = sc.nextDouble();

        Km2Mile toMile = new Km2Mile(30);
        toMile.run();

    }
}
