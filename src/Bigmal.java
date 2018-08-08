/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
/**
 *
 * @author Dell
 */
public class Bigmal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigDecimal test = new BigDecimal(15);
        BigDecimal demo=new BigDecimal(12);
        //System.out.println(test);
        System.out.println("demo"+demo);
        //test=test.add(demo);
       // System.out.println(test);
        //BigDecimal abst=new BigDecimal(5);
        //test=test.subtract(abst);
        System.out.println("Test"+test);
        System.out.println("val "+test.compareTo(demo));
    }
    
}
