
package br.ulbra;


public class pessoa {
   //atributos
private String nome;
private int idade;
private String cidade;

public pessoa(){

}

public pessoa(String nome){
this.nome = nome;
}

public pessoa(String nome,int idade){
this.nome = nome;
this.idade = idade;
}


public void setNome(String nome){
this.nome = nome;
}

public void setIdade(int idade){
this.idade = idade;
}

public void setCidade(String cidade){
this.cidade = cidade;
}

public String getNome(){
return nome;
}

public int getIdade(){
return idade;
}

public String getCidade(){
return cidade;
}


public void exibirDados(String nome){
System.out.println("Nome: " + nome);
}

public void exibirDados(String nome,int idade){
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
}

public void exibirDados(String nome,int idade,String cidade){
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
System.out.println("Cidade: " + cidade);
}

}
 

