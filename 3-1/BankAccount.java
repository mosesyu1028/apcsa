public class BankAccount
{
    private String password;
    private double balance;
    public static final double OVERDRAWN_PENALTY = 20.00;
 
    //CONSTRUCTORS
    /** Default constructor.
    * Constructs bank account with default values. */
    public BankAccount()
    {
        password = "";
        balance = 0.0;
    }

    public BankAccount(String acctPassword)
    {
        password = acctPassword;
        balance = 0.0;
    }

    /** Constructs bank account with specified password and balance. */
    public BankAccount(String acctPassword, double acctBalance)
    {
        password = acctPassword;
        balance = acctBalance;
    }


    //ACCESSOR
    /** Returns balance of this account. */
    public double getBalance()
    {
        return balance;
    }
    
    //MUTATORS
    /** Deposits amount in bank account with given password.
    */
    public void deposit(String acctPassword, double amount)
    {
        if (password.equals(acctPassword)) {
            balance += amount;
        }
        else {
            System.out.println("Wrong password!");
        }
    }

    /** Withdraws amount from bank account with given password.
    *  Assesses penalty if balance is less than amount.
    */
    public void withdraw(String acctPassword, double amount)
    {
        if (password.equals(acctPassword)) {
            
            if (balance < amount) {
                balance -= OVERDRAWN_PENALTY;
            }
            balance -= amount;

            // balance -= amount;
            // if (balance < 0) {
            //     balance -= OVERDRAWN_PENALTY;
            // }
        }
        else {
            System.out.println("Wrong password!");
        }
           
    }
}


