import java.util.Scanner;

public class Bai2 {
    public static final Scanner sc = new Scanner(System.in);
    public static final char CHAR_55 = 55;

    // Cau 1: Tim UCLN va BCNN
    public static void Cau1() {
        int a, b;
        System.out.println("Nhap so a: ");
        a = sc.nextInt();
        System.out.println("Nhap so b: ");
        b = sc.nextInt();

        System.out.println("Uoc chung lon nhat cua hai so la: " + UCLN(a, b));
        System.out.println("Boi chung nho nhat cua hai so la: " + (a * b) / UCLN(a, b));
    };

    public static int UCLN(int a, int b) {
        while (b != 0) {
            int d = a;
            a = b;
            b = d % b;
        }
        return a;
    }

    // Cau 2: Chuong trinh chuyen doi so tu nhien sang he so tu chon
    public static String Cau2(int n, int b) {

        if (n < 0 || b < 2 || b > 16) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;

        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % b);
            }
            remainder = remainder / b;
        }
        return sb.reverse().toString();
    };

    // Cau 3: Tinh tong cac chu so
    public static void Cau3() {
        int so, tong = 0;
        System.out.println("Nhap so nguyen: ");
        so = sc.nextInt();
        while (so > 0) {
            tong = tong + so % 10;
            so = so / 10;
        }
        System.out.println("Tong cac so la: " + tong);
    };

    // Cau 4: Liet ke so nguyen to
    public static void Cau4() {
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon so " + n + " la: ");

        for (int i = 2; i < n; i++) {
            if (snt(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static boolean snt(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Cau 5: Tim so Fibonacci thu n
    public static void Cau5() {
        int n;
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        int f0 = 1;
        int f1 = 1;
        int fn = 2;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    // Cau 6:
    public static void Cau6() {
        int n;
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        System.out.println("Cac uoc cua " + n + " la: ");
        Uoc(n);
        System.out.println("");
        System.out.println("Cac uoc la so nguyen to: ");
        UocNt(n);

    }

    public static void Uoc(int n) {
        int dem = 0;
        if (n == 1) {
            dem = 1;
            System.out.println("1");
        } else if (n >= 2) {
            System.out.print("1");
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    dem = dem + 1;
                    System.out.print("," + i);
                }
            }
        }
    }

    public static void UocNt(int n) {
        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                if ((n % i == 0) && snt(i)) {
                    System.out.print(i + ",");
                }
            }
        }
    }

    // Cau 7: Thua so nguyen to
    public static void Cau7() {
        int n;
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        ThuaSo(n);
    };

    public static void ThuaSo(int n) {
        for (int i = 2; i <= n; i++) {
            if (snt(i)) {
                if (n % i == 0) {
                    System.out.println("Thua so cua " + n + " la: " + i + "." + n / i);
                    break;
                }
            }
        }
    }

    // Cau 8: Dem so chu
    public static void Cau8() {
        String text;
        System.out.println("Nhap van ban: ");
        text = sc.nextLine();
        System.out.println(DemChu(text));
    }

    public static int DemChu(String text) {
        String[] words = text.split("\\s");
        return words.length;
    }
}
