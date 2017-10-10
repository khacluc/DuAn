/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixedup;

/**
 *
 * @author khacl
 */
class A{
    int ivar = 7;
    void m1(){
        System.out.print("A's m1, ");
    }
    void m2(){
        System.out.print("A's m2, ");
    }
    void m3(){
        System.out.print("A's m3,");
    }
}
class B extends A{
    @Override
    void m1(){
        System.out.print("B's m1, ");
    }
}
class C extends B{
    @Override
    void m3(){
        System.out.print("C's m3, " + (ivar + 1)); 
    }
}
    
public class MixedUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a= new A();
        B b= new B();
        C c= new C();
        A a2= new C();
        b.m1(); 
        c.m2();
        a.m3();
        System.out.println();
        c.m1(); c.m2(); c.m3();
        System.out.println();
        a.m1(); b.m2(); c.m3();
        System.out.println();
        a2.m1(); a2.m2(); a2.m3();
    }
    
}
