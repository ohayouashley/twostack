import java.util.Random;

public class BankAccount {
    
            public static int newAccounts = 0;//2
            public static double totalBalance = 0;

    private static int generateId() {
            Random randGenerator = new Random();
        int randomId = randGenerator.nextInt(100000000) + 999999999;
            return randomId;
    }

        private int accountNumber;

        private double checkingBalance;//1
        private double savingsBalance;

        public BankAccount() {
            BankAccount.newAccounts += 1;
            this.checkingBalance = 0;
            this.savingsBalance = 0;
            this.accountNumber = BankAccount.generateId();
        }

        public double getCheckingAccountBalance() {
            return this.checkingBalance;
        }

        public double getSavingsAccountBalance() {
            return this.savingsBalance;
        }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }

        public void depositFunds(double amount, String account) {
            if(account.equals("savings"))
                this.savingsBalance += amount;
            else if(account.equals("checking"))
                this.checkingBalance += amount;
            BankAccount.totalBalance += amount;
        }

        public void withdrawFunds(double amount, String account) {
            boolean successful = false;
            if(account.equals("savings")) {
                if(this.savingsBalance - amount >= 0) {
                        successful = true;
                        this.savingsBalance -= amount;
                }
            }
            else if(account.equals("checking")) {
                if(this.checkingBalance - amount >= 0) {
                        successful = true;
                        this.checkingBalance -= amount;
                }
            }
            
            if(successful) {
                    BankAccount.totalBalance -= amount;
            }
        
        else {
            System.out.println("Not enough money honey");
        }
        
        }

        public void showMeTheMoney() {
            System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
        }
}
