package service;

import generated.ServicoStringGrpc;
import generated.string_request;
import generated.string_response;
import io.grpc.stub.StreamObserver;

public class StringServiceImplementado extends ServicoStringGrpc.ServicoStringImplBase {
    @Override
    public void paraMaiusculo(string_request request, StreamObserver<string_response> responseObserver) {
        // Implemente o código para a lógica da operação de conversão para maiúsculo
        String input = request.getInput();
        String output = input.toUpperCase();
        string_response response = string_response.newBuilder().setOutput(output).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
