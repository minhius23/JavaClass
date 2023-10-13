    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageandinterface;


/**
 *
 * @author minhius23
 */
public class PackageAndInterface  implements Maytinhbotui { 
       public double cong(double a, double b){
        return a+b;
    }

    public double tru(double a, double b){
        return a-b;
        
    }

    public double nhan(double a, double b){
        return a*b;
    }

    public double chia(double a, double b){
        return a/b;
    }

    public static void main(String[] args){
        PackageAndInterface mt = new PackageAndInterface();
        System.out.print(mt.cong(2, 5));
    }
}