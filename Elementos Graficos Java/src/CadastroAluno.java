import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Classe modelo
class Aluno{
    private String nome;
    private String email;
    private String curso;
    private String genero;
    private boolean receberEmail;
    private boolean receberNotificacao;
    private String rua;
    private String cidade;

    //Getter e Stters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail() {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso() {
        this.curso = curso;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero() {
        this.genero = genero;
    }

    public boolean isReceberEmail() {
        return receberEmail;
    }
    public void setReceberEmail(boolean receberEmail) {
        this.receberEmail = receberEmail;
    }

    public  boolean isReceberNotificacao() {
        return receberNotificacao;
    }
    public void setReceberNotificacao(boolean receberNotificacao) {
        this.receberNotificacao = receberNotificacao;
    }

    public  String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

