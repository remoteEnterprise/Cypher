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
public class ColumnarGeometricCypher extends Cypher {

    public ColumnarGeometricCypher(StrategyCypher strategyCypher, int xEnd, int yEnd) {
        super(strategyCypher, xEnd, yEnd);
    }

    @Override
    public void contructMessage(String message) {
        char[] messageChar = message.toUpperCase().toCharArray();
        int cont = 0;
        for(int x = 0; x < super.getxEnd(); x++) {
            for(int y = 0; y < super.getyEnd(); y++) {
                if(!(cont == messageChar.length)) { //SE A PALAVRA NAO ACABOU
                    super.getMessage()[x][y] = messageChar[cont++];
                } else { //SE A PALAVRA ACABOU PREENCHA OS ESPACOES VAZIOS COM "X"
                    super.getMessage()[x][y] = 'X';
                }
            }
        }
    }
    
}
