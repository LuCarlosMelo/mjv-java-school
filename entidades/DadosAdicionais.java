package entidades;

import java.util.ArrayList;
import java.util.List;

public class DadosAdicionais {

    private List<String> habilidades;
    private double pretensaoMinima;
    private double pretensaoMaxima;

    public DadosAdicionais() {
    }

    public DadosAdicionais(List<String> habilidades, double pretensaoMinima, double pretensaoMaxima) {
        this.habilidades = habilidades;
        this.pretensaoMinima = pretensaoMinima;
        this.pretensaoMaxima = pretensaoMaxima;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public double getPretensaoMinima() {
        return pretensaoMinima;
    }

    public void setPretensaoMinima(double pretensaoMinima) {
        this.pretensaoMinima = pretensaoMinima;
    }

    public double getPretensaoMaxima() {
        return pretensaoMaxima;
    }

    public void setPretensaoMaxima(double pretensaoMaxima) {
        this.pretensaoMaxima = pretensaoMaxima;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

//        for (String obj : getHabilidades()){
//
//        }

        stringBuilder.append(getHabilidades() + "; ");
        stringBuilder.append(getPretensaoMinima() + "; ");
        stringBuilder.append(getPretensaoMaxima());

        return stringBuilder.toString();
    }
}
