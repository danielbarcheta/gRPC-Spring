import generated.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class GrpcClient {

    ManagedChannel channel;
    private final MathServiceGrpc.MathServiceBlockingStub mathStub;


    public GrpcClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        mathStub = MathServiceGrpc.newBlockingStub(channel);
    }

    public void callSomaLongs() {
        long_request request = long_request.newBuilder()
                .addInput(1)
                .addInput(2)
                .addInput(3)
                .addInput(4)
                .addInput(5)
                .addInput(6)
                .addInput(7)
                .addInput(8)
                .build();

        try {
            long startTime = System.currentTimeMillis();
            long_responseSoma response = mathStub.somaLongs(request);
            long endTime = System.currentTimeMillis();

            long sum = response.getOutput();

            System.out.println("Soma dos longs: " + sum);
            System.out.println("Tempo de execução: " + (endTime - startTime) + "ms");
        } catch (StatusRuntimeException e) {
            System.err.println("Erro ao chamar o RPC somaLongs: " + e.getStatus());
        }
    }

    public void callRaizQuadrada() {
        long_request request = long_request.newBuilder()
                .addInput(81).build();

        try {
            long startTime = System.currentTimeMillis();
            long_responseMaior response = mathStub.raizQuadrada(request);
            long endTime = System.currentTimeMillis();

            long result = response.getOutput();

            System.out.println("Raiz quadrada do maior número: " + result);
            System.out.println("Tempo de execução: " + (endTime - startTime) + "ms");
        } catch (StatusRuntimeException e) {
            System.err.println("Erro ao chamar o RPC raizQuadrada: " + e.getStatus());
        }
    }

/*
    public void callparaMaiusculo() {
        string_request stringRequest = string_request.newBuilder()
                .setInput("hello")
                .build();
        try {
            long startTime = System.currentTimeMillis();
            long_responseSoma response = mathStub.somaLongs(stringRequest);
            long endTime = System.currentTimeMillis();

            long sum = response.getOutput();

            System.out.println("Soma dos longs: " + sum);
            System.out.println("Tempo de execução: " + (endTime - startTime) + "ms");
        } catch (StatusRuntimeException e) {
            System.err.println("Erro ao chamar o RPC somaLongs: " + e.getStatus());
        }
    }
*/



    public static void main(String[] args) {
        GrpcClient client = new GrpcClient("localhost", 9090);

        // Chamada do RPC somaLongs
        client.callSomaLongs();

        // Chamada do RPC raizQuadrada
        client.callRaizQuadrada();


    }
}
