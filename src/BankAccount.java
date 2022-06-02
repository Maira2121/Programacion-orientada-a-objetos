public class BankAccount {
    private int accountNumber;
    private Person titular;
    protected boolean activated;
    private double saldo;

    /**
     * Constructor: crea una instancia de la clase BankAccount.
     * @param accountNumber número de la cuenta.
     * @param titular titular de la cuenta.
     * @param activated dice si la cuenta está activada.
     * @param saldo saldo de la cuenta.
     */
    public BankAccount(int accountNumber, Person titular, boolean activated, double saldo) {
        this.accountNumber = accountNumber;
        this.titular = titular;
        this.activated = activated;
        this.saldo = saldo;
    }

    /**
     * método que devuelve el número de la cuenta
     * @return devuelve el número de la cuenta
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * método que asigna o modifica el número de la cuenta.
     * @param accountNumber, argumento necesario para asignar o modificar el número de la cuenta.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * método para obtener el titular de la cuenta.
     * @return devuelve o retorna el titular de la cuenta.
     */
    public Person getTitular() {
        return titular;
    }

    /**
     * método para asignar o modificar el titular de la cuenta.
     * @param titular argumento necesario para asignar o modificar el titular de la cuenta.
     */
    public void setTitular(Person titular) {
        this.titular = titular;
    }

    /**
     * método que dice si la cuenta está activa o no.
     * @return devuelve o retorna true o false dependiendo de si está activa o no la cuenta.
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * método para asignar o modificar el estado de la cuenta.
     * @param activated argumento necesario para asignar o modificar el estado de la cuenta.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * método que devuelve el saldo de la cuenta.
     * @return devuelve o retorna el valor del saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * método para asignar/modificar el saldo de la cuenta.
     * @param saldo argumento necesario para asignar o modificar el saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
