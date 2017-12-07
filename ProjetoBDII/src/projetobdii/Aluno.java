/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobdii;

/**
 *
 * @author PC-Dell
 */
public class Aluno {
    private int Matricula;
    private String Nome;
    private Curso Curso;
    
    public Aluno (){
    }
    
    public Aluno (int matricula, String nome) {
        this.Matricula = matricula;
        this.Nome = nome;
    }


    public int getMatricula() {
        return Matricula;
    }


    public void setMatricula(int matricula) {
        this.Matricula = matricula;
    }


    public String getNome() {
        return Nome;
    }


    public void setNome(String nome) {
        this.Nome = nome;
    }

    public Curso getCurso() {
        return Curso;
    }

    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }
    
    
    
}
