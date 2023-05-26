package Strategy;

public class DescontoPorcentagem implements Desconto {
    public float calcular(float custo, float valorDesconto) {
        return custo - (custo *( valorDesconto/100));
    }
}
