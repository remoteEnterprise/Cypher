/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transposicoesgeometricas;

/**
 *
 * @author leonardo
 */
public class TransposicoesGeometricas {

    
    public static void main(String[] args) {
        Cypher cypher = new ColumnarGeometricCypher(new TransposicaoGeometricaColunarStrategy(), 4, 6);
        cypher.contructMessage("ATRANSPOSIÇÃOÉEFICIENTE");
        System.out.print(cypher);
        System.out.println("Encrypted: "+cypher.getStrategyCypher().encrypt(cypher));
        System.out.println("Decrypted: "+cypher.getStrategyCypher().decrypt(cypher));
        
        cypher = new LinearGeometricCypher(new TransposicaoGeometricaLinearStrategy(), 4,6);
        cypher.contructMessage("ATRANSPOSIÇÃOÉEFICIENTE");
        System.out.print(cypher);
        System.out.println("Encrypted: "+cypher.getStrategyCypher().encrypt(cypher));
        System.out.println("Decrypted: "+cypher.getStrategyCypher().decrypt(cypher));
        
    }
    
}
