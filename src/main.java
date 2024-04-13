public class main {
    public static void main(String[] args) {

        // instantiate daw sabi ni sir ken
        bankAccount myAccount1 = new bankAccount("1", 1000.0, "Ken Lordian1", "pogisikenlordian1@gmail.com",
                "123-456-7890");
        bankAccount myAccount2 = new bankAccount("12", 1000.0, "Denver Lopez", "pogisiDenverlopez@gmail.com",
                "123-456-7890");
        bankAccount myAccount3 = new bankAccount("123", 1000.0, "Harry Sevilla", "pogisiSevillaHarry@gmail.com",
                "123-456-7890");
        bankAccount myAccount4 = new bankAccount("1234", 1000.0, "Jorge Feliciano", "pogisiJorgeFeliciano@gmail.com",
                "123-456-7890");
        bankAccount myAccount5 = new bankAccount("12345", 1000.0, "Uy Lance", "pogisiLanceUy@gmail.com",
                "123-456-7890");

        myAccount1.deposit(500);
        myAccount1.withdraw(200);

        myAccount2.deposit(700);
        myAccount2.withdraw(200);

        myAccount3.deposit(0);
        myAccount3.withdraw(1100);

        myAccount4.deposit(500);
        myAccount4.withdraw(200);

        myAccount5.deposit(500);
        myAccount5.withdraw(200);

    }
}