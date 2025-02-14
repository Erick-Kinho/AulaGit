package Atividade;
public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private double precos;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = "O Pioneiro";
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = "Erick Lima";
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = 150;
    }
    public double getPreços() {
        return precos;
    }
    public void setPreços(double precos) {
        this.precos = 59.88;
    }
    public Livro(String titulo, String autor, int paginas, double precos) {
        this.titulo = "O Pioneiro";
        this.autor = "Erick Lima";
        this.paginas = 150;
        this.precos = 59.88;
    }




}

