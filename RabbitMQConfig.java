@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue filaAprovacoes() {
        return new Queue("fila_aprovacoes", true);
    }
}