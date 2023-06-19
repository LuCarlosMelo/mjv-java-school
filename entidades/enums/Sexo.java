package entidades.enums;

public enum Sexo {

     M("masculino"),
    F("Feminino");

    private final String descricao;

    private Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
