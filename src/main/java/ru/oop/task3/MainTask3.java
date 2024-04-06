package ru.oop.task3;

import java.util.Arrays;
import java.util.List;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code Arrays.asList(new Car(person), new Bus("43", person),
 *        new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3 {

    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     */
    public static void moveTo(Person person, Position destination) {

        List<Transport> transports = Arrays.asList(new Car(person), new Bus("43", person), new Bus("50", person));
        Transport currentTransport = transports.get(0);
        person.walk(currentTransport.getPosition());

        for (int i = 1; i < transports.size(); i++) {
            currentTransport.moveTo(person, transports.get(i).getPosition());
            person.walk(transports.get(i).getPosition());
            currentTransport = transports.get(i);
        }

        currentTransport.moveTo(person, destination);
        person.walk(destination);
        assert person.getPosition() == destination;
    }
}
