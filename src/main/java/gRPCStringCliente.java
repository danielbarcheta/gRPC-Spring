import generated.ServicoStringGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import generated.*;

public class gRPCStringCliente {
    public static void main(String[] args) {
        // Criação do canal de comunicação com o servidor gRPC
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        // Criação do cliente gRPC para o serviço StringService
        ServicoStringGrpc.ServicoStringBlockingStub stringClient =
                ServicoStringGrpc.newBlockingStub(channel);

        // Criação do objeto de requisição
        string_request request = string_request.newBuilder()
                .setInput("exemplo de string em minúsculo")
                .build();

        // Medição do tempo de início da requisição
        long startTime = System.currentTimeMillis();

        // Chamada do método remoto "callparaMaiusculo" do serviço StringService
       string_response response = stringClient.paraMaiusculo(request);

        // Medição do tempo de fim da requisição
        long endTime = System.currentTimeMillis();

        // Cálculo do tempo de resposta em milissegundos
        long responseTime = endTime - startTime;

        // Impressão da resposta recebida do servidor
        System.out.println("Resposta do servidor: " + response.getOutput());

        // Impressão do tempo de resposta
        System.out.println("Tempo de resposta: " + responseTime + " ms");

        // Fechamento do canal de comunicação
        channel.shutdown();
    }
}
