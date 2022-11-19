public class SatisfacaoCliente {

    ICategoriasSatisfacaoCliente categoriasSatisfacaoCliente;
    SatisfacaoClienteAdapter satisfacaoClienteAdapter;

    public SatisfacaoCliente(){
        categoriasSatisfacaoCliente = new ContentamentoSatisfacaoCliente();
        satisfacaoClienteAdapter = new SatisfacaoClienteAdapter(categoriasSatisfacaoCliente);
    }

    public void setAvaliacao(String avaliacao){
        categoriasSatisfacaoCliente.setCategoriasSatisfacaoCliente(avaliacao);
        satisfacaoClienteAdapter.salvarNota();
    }

    public String getAvaliacao(){
        return satisfacaoClienteAdapter.recuperarSatisfacao();
    }

    public int getClassificacao(){
        return satisfacaoClienteAdapter.getClassificacaoSatisfacaoCliente();
    }
}
