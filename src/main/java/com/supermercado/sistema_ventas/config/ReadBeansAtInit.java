package com.supermercado.sistema_ventas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReadBeansAtInit {

    @Autowired
    private ApplicationContext context;

    @EventListener(ApplicationReadyEvent.class)
    public void imprimirBeans() {
        // Obtener los nombres de todos los beans actuales
        String[] todosLosBeans = context.getBeanDefinitionNames();

        // Ordenar e imprimir
        Arrays.sort(todosLosBeans);
        for (String bean : todosLosBeans) {
            System.out.println(bean);
        }

        System.out.println("Total de beans: " + context.getBeanDefinitionCount());
    }

}
