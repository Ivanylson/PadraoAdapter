public class SatisfacaoClienteAdapter extends ClassificacaoSatisfacaoCliente {
    private ICategoriasSatisfacaoCliente categoriasSatisfacaoCliente;

    public SatisfacaoClienteAdapter(ICategoriasSatisfacaoCliente categoriasSatisfacaoCliente){
        this.categoriasSatisfacaoCliente = categoriasSatisfacaoCliente;
    }

    public String recuperarSatisfacao(){
        if(this.getClassificacaoSatisfacaoCliente() == 1){
            categoriasSatisfacaoCliente.setCategoriasSatisfacaoCliente("Muito Insatisfeito");
        }else if(this.getClassificacaoSatisfacaoCliente() == 2){
            categoriasSatisfacaoCliente.setCategoriasSatisfacaoCliente("Insatisfeito");
        }else if(this.getClassificacaoSatisfacaoCliente() == 3){
            categoriasSatisfacaoCliente.setCategoriasSatisfacaoCliente("Neutro");
        }else if(this.getClassificacaoSatisfacaoCliente() == 4){
            categoriasSatisfacaoCliente.setCategoriasSatisfacaoCliente("Satisfeito");
        }else if(this.getClassificacaoSatisfacaoCliente() == 5){
            categoriasSatisfacaoCliente.setCategoriasSatisfacaoCliente("Muito satisfeito");
        }

        return categoriasSatisfacaoCliente.getCategoriasSatisfacaoCliente();
    }


    public void salvarNota(){
        if(categoriasSatisfacaoCliente.getCategoriasSatisfacaoCliente().equals("Muito Insatisfeito")){
            this.setClassificacaoSatisfacaoCliente(1);
        }else if(categoriasSatisfacaoCliente.getCategoriasSatisfacaoCliente().equals("Insatisfeito")) {
            this.setClassificacaoSatisfacaoCliente(2);
        }else if(categoriasSatisfacaoCliente.getCategoriasSatisfacaoCliente().equals("Neutro")) {
            this.setClassificacaoSatisfacaoCliente(3);
        }else if(categoriasSatisfacaoCliente.getCategoriasSatisfacaoCliente().equals("Satisfeito")) {
            this.setClassificacaoSatisfacaoCliente(4);
        }
        else if(categoriasSatisfacaoCliente.getCategoriasSatisfacaoCliente().equals("Muito satisfeito")) {
            this.setClassificacaoSatisfacaoCliente(5);
        }
    }


}
