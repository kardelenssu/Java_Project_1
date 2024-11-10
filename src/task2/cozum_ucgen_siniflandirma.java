package task2;

public class cozum_ucgen_siniflandirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kenar uzunluklarını al
        System.out.print("Birinci kenar uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci kenar uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu girin: ");
        double kenar3 = scanner.nextDouble();

        // Üçgen geçerliliğini kontrol et
        if (isValidTriangle(kenar1, kenar2, kenar3)) {
            // Üçgenin türünü belirle
            if (kenar1 == kenar2 && kenar2 == kenar3) {
                System.out.println("Bu bir Eşkenar Üçgendir.");
            } else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3) {
                System.out.println("Bu bir İkizkenar Üçgendir.");
            } else {
                System.out.println("Bu bir Çeşitkenar Üçgendir.");
            }
        } else {
            System.out.println("Girilen değerler geçerli bir üçgen oluşturmuyor.");
        }

        scanner.close();
    }

    // Üçgen geçerliliğini kontrol eden metot
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }





}
