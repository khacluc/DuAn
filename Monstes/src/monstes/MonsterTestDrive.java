/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monstes;

/**
 *
 * @author Blue Nowhere
 */
class Monster {

    void frighten() {
        System.out.println("arrrgh");
    }
}

class Vampire extends Monster {
    

    @Override
    void frighten() {
        super.frighten();
        System.out.println("breath");
    }

}

class Dragon extends Monster {

    @Override
    void frighten() {
        System.out.println("a bit");
    }

}

public class MonsterTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (Monster x : ma) {
            x.frighten();
        }
    }

}
