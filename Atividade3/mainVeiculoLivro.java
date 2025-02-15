package Atividade3;
public class mainVeiculoLivro {
public static void main(String[] args) {
    
Veiculo veiculo = new Veiculo(null, null, 0, null, null, 0);
Livro livro = new Livro(null, null, 0, 0, 0);
    
System.out.println("placa do carro:" + veiculo.getPlaca());
System.out.println("cor do carro:" + veiculo.getCor());
System.out.println("passageiros:" + veiculo.getQtdPassageiros());
System.out.println("velocidade maxima do carro:" + veiculo.getVm());
System.out.println("qual a quantnidade maxima de litros do tanque:" + veiculo.getQtdTanque());
System.out.println("quantos KM o carro percorre por litro:" + veiculo.getConsumo());


System.out.println("titulo do livro:" + livro.getTitulo());
System.out.println("autor:" + livro.getAutor());
System.out.println("isbn:" + livro.getIsbn());
System.out.println("numero de paginas" + livro.getPaginas());
System.out.println("valor:" + livro.getPrecos());

}
}
