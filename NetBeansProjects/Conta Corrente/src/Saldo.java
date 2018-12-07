
/**
 *
 * @author Lucas Felipe
 */
public class Saldo {

    private String sNumConts;
    private double dSaldo = 0;

    public String getsNumConts() {
        return sNumConts;
    }

    public void setsNumConts(String sNumConts) {
        this.sNumConts = sNumConts;
    }

    public double getdSaldo() {
        return dSaldo;
    }

    public void setCreditar(double dCredito) {
        dSaldo = dSaldo + dCredito;
    }

    public void setDebitar(double dDebito) {
        dSaldo = dSaldo - dDebito;
    }
}
