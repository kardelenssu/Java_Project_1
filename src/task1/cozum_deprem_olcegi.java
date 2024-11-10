package task1;

public class cozum_deprem_olcegi {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double depremSideti;
                System.out.print("Depremi büyüklüğünü girniz= ");
                depremSideti = scanner.nextDouble();
                if (depremSideti < 2.0)
                    System.out.println("Mikro");
                else if (depremSideti < 3.0) {
                    System.out.println("Çok küçük");
                } else if (depremSideti < 4.0) {
                    System.out.println("Küçük");

                } else if (depremSideti < 5.0) {
                    System.out.println("Hafif");
                } else if (depremSideti < 6.0) {
                    System.out.println("Orta");
                } else if (depremSideti < 7.0) {
                    System.out.println("Ağır");
                } else if (depremSideti < 8.0) {
                    System.out.println("Büyük");
                } else if (depremSideti < 10.0) {
                    System.out.println("Çok Büyük");
                } else
                    System.out.println("Meteorik");
                scanner.close();
            }
}
