/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author LABSIS
 */
public class Calculadorapa {
    //ATRIBUTOS
    double n1;
    double n2;
    int naux;
    double res;
    int opc1;
    int opc2;
    //metodos
    public double sumar(double n1, double n2){
        double c;
        c=n1+n2;
        return c;
    }
    public double restar(double n1, double n2){
        double c;
        c=n1-n2;
        return c;
    }
    public double multiplicar(double n1, double n2){
        double c;
        c=n1*n2;
        return c;
    }
    public double dividir(double n1, double n2){
        double c;
        if(n2==0){
        System.out.println("Error");
        return 34404;
        }else{
        c=n1/n2;
        return c;
        }
        
    }
    public double potencia(double n1, double n2){
        double c;
        c=Math.pow(n1,n2);
        return c;
    }
    public double seno(double n1, double n2){
double c, d;
n1=0.0;
d=Math.toRadians(n2);
c=Math.sin(d);
return c;
}
public double coseno(double n1, double n2){
double c, d;
n1=0.0;
d=Math.toRadians(n2);
c=Math.cos(d);
return c;
}
public double tan(double n1, double n2){
double c, d;
n1=0.0;
if(n2==90 || n2==270){
System.out.println("Error");
}else{
d=Math.toRadians(n2);
c=Math.tan(d);
return c;
} return 0;
}
public double raiz(double n1, double n2){
double c;
if(n1%2==0 && n2<0){
System.out.println("Error");
}else {
c=Math.pow(n1,1/n2);
return c;
} return 0;
}
public double iva(double n1, double n2){
double c;
c= n1+(n1*(n2/100));
return c;
}
public double opcion(int opc1,double n1,double n2){
double c=0;
switch(opc1){
case 1:
c=sumar(n1,n2);
break;
case 2:
c=restar(n1,n2);
break;
case 3:
c=multiplicar(n1,n2);
break;
case 4:
c=dividir(n1,n2);
break;
case 5:
c=seno(n1,n2);
break;
case 6:
c=coseno(n1, n2);
break;
case 7:
c=tan(n1,n2);
break;
case 8:
c=raiz(n1,n2);
break;
case 9:
c=potencia(n1, n2);
break;
case 10:
c=iva(n1,n2);
break;
} return c;
}
}
