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
public abstract class Cypher implements CypherIF {
    private char[][] message;
    private int xEnd, yEnd;
    private StrategyCypher strategyCypher;
    
    public Cypher(StrategyCypher strategyCypher, int xEnd, int yEnd) {
        this.strategyCypher = strategyCypher;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.message = new char[xEnd][yEnd];
    }

    public StrategyCypher getStrategyCypher() {
        return strategyCypher;
    }

    public void setStrategyCypher(StrategyCypher strategyCypher) {
        this.strategyCypher = strategyCypher;
    }

    public char[][] getMessage() {
        return message;
    }

    public void setMessage(char[][] message) {
        this.message = message;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }
    
    @Override
    public String toString() {
        String matriz = "";
        for(int x = 0; x < xEnd; x++) {
            for(int y = 0; y < yEnd; y++) {
                matriz += "["+this.message[x][y]+"]";
            }
            matriz += "\n";
        }
        return matriz;
    }
}
