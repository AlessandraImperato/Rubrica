package it.alessandra.rubrica;

/**
 * Created by utente7.academy on 20/11/2017.
 */

public class Persona {
    String nome;
    String cognome;
    String telefono;

    public Persona(){
        this.nome = null;
        this.cognome = null;
        this.telefono = null;
    }

    public Persona(String nome, String cognome,String telefono){
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
