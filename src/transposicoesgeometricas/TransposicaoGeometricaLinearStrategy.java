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
public class TransposicaoGeometricaLinearStrategy extends TransposicaoGeometricaColunar implements StrategyCypher {

    @Override
    public String encrypt(Cypher cypher) {
        return super.decrypt(cypher);
    }

    @Override
    public String decrypt(Cypher cypher) {
        return super.encrypt(cypher);
    }
    
}
