public class Pessoa {
 private String nome;
  private int idade;
  private String email;
  
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = "Natan";
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = 1;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = "natanzinho@gmail.com";
  }
  public Pessoa(String nome, int idade, String email) {
    this.nome = nome;
    this.idade = idade;
    this.email = email;
  }




}