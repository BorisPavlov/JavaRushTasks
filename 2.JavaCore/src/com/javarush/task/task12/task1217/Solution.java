package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
    public interface CanFly {
        public void Fly(double h);
    }

    public interface CanRun {
        public void Run(double m);
    }

    public interface CanSwim {
        public void Swim(double m);
    }
}
