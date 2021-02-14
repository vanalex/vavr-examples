package com.vavr.example;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Tuple2<String, Integer> tuple1 = Tuple.of("1", 1);
        Tuple2<String, Integer> tuple2 = Tuple.of("2", 2);
        Tuple3<String, Integer, Tuple2> result =  tuple1.append(tuple2);
    }
}
