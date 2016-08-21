/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.projetpod.peer2;

import com.sun.xml.internal.ws.developer.Serialization;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 *
 * @author Laerton
 */

public class Pessoa implements Serializable{
    private String cpf;
    private String nome;
    private static final long serialVersionUID = -7932047122858971692L;
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }


   

   
}
