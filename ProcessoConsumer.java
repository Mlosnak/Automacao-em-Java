@Component
public class ProcessoConsumer {

    @RabbitListener(queues = "fila_aprovacoes")
    public void consumirMensagem(SolicitacaoDespesaDTO solicitacao) {
        // Lógica de aprovação automática
    }
}