package entidades;

public class DadosProfissionais {
    private String profissao;
    private String empresa;
    private double salario;
    private boolean empregado;

    public DadosProfissionais() {
    }

    public DadosProfissionais(String profissao, String empresa, double salario, boolean empregado) {
        this.profissao = profissao;
        this.empresa = empresa;
        this.salario = salario;
        this.empregado = empregado;
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

    public boolean temEmrego() {
        return empregado;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getProfissao() + "; ");
        stringBuilder.append(getEmpresa() + "; ");
        stringBuilder.append(getSalario() + "; ");

        String empregado = (temEmrego()) ? "Sim" : "Não";
        stringBuilder.append(empregado + "; ");

        return stringBuilder.toString();
    }
}
