public class ContentamentoSatisfacaoCliente implements ICategoriasSatisfacaoCliente {

    private String contentamento;

    @Override
    public String getCategoriasSatisfacaoCliente() {
        return this.contentamento;
    }

    @Override
    public void setCategoriasSatisfacaoCliente(String categoria) {
        this.contentamento = categoria;
    }
}
