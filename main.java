public class main{
    public static void main(String[] args) {
        

        CartaoVisita cartao = new CartaoVisita("Luciano", "23432112", "Luci.ano@gmail.com");
        cartao.clone();
        cartao.exibirInformacoes();

        cartao.setNome("Alexandre");
        cartao.setTelefone("200000");
        cartao.exibirInformacoes();


    }
    


}