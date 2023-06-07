package service;

import io.grpc.stub.StreamObserver;
import generated.*;

public class MathServiceImplementado extends MathServiceGrpc.MathServiceImplBase {
    @Override
    public void somaLongs(long_request request, StreamObserver<long_responseSoma> responseObserver) {
        // Implemente o código para a lógica da operação de soma de longs
        long sum = 0;
        for (long input : request.getInputList()) {
            sum += input;
        }
        long_responseSoma response = long_responseSoma.newBuilder().setOutput(sum).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void raizQuadrada(long_request request, StreamObserver<long_responseMaior> responseObserver) {
        // Implemente o código para a lógica da operação de raiz quadrada de longs
        long input = request.getInput(0);
        long output = (long) Math.sqrt(input); // Math.sqrt retorna um double. Precisa de casting!
        long_responseMaior response = long_responseMaior.newBuilder().setOutput(output).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

