package Atividade3;
public class Livro {

    private String titulo;
    private String autor;
    private double isbn;
    private int paginas;
    public double precos;
  
   
   
   
    public String getTitulo() {
        return titulo;
    }




    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }




    public String getAutor() {
        return autor;
    }




    public void setAutor(String autor) {
        this.autor = autor;
    }




    public double getIsbn() {
        return isbn;
    }




    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }




    public int getPaginas() {
        return paginas;
    }




    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }




    public double getPrecos() {
        return precos;
    }




    public void setPrecos(double precos) {
        this.precos = precos;
    }




    public Livro(String titulo, String autor, double isbn, int paginas, double precos) {
        this.titulo = "o pioneiro";
        this.autor = "Erick Lima";
        this.isbn = 48447484;
        this.paginas = 500;
        this.precos = 5988;
    }



    

}