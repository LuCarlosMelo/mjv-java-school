package entidades;

import java.util.ArrayList;
import java.util.List;

public class DadosAdicionais {

    private List<String> habilidades = new ArrayList<>();
    private double valorMinimoSalario;
    private double valorMaximoSalario;

    public DadosAdicionais() {
    }

    public DadosAdicionais(List<String> habilidades, double valorMinimoSalario, double valorMaximoSalario) {
        this.habilidades = habilidades;
        this.valorMinimoSalario = valorMinimoSalario;
        this.valorMaximoSalario = valorMaximoSalario;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public double getValorMinimoSalario() {
        return valorMinimoSalario;
    }

    public void setValorMinimoSalario(double valorMinimoSalario) {
        this.valorMinimoSalario = valorMinimoSalario;
    }

    public double getValorMaximoSalario() {
        return valorMaximoSalario;
    }

    public void setValorMaximoSalario(double valorMaximoSalario) {
        this.valorMaximoSalario = valorMaximoSalario;
    }
}
