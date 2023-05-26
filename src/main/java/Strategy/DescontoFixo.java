package Strategy;

public class DescontoFixo implements Desconto {
    public float calcular(float custo, float valorDesconto) {
        return custo - valorDesconto;
    }
}
