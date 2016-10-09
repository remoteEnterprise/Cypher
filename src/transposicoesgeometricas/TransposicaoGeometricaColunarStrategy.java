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
public class TransposicaoGeometricaColunarStrategy implements StrategyCypher {

    @Override
    public String encrypt(Cypher cypher) {
        
        String encryptedMessage = "";
        
        //A MATRIX VAI TER QUE DEIXAR DE SER HORIZONTAL E SE TORNAR VERTICAL
        //4 X 6 SE TORNA 6 X 4
        for(int x = 0; x < cypher.getyEnd(); x++) {     //X VAI ATE Y
            for(int y = 0; y < cypher.getxEnd(); y++) { //Y VAI ATE X
                encryptedMessage += cypher.getMessage()[y][x];
            }
            encryptedMessage += " ";                    //UM ESPACO A CADA COLUNA
        }
        
        
        return encryptedMessage;
    }

    @Override
    public String decrypt(Cypher cypher) { 
        String message = "";
        
        for(int x = 0; x < cypher.getxEnd(); x++) {
            for(int y = 0; y < cypher.getyEnd(); y++) {
                message += cypher.getMessage()[x][y];
            }
            message += " ";
        }
        
        return message;
    }
    
}
