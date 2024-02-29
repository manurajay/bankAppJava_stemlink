

public class Main {
    //project is now on github you can check it

    public static void main(String[] args) {
        user ashini = new user("Ashini Abey","08th June", "Panadura");
        user thenuk = new user("Thenuk Jay", "4th Feb", "Kaluthara");
        user sasanka = new user("sasanka","05th May", "Kosgama");
        System.out.println(ashini.name);
        System.out.println(thenuk.name);
        System.out.println(sasanka.name);
        System.out.println(sasanka.address);

        System.out.println("-------------------------------------------");

        BankAccount ashiniSavingAccount = new BankAccount("9020120", 2300, "SA", ashini.name, ashini.birthday, ashini.address);
        ashiniSavingAccount.withdrwal(2000);
        ashiniSavingAccount.loanInterest(8);

        System.out.println("-------------------------------------------");

        BankAccount thenukFdAccount = new BankAccount("2321230", 0, "FD", thenuk.name, thenuk.address, thenuk.birthday);
        thenukFdAccount.deposit(1000);
        thenukFdAccount.loanInterest(4);

        System.out.println("-------------------------------------------");

    }
}