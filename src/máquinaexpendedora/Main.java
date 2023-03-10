/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package máquinaexpendedora;

/**
 *
 * @author José María Sánchez Infante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Esta es una máquina expendedora");
        MaquinaExpendedoraSanchezInfanteJoseMaria2223 snack;

        snack = new MaquinaExpendedoraSanchezInfanteJoseMaria2223(13, 2, 5);
        
        sube1_PrecioSanchezInfanteJoseMaria2223(snack);

        sube2_PrecioSanchezInfanteJoseMaria2223(snack);

        obtener1_UnidadesSanchezInfanteJoseMaria2223(snack);

        obtener2_UnidadesSanchezInfanteJoseMaria2223(snack);

        obtener3_UnidadesSanchezInfanteJoseMaria2223(snack);

    }

    private static void obtener3_UnidadesSanchezInfanteJoseMaria2223(MaquinaExpendedoraSanchezInfanteJoseMaria2223 snack) {
        /*Vamos a intentar sacar 12 snack, y tengo 50 euros.
        Como no hay unidades suficientes en la máquina saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("3º.- Vamos a sacar snacks (queremos 12 y tenemos 50 €)");
            snack.sacarsnack(12, 50, "pegatina");
            System.out.println("Operación realizada, ahora tiene " + snack.obtenerUnidades() + " unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes unidades");
            System.out.println("El nº de unidades sigue siendo: " + snack.obtenerUnidades());

        }
    }

    private static void obtener2_UnidadesSanchezInfanteJoseMaria2223(MaquinaExpendedoraSanchezInfanteJoseMaria2223 snack) {
        /*Vamos a intentar sacar 2 snack, y tengo 9 euros.
        Ahora se actualizará el número de snack que tenemos en
        la máquina*/
        try {
            System.out.println("2º.- Vamos a sacar snacks (queremos 2 y tenemos 9 €)");
            snack.sacarsnack(2, 9, "pegatina");
            System.out.println("Operación realizada, ahora tiene " + snack.obtenerUnidades() + " unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes dinero");
            System.out.println("El nº de unidades sigue siendo: " + snack.obtenerUnidades());

        }
    }

    private static void obtener1_UnidadesSanchezInfanteJoseMaria2223(MaquinaExpendedoraSanchezInfanteJoseMaria2223 snack) {
        /*Vamos a intentar sacar 2 snack, y tengo 5 euros.
        Como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("1º.- Vamos a sacar snacks (queremos 2 y tenemos 5 €)");
            snack.sacarsnack(2, 5, "pegatina");
            System.out.println("Operación realizada, ahora tiene " + snack.obtenerUnidades() + " unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficiente dinero");
            System.out.println("El nº de unidades sigue siendo: " + snack.obtenerUnidades());

        }
    }

    private static void sube2_PrecioSanchezInfanteJoseMaria2223(MaquinaExpendedoraSanchezInfanteJoseMaria2223 snack) {
        /*Vamos a aumentar el precio 3€, como supera el precio máximo establecido la operación
        no tendrá éxito y se mantendrá el precio anterior*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un snack por encima del precio máximo");
            snack.aumentarPrecio(3);
            System.out.println("El precio actual es " + snack.obtenerPrecio() + " €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio porque se supera el precio máximo de 5 €");
        }
    }

    private static void sube1_PrecioSanchezInfanteJoseMaria2223(MaquinaExpendedoraSanchezInfanteJoseMaria2223 snack) {
        /*Vamos a aumentar el precio 1€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 3€*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un snack por debajo del precio máximo");
            snack.aumentarPrecio(1);
            System.out.println("El precio actual es " + snack.obtenerPrecio() + " €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");
        }
    }

}
