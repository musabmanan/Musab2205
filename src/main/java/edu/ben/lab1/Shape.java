package edu.ben.lab1;

public interface Shape {



        public Double area() ;
        public Double perimeter() ;
        default void volume() {

        }
}

