import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.MathServiceImplementado;
import service.StringServiceImplementado;
import service.StringServiceImplementado;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        // Cricao o servidor gRPC para porta 9090 e adição dos 2 serviços
        Server server = ServerBuilder.forPort(9090)
                .addService(new MathServiceImplementado())
                .addService(new StringServiceImplementado())
                .build();

        // Inicialização do servidor
        server.start();

        server.awaitTermination();
    }
}
