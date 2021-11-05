public class Main {
    public static void main(String[] args) {

        // Practice from last week
        // for (int i = 5; i >= 1; i--) { //5 4 3 2 1
            
        //     for (int j = i; j >= 1; j--) { //i = 5: 5 4 3 2 1 | i = 4: 4 3 2 1 
        //         System.out.print(2 * j - 1); // 9 7 5 3 1 /n 
        //     }

        //     System.out.println();
        // }

        BankAccount b = new BankAccount();
        // b -> BankAccount (password = "", balance = 0)

        BankAccount c = new BankAccount("123456", 100.0); //main.java
        // c -> BankAccount (password = "123456", balance = 100.0)
        
        if (c.getBalance() > b.getBalance()) {
            System.out.println("c has more money than b");
        }

        b.deposit("", 250.0); // b has $250
        c.withdraw("123456", 50.0); // c has $50

        System.out.println(b.getBalance() + c.getBalance()); // 250 + 50 = 300

    }
}