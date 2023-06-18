package entidades;

public class Contato {
    private String email;
    private String telefone;
    private String celular;
    private boolean celularWhatsapp;

    public Contato() {
    }

    public Contato(String email, String telefone, String celular, boolean celularWhatsapp) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularWhatsapp = celularWhatsapp;
    }


}
