package Cuenta;

import java.util.Scanner;

public class cuenta1 {
    private String titular;
    private double cantidad;
    private double retiro;

    public cuenta1() {
    }

    public cuenta1(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;

    }
    public cuenta1(double retiro) {
        this.retiro = retiro;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }



    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }



    public String ingresarTitular() {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese el titular de la cuenta");
        titular=sc.nextLine();
        setTitular(titular);

        //   System.out.println("el titular es :"+ct1.getTitular());
        return titular;
    }
}