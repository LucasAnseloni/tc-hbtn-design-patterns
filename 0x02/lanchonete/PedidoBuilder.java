

public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido = new Pedido();
    @Override
    public void setLanche(TipoLanche tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setTipoItemPedido(TipoItemPedido.LANCHE);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setTipoItemPedido(TipoItemPedido.BATATA);
        itemPedido.setNome(tamanho.name());

        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setTipoItemPedido(TipoItemPedido.BRINDE);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setTipoItemPedido(TipoItemPedido.BEBIDA);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemForaCaixa(itemPedido);
    }

    public Pedido build(){
        return pedido;
    }
}
