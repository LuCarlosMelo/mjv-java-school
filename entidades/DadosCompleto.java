package entidades;

public class DadosCompleto {
    private DadosPessoais pessoais;
    private Endereco endereco;
    private Contato contato;
    private DadosProfissionais profissionais;
    private DadosAdicionais adicionais;

    public DadosCompleto(DadosPessoais pessoais, Endereco endereco, Contato contato, DadosProfissionais profissionais, DadosAdicionais adicionais) {
        this.pessoais = pessoais;
        this.endereco = endereco;
        this.contato = contato;
        this.profissionais = profissionais;
        this.adicionais = adicionais;
    }
    public String toString(){
        var stringBuilder = new StringBuilder();

        stringBuilder.append(pessoais.toString());
        stringBuilder.append(endereco.toString());
        stringBuilder.append(contato.toString());
        stringBuilder.append(profissionais.toString());
        stringBuilder.append(adicionais.toString());

        return stringBuilder.toString();
    }
}
