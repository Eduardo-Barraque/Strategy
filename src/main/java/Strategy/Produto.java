package Strategy;

public class Produto {
    private float custo;
    private float valorDesconto;

    public Produto(float custo, float valorDesconto) {
        this.custo = custo;
        this.valorDesconto = valorDesconto;
    }

    public float calcular(Desconto desconto) {
        return desconto.calcular(custo, valorDesconto);
    }
}
