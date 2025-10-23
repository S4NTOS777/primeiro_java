package Aula11.SetGet;

public class Medico {
 private String nome;
 private int crm;
 private double salario;
 private double  valorConsulta;
 
 public Medico(String nome, int cRM, double salario, double valorConsulta) {
    this.nome = nome;
     this.crm = cRM;
     this.salario = salario;
     this.valorConsulta = valorConsulta;
    }
    public void PagDinheiro (double valorConsulta){
        salario = valorConsulta + salario;
    }
    public void PagPlano (double valorConsulta){
       salario += valorConsulta * 0.7;
       
    }

 public String getNome() {
    return nome;
}
 public void setNome(String nome) {
    this.nome = nome;
 }
 public int getCRM() {
    return crm;
 }
 public void setCRM(int cRM) {
    crm = crm;
 }
 public double getSalario() {
    return salario;
 }
 public void setSalario(double salario) {
    if (salario > 0){
        this.salario = salario;
    }else {
        System.out.println("Salário não pode ser menor que zero ! ");
    }

 }
 public double getValorConsulta() {
    return valorConsulta;
 }
 public void setValorConsulta(double valorConsulta) {
    if ( valorConsulta < 0){
        System.out.println("VAlor da consulta não pode ser menor que zero ! ");
    }
    this.valorConsulta = valorConsulta;
 }
}
 