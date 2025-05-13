class CartaoVisita implements CartaoPrototype {
    String nome;
    String telefone;
    String email;

    CartaoVisita(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    @Override
    public CartaoPrototype clone() {
        return new CartaoVisita(this.nome, this.telefone, this.email);
    }
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " Telefone: " + telefone + " Email: " + email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}