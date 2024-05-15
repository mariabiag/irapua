package mythgame;

public class Irapua {
private String nome;
private String corDaPele;
private double altura;
private int idade;
private String corDoCabelo;

public Irapua (String novoNome, String novaCorDaPele, double novaAltura, int novaIdade, String novaCorDoCabelo) {
this.nome = novoNome;
this.corDaPele = novaCorDaPele;
this.altura = novaAltura;
this.idade = novaIdade;
this.corDoCabelo = novaCorDoCabelo;
}

public String getNome () {
return nome;
}
  
public String getCorDaPele () {
return corDaPele;
}
  
public double getAltura () {
return altura;
}

public int getIdadde () {
return idade;
}

public String getCorDoCabelo () {
return corDoCabelo;
}

public void setNome (String novoNome) {
this.nome = novoNome;
}

public void setCorDaPele (String novaCorDaPele) {
this.corDaPele = novaCorDapele;
}
  
public void setAltura (double novaAltura) {
this.altura = novaAltura;
}

public void setIdade (int novaIdade) {
this.idade = novaIdade;
}

public void setCorDoCabelo (String novaCorDoCabelo) {
this.corDoCabelo = novaCorDoCabelo;
}

public void pular (String a) {
return a;
}

public void andar (String b) {
return b;
}

public void correr (String c) {
return c;
}

public void segurar (String d) {
return d;
}

public void pegar (String e) {
return e;
}

public String ImprimirInformacoes() {
return "Nome: " + this.nome + "\nCor da pele: " + this.corDaPele + "\nAltura: " + this.altura + "\nIdade: " + this.idade + "\nCor do Cabelo: " + this.corDoCabelo;
}

}
