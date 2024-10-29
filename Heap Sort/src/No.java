public class No<T> {
    private T elemento;
    private No<T> esquerda;
    private No<T> direita;

    public No(T elemento) {
        this.elemento = elemento;
        this.esquerda = null;
        this.direita = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }

    public No<T> getDireita() {
        return direita;
    }

    public void setDireita(No<T> direita) {
        this.direita = direita;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", esquerda=" + esquerda +
                ", direita=" + direita +
                '}';
    }
}
