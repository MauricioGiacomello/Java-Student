package entities;

public class execFixacao {

    private String name;
    private String email;
    private int telefone;

    public execFixacao(String name, String email, int telefone) {
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }

    public execFixacao() {
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEmail() {
        return email;

    }

    public void setEmail() {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone() {
        this.telefone = telefone;

    }

    public String toString(){

        return name + ", " + email + ", " + telefone;
    }


}
