package com.alan;
import java.util.Scanner;
import com.alan.banco.Banco;
import com.alan.paquete1.Persona;
import com.alan.paquete2.Animal; //Se importa la clase Animal que esta dentro de otro paquete

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // Persona alan = new Persona();
       // alan.nombre= "Alan Mejia";
       // alan.edad= 19;        No se puede accedder poorque son datos privados
        //Animal perrito = new Animal();
        //perrito.nombre="Firulais";//Se puede modificar el atributo de una clase con modificador de acceso public
        //perrito.edad = 2; //No se puede modificar el valor de un atributo con modifciador de acceso default


        /*System.out.println("Introduce un nombre");
        String nombre= input.toString();
        System.out.println("Introduce una clabe");
        String clabe = input.toString();
        System.out.println("Introduce el saldo");
        int saldo = input.nextInt();
        */
        Banco cuentaAlan = new Banco("Alan Mejia","AEDS4581005WAD",100000);
        cuentaAlan.imprimir();

        System.out.println("\n------------------------------------------------\n");
        Persona persona= new Persona("Santiago", 19, "WDAWDWDA");
        System.out.println(persona.getName());
        System.out.println(persona.getAge());
        System.out.println(persona.getId());

        Persona copia_persona = new Persona(persona);

        System.out.println("\n------------------------------------------------\n");
        persona.setName("Alan Mejia");
        System.out.println("Cambio de nombre a: "+ persona.getName());
        System.out.println(persona.getAge());
        System.out.println(persona.getId());

        System.out.println("\n------------------------------------------------\n");
        System.out.println("Regresando a valores predeterminados\n");
        System.out.println(copia_persona.getName());
        System.out.println(copia_persona.getAge());
        System.out.println(copia_persona.getId());

        System.out.println("\n------------------------------------------------\n");
        System.out.println("Crea un objeto por tu cuenta\n");
        System.out.println("Introduce un nombre: ");
        String nombre= input.nextLine();
        System.out.println("\nTu id: ");
        String id= input.nextLine();
        System.out.println("\nIntroduce tu edad: ");
        int edad= input.nextInt();

        Persona persona3 = new Persona(nombre,edad, id);
        persona3.imprimir();

        int numerador = 10;
        int denominador=0;
        float division=0;
        System.out.println("Antes de la division: ");
        try{
            division= numerador/denominador;
        }catch (NullPointerException ex){//IMPORTANTE: Catch solo atrapa el error de una operacion a la vez, es decir si creemos que 2 operaciones son las que pueden fallar, necesitamos crear otro try y otro catch
            //PODEMOS ANIDAR MUCHO EXCEPTION PERO LA REGLA ES IR DEL MAS ESPECIFICO AL MAS GENERAL
        } catch (Exception ex){//Este engloba a todas la exceptions por lo que es el mas general
            System.out.println(ex.getMessage());
        }finally {

        }
        System.out.println(division);
        System.out.println("Despues de la division: ");
    }
}
