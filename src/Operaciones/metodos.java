package Operaciones;

import Cuenta.cuenta1;

import java.util.Scanner;

public class metodos {
    String titular;
 double cantidad;
 double disponible;
 double retiro;
    Scanner sc=new Scanner(System.in);
    cuenta1 ct1=new cuenta1();
    public String ingresarTitular() {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese el titular de la cuenta");
        titular=sc.nextLine();
         ct1.setTitular(titular);

     //   System.out.println("el titular es :"+ct1.getTitular());
        return titular;
    }
    public double ingresarCantidad(){
        Scanner sc=new Scanner( System.in);
        System.out.println("ingrese la cantidad");
         cantidad=sc.nextDouble();
        if (cantidad<0) {
            System.out.println("ingrese una cantidad válida");

        }else


        ct1.setCantidad(cantidad);
    //   System.out.println("la cantidad ingresada es:"+ct1.getCantidad());
        return cantidad;
    }
    public double ingresarRetiro(){
        Scanner sc=new Scanner( System.in);
        System.out.println("ingrese la cantidad a retirar");
         retiro=sc.nextDouble();

          ct1. setRetiro(retiro);

        return retiro;
    }
     public double saldoActual(){
    double    dispobible=0;
         if (cantidad-retiro<0) {
             disponible=0;

         }else {
             disponible = cantidad - retiro;
         }

             return dispobible;

         }
         public void mostrar(){

             System.out.println("el titular es:"+ct1.getTitular()+" "+"ingresado:"+" "+ct1.getCantidad()+" "+ "retirado:"+" "+ct1.getRetiro()+" "+"su aldo es:"+saldoActual());
         }

     }


