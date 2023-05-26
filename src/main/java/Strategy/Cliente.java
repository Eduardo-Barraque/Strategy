package Strategy;

public class Cliente {
    private float preco;

    public float getPreco() {
        return preco;
    }

    public void precoSemDesconto(float preco) {
        this.preco = preco;
    }
    public void precoComDiscontoFixo(float preco, float valorDesconto) {
        Produto produto = new Produto(preco, valorDesconto);
        this.preco = produto.calcular(new DescontoFixo());
    }
    public void precoComDiscontoPorcentagem(float preco, float valorDesconto) {
        Produto produto = new Produto(preco, valorDesconto);
        this.preco = produto.calcular(new DescontoPorcentagem());
    }
}
