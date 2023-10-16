/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_crud_pessoas;

/**
 *
 * @author Usuario
 */
public class Pessoa {
    private int codigo;
    private String nome, fone, email;
    
    public Pessoa (String nome, String fone, String email)   {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
    
    public int getCodigo()  {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setNome(String nome)    {
        this.nome = nome;
    }
    
    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
