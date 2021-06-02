/**
 * Class SavingsAccount merupakan class untuk menyimpan balance
 * serta untuk melakukan operasi yang terkait dengan balance yaitu withdraw
 * dan deposit
 * @author Kelompok 7 - Pemrogaman Berorientasi Objek 01
 * @version 01/06/2021
 */


public class SavingsAccount
{
    public float balance;

    /**
     * Method withdraw digunakan mengurangi nilai dari balance
     * @param anAmount merupakan nilai yang dikeluarkan
     */
    public void withdraw(float anAmount)
    {
        if (anAmount<0.0)
            throw new IllegalArgumentException("Withdraw amount negative");

          if (anAmount<=balance) {
              synchronized(this)
              {
                  balance = balance - anAmount;
              }
           }
    }

    /**
     * Method deposit digunakan menambah nilai dari balance
     * @param anAmount merupakan nilai yang dimasukkan
     */
    public void deposit(float anAmount)
    {
        if (anAmount<0.0)
            throw new IllegalArgumentException("Deposit amount negative");

        synchronized(this)
        {
            balance = balance + anAmount;
        }
    }

    /**
     * Method toString untuk mencetak variabel balance
     * @return String nilai balance
     */
    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
