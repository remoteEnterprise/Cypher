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
public interface StrategyCypher {
    public String encrypt(Cypher cypher);
    public String decrypt(Cypher cypher);
}
