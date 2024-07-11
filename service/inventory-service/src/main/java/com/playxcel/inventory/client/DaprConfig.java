//package com.playxcel.inventory.client;
//
//import io.dapr.client.DaprClient;
//import io.dapr.client.DaprClientBuilder;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//@Scope("singleton")
//public class DaprConfig {
//    public final DaprClient daprClient;
//    public DaprConfig() {
//        this.daprClient = new DaprClientBuilder().build();
//        sideCarInjection(daprClient);
//    }
//
//    private void sideCarInjection(DaprClient daprClient){
//        daprClient.waitForSidecar(10000).block();
//    }
//
//
//
//}
