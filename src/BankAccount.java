public class BankAccount {
    public String accountNumber;
    public int balance;
    public String accountType;
    public String name;
    public String birthday;
    public String address;
    public int years;
    public double intrest;
    public double total;

    //bank account constructor
    public BankAccount(String accountNumber, int balance, String accountType, String name, String address, String birthday){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    //withdrwal method
    public void withdrwal(int amount) {
        //check the balance
        //if the balance is enough deduct the amount from balance
        //else print insufficient account balance
        if (this.balance > amount){
            this.balance = this.balance - amount;
            System.out.println("Withdrwal Success");
        }
        else {
            System.out.println("Insufficient Account Balance" + this.balance);
        }
    }

    //deposit method
    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    //loan intrest method
    //if account -> saving -> input years -> 2% intrest calculate
    //if account -> FDaccount -> input years ->
                                        //if years < 2 ->  12.5%
                                        //if years < 5 ->  16.5%
                                        //if years > 5 ->  20%
    public void loanInterest(int years) {
        this.years = years;
        if (this.accountType == "SA") {
            System.out.println(this.name + " your account is a " + this.accountType + " account");
            this.intrest = this.balance * 0.2 * this.years;
            this.total = this.balance + this.intrest;
        }
        else if (this.accountType == "FD") {
            System.out.println(this.name + "your account is a " + this.accountType + "account");
            if (this.years < 2000) {
                this.intrest = this.balance * 12.5 * this.years;
            }
            else if (this.years < 5000) {
                this.intrest = this.balance * 16.5 * this.years;
            }
            else {
                this.intrest = this.balance * 20 * this.years;
            }
            this.total = this.balance + this.intrest;
        }
        else {
              System.out.println("Your account dont support for loans");
        }
        System.out.println("Your Balance : " + this.balance);
        System.out.println("Intrest for " + this.years + " years : " + this.intrest );
        System.out.println("Total balance " + this.total);
    }
}
