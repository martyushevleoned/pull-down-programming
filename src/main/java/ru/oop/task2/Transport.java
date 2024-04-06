package ru.oop.task2;

public interface Transport extends Positioned{

    /**
     * Перемещает человека к заданной позиции
     */
    void moveTo(Person person, Position destination);
}
