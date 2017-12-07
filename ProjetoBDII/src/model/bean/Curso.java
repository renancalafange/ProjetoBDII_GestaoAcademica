/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.ArrayList;
import projetobdii.Aluno;

/**
 *
 * @author PC-Dell
 */
public class Curso {
    private int Codigo;
    private String Nome;
    ArrayList<Aluno> ListaAluno;

    public Curso (){
        ListaAluno = new ArrayList();
    }
    
    public Curso (int codigo, String nome){
        this.Codigo = codigo;
        this.Nome = nome;
        ListaAluno = new ArrayList();
    }
    
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public ArrayList<Aluno> getListaAluno() {
        return ListaAluno;
    }

    public void setListaAluno(ArrayList<Aluno> listaAluno) {
        this.ListaAluno = listaAluno;
    }
    
    public void addAluno (Aluno a){
        a.setCurso(this);
        ListaAluno.add(a);
    }
}
