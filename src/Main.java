/**
 * Class Main merupakan class untuk mengeksekusi program
 * @author Kelompok 7 - Pemrogaman Berorientasi Objek 01
 * @version 01/06/2021
 */

/**
 * Method Main merupakan method utama pada program
 * @param args Arguments
 */
public class Main {
    public static void main(String args[]) {
        SavingsAccount savingsAccount = new SavingsAccount();
        /**
         * Thread t1 merupakan thread yang mengimplementasikan metode runnable
         * untuk menjalankan method withdraw
         */
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    savingsAccount.withdraw(15);
                    System.out.println("Setelah withdraw : " + savingsAccount.toString());
                }
            }
        });

        /**
         * Thread t2 merupakan thread yang mengimplementasikan metode runnable
         * untuk menjalankan method deposit
         */
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    savingsAccount.deposit(35);
                    System.out.println("Setelah Deposit : " + savingsAccount.toString());
                }
            }
        });
        t2.start();
        t1.start();
    }
}

