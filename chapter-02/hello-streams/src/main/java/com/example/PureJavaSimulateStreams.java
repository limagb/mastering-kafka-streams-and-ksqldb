package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PureJavaSimulateStreams {

    /* 
    * Criando um Stream (Stream do Java, para simular um stream do Kafka-Streams – KStream) com atribuição de valores e
    * transformando o Stream em um Map (Map do Java, para simular uma table do Kafka-Streams – KTable):
    */
    public static void main(String[] args) {
        
        var stream = List.of(
        Map.entry("a", 1),
        Map.entry("b", 1), 
        Map.entry("a", 2));

    var table = new HashMap<>();

    stream.forEach((record) -> table.put(record.getKey(), record.getValue()));

    System.out.println("Stream  ==>  "+stream);
    System.out.println("Table   ==>  " + table);

   


     /* 
    * Pegando uma table e a transformando em um stream:
    */

    var stream2 = table.entrySet().stream().collect(Collectors.toList());
    stream2.add(Map.entry("a", 3));

    System.out.println("Stream2 ==>  "+stream2);


    }

}