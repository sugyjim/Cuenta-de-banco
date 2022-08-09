package Cuenta;

import Operaciones.metodos;

public class Ahorro extends cuenta1{

    private String tipoCuenta;

    public Ahorro(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Ahorro(String titular, double cantidad, String tipoCuenta) {
        super(titular, cantidad);
        this.tipoCuenta = tipoCuenta;
    }

    public Ahorro(double retiro, String tipoCuenta) {
        super(retiro);
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String ingresarTitular() {
        return super.ingresarTitular();
    }
}
