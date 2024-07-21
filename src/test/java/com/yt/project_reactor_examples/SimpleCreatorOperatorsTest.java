package com.yt.project_reactor_examples;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.stream.Stream;

public class SimpleCreatorOperatorsTest {

    @Test
    public void fluxJust() {
        //Elementos são emitidos um a um
        Flux simpleFlux = Flux.just(1, 2, 3, 4).delayElements(Duration.ofMillis(1000)).log();

        //Verifica se os elementos foram emitidos com sucesso
        StepVerifier
                //Faz o subscribe
                .create(simpleFlux)
                .expectNext(1, 2, 3, 4)
                //Verifica se o sinal de término foi emitido
                .verifyComplete();
    }

    @Test
    public void fluxFromArray() {
        //Elementos são emitidos um a um a partir de um array
        Flux simpleFlux = Flux.fromArray(new Integer[]{1, 2, 3, 4}).log();

        StepVerifier
                .create(simpleFlux)
                .expectNext(1, 2, 3, 4)
                .verifyComplete();
    }

    @Test
    public void fluxFromStream() {
        //Elementos são emitidos um a um a partir de um stream
        Flux simpleFlux = Flux.fromStream(Stream.of(1, 2, 3, 4)).log();

        StepVerifier
                .create(simpleFlux)
                .expectNext(1, 2, 3, 4)
                .verifyComplete();
    }

    @Test
    public void fluxRange() {
        //Elementos são emitidos um a um dentro de um intervalo
        Flux simpleFlux = Flux.range(1, 4).log();

        StepVerifier
                .create(simpleFlux)
                .expectNext(1, 2, 3, 4)
                .verifyComplete();
    }

    @Test
    public void monoJust() {
        Mono monoJust = Mono.just(1).log();

        StepVerifier
                .create(monoJust)
                .expectNext(1)
                .verifyComplete();
    }
}
