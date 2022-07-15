
package org.reneyuman.system;

import java.util.Scanner;

/**
 Rene Alejandro Yuman Barco - 2020165
 * IN5AV
 * Este es un proyecto creado en java que trata sobre un menu el cual tiene 5 opciones.
 * El programa funciona con do while, switch case,ifs y demas.
 * Este programa fue hecho el 25/03/2021 el cual fue terminado a las 23:23 horas.
 */
public class Principal {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       int op,numpar,numf,f1,f2,i,sumar,n,seg,min,hr,dn,cant;   
        System.out.println("Rene Alejandro Yuman Barco - 2020165");
        System.out.println("IN5AV");
       do{
           System.out.println("");

               
        System.out.println("Bienvenido al MENU DE PROGRAMAS\n");
        System.out.println("Por favor, seleccione una de las siguientes opciones");
        System.out.println("1 = Segundos a H:M:S");
        System.out.println("2 = Numero a dinero");
        System.out.println("3 = Numeros Pares e Impares");
        System.out.println("4 = Numero perfecto");
        System.out.println("5 = Serie de Fibonacci");
        
        op = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Usted ha seleccionado Segundos a H:M:S");
                System.out.println("ingrese una cantidad de segundos");
                seg = sc.nextInt();
                
                hr = seg / 3600;
                min = (seg -hr*3600)/60;
                seg = seg - (hr*3600+min*60);
                
                System.out.println(hr+":"+min+":"+seg);
                break;
                
            case 2:
                System.out.println("Usted ha seleccionado Numero a dinero");
                System.out.println("ingrese la cantidad de dinero");
                dn = sc.nextInt();
                
                if(dn >= 200){
                    cant= dn/200;
                    System.out.println(cant+" billete/s de 200");
                    dn  = dn-(cant*200);
                }
                if(dn >= 100){
                    cant= dn/100;
                    System.out.println(cant+" billete/s de 100");
                    dn  = dn-(cant*100);
                }
                if(dn >= 50){
                    cant= dn/50;
                    System.out.println(cant+" billete/s de 50");
                    dn  = dn-(cant*50);
                }
                if(dn >= 20){
                    cant= dn/20;
                    System.out.println(cant+" billete/s de 20");
                    dn  = dn-(cant*20);
                }
                if(dn >= 10){
                    cant= dn/10;
                    System.out.println(cant+" billete/s de 10");
                    dn  = dn-(cant*10);
                }
                if(dn >= 5){
                    cant= dn/5;
                    System.out.println(cant+" billete/s de 5");
                    dn  = dn-(cant*5);
                }
                if(dn >= 1){
                    cant= dn/1;
                    System.out.println(cant+" billete/s de 1");
                    dn  = dn-(cant*1);
                }
                break;
                
            case 3:
                System.out.println("usted ha seleccionado Numeros Pares e Impares");
                
                System.out.println("Ingrese el numero");
                numpar = sc.nextInt();
                
                if(numpar / 2 == 0){
                    System.out.println("Es un numero par");
                }else{
                    System.out.println("Es un numero impar");
                }

                break;
                
            case 4:
                System.out.println("Usted ha seleccionado Numero perfecto");
                
                System.out.println("Ingrese el numero");
                n = sc.nextInt();
                sumar = 0;
                
                for (i = 1; i < n; i++) {                        
                    if (n % i == 0) {
                    sumar = sumar + i;
                }
                }
                if (sumar == n) {                     
                    System.out.println("Es un numero perfecto");
                } else {
                    System.out.println("No es un numero perfecto");
                }
        
                break;
                
            case 5:
                System.out.println("Usted ha seleccionado Serie de Fibonacci");
                
                do{
                    System.out.println("Introduce numero que sea mayor a 1");
                    numf = sc.nextInt();    
                }while(numf<=1);
                
                System.out.println("La serie Fibonacci es");
                
               f1=1;
                f2=1;

                System.out.print(f1 + " ");
                for(i=2;i<=numf;i++){
                    System.out.print(f2 + " ");
                    f2 = f1 + f2;
                    f1 = f2 - f1;
                }
        
                break;
                
            default:
                System.out.println("Lo sentimos, no ha seleccionado una opcion valida");
                
                break;
        }
            
            
 
            }while(op !=6);
    
 }
}
           
    

            