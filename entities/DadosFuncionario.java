package entities;

import java.util.ArrayList;

public class DadosFuncionario {

    private String idFuncionario;
    private String nomeFuncionario;
    private Float  salario;


    public DadosFuncionario (String idFuncionario, String nomeFuncionario, Float salario){

        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;


    } 

    public String getidFuncionario(){
        return idFuncionario;
    }

    public void setidFuncionario(String idFuncionario) {
         this.idFuncionario = idFuncionario;
    }

    public String getnomeFuncionario(){
        return nomeFuncionario;
    }

    public void setnomeFuncionario(String nomeFuncionario){
        
        this.nomeFuncionario = nomeFuncionario;
    }

    public Float getsalario(){
        return salario;
    }

    public void setSalario(Float salario){
        this.salario=salario;
    }
    
    public String toString(){

        return "ID: " + idFuncionario + " Nome: " + nomeFuncionario + " Salário: " + String.format("%.2f", salario);

    }

}
