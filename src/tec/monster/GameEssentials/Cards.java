package tec.monster.GameEssentials;

import java.io.Serializable;

public class Cards implements Serializable {
    private String Efecto;
    private String Tipo;
    private String Color;

    public void setColor(String color) {
        Color = color;
    }
    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
    public void setEfecto(String efecto) {
        this.Efecto = efecto;
    }

    public String getColor() {
        return this.Color;
    }
    public String getEfecto() {
        return this.Efecto;
    }
    public String getTipo() {
        return this.Tipo;
    }
}