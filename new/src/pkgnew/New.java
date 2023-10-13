/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgnew;




public class New implements animal {
    public void sleep(String q) {
        System.out.println(q);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        New a = new New();
        a.sleep("1");
    }

}
