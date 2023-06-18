package entidades;

public class DadosProfissionais {
    private String profissao;
    private String empresa;
    private double salario;
    private boolean empregoAtual;

    public DadosProfissionais() {
    }

    public DadosProfissionais(String profissao, String empresa, double salario, boolean empregoAtual) {
        this.profissao = profissao;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }
}
