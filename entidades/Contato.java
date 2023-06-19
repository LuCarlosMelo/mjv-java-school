package entidades;

public class Contato {
    private String email;
    private Long telefone;
    private Long celular;
    private boolean temWhatsapp;

    public Contato() {
    }

    public Contato(String email, Long telefone, Long celular, boolean temWhatsapp) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.temWhatsapp = temWhatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public boolean temWhatsapp() {
        return temWhatsapp;
    }

    public void setCelularWhatsapp(boolean temWhatsapp) {
        this.temWhatsapp = temWhatsapp;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getEmail() + "; ");
        stringBuilder.append(getTelefone() + "; ");
        stringBuilder.append(getCelular() + "; ");

        String temWhatsapp = (temWhatsapp()) ? "Sim" : "Não";
        stringBuilder.append(temWhatsapp + "; ");

        return stringBuilder.toString();
    }
}
