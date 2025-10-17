package Aula11.SetGet;

public class TestaMedico {
private String nome;
 private int CRM;
 private double salario;
 private double  valorConsulta;

 public TestaMedico (String nome, int CRM, double salario, double valorConsulta, TestaMedico testaMedico){
    this.nome = "Pedro";
    this.CRM = 158490;
    this.salario = 0 ;
    testaMedico.valorConsulta = 750;

 }

 public String getNome() {
    return nome;
 }

 public void setNome(String nome) {
    this.nome = nome;
 }

 public int getCRM() {
    return CRM;
 }

 public void setCRM(int cRM) {
    CRM = cRM;
 }

 public double getSalario() {
    return salario;
 }

 public void setSalario(double salario) {
    this.salario = salario;
 }

 public double getValorConsulta() {
    return valorConsulta;
 }

 public void setValorConsulta(double valorConsulta) {
    this.valorConsulta = valorConsulta;
 }
}
