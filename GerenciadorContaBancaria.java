/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heranca;

/**
 *
 * @author marco
 */
public class GerenciadorContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        
        cc1.setNumero(1);
        cc1.setAgencia(10);
        cc1.setSaldo(0);

    }
    
}
