/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package grpc.server;

import grpc.server.services.PrismGrpcLogger;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class PrismServer {
    private static final PrismGrpcLogger logger = PrismGrpcLogger.getLogger();

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50051;

        // starting server
        server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
                .addService(new PrismServerService())
                .build()
                .start();
        logger.info("Server started, listening on " + port);

        // graceful shutdown
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                logger.info("gracefully shutting down gRPC server since JVM is shutting down");
                try {
                    PrismServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                logger.info("server shut down");
            }
        });
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) {
        final PrismServer server = new PrismServer();
        try {
            server.start();
            server.blockUntilShutdown();
        } catch (IOException e) {
            logger.warning("Caught an IOException: " + e.getMessage());
        } catch (InterruptedException e) {
            logger.warning("Caught an InterruptedException: " + e.getMessage());
        }
    }


}
