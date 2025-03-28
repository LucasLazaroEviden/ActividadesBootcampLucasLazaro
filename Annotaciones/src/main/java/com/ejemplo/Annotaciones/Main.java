package com.ejemplo.Annotaciones;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Cliente cliente = context.getBean(Cliente.class);
        cliente.mostrarSaludo();

        context.close();
    }
}
