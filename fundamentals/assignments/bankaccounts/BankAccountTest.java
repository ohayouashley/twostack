class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccountA = new BankAccount();
    System.out.println("New Account Number - " + bankAccountA.getAccountNumber());
    bankAccountA.depositFunds(200.50, "checking");
    bankAccountA.depositFunds(14.40, "savings");
    bankAccountA.showMeTheMoney();
        System.out.println(BankAccount.totalBalance);

        bankAccountA.withdrawFunds(100.00, "checking");
        bankAccountA.withdrawFunds(75.50, "savings");
        bankAccountA.showMeTheMoney();
        System.out.println(BankAccount.totalBalance);

    BankAccount bankAccountB = new BankAccount();
    System.out.println("New Account Number - " + bankAccountB.getAccountNumber());
    bankAccountB.depositFunds(400.50, "checking");
    bankAccountB.depositFunds(500.35, "savings");
    bankAccountB.showMeTheMoney();
    bankAccountB.withdrawFunds(500.00, "checking");
    }
}
