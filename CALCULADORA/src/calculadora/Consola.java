/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Consola {
    public static void main(String[] args) {
    int cont=0;
    int op;
    do{
    Scanner leer = new Scanner(System.in);
    Calculadorapa cal = new Calculadorapa();
    System.out.println("Calculadora");
System.out.println("numero uno: ");
cal.n1=leer.nextDouble();
System.out.println("Digite la opcion que desea");
System.out.println("1.Sumar");
System.out.println("2.Restar");
System.out.println("3.multiplicar");
System.out.println("4.Dividir");
System.out.println("5.Funcion seno");
System.out.println("6.Funcion coseno");
System.out.println("7.Funcion tangente");
System.out.println("8.Potencia enesima");
System.out.println("9.Raiz enesima");
System.out.println("10.IVA");
op=leer.nextInt();
System.out.println("Numero dos: ");
cal.n2=leer.nextDouble();
cal.res=cal.opcion(op,cal.n1,cal.n2);
System.out.println("resultado: "+cal.res);
System.out.println("Desea realizar otra accion? 1.si 0.no");
cont=leer.nextInt();
}while(cont!=0);
}
}
