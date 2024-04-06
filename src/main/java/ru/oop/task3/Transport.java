package ru.oop.task3;

public interface Transport extends Positioned{
    /**
     * Перемещает человека к заданной позиции
     */
    void moveTo(Person person, Position destination);
}
