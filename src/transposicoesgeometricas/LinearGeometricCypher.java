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
public class LinearGeometricCypher extends Cypher {

    public LinearGeometricCypher(StrategyCypher strategyCypher, int xEnd, int yEnd) {
        super(strategyCypher, xEnd, yEnd);
    }

    @Override
    public void contructMessage(String message) {
        char[] messageChar = message.toUpperCase().toCharArray();
        
        int cont = 0;
        for(int x = 0; x < super.getyEnd(); x++) {
            for(int y = 0; y < super.getxEnd(); y++) {
                if(!(cont == messageChar.length)) {
                    super.getMessage()[y][x] = messageChar[cont++];
                } else {
                    super.getMessage()[y][x] = 'X';
                }
            }
        }
    }
    
}
