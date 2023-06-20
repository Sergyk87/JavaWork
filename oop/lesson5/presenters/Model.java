package oop.lesson5.presenters;

import java.util.Collection;
import java.util.Date;

import oop.lesson5.models.Table;

public interface Model {

    /**
     * Получение списка всех столиков
     * @return
     */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation);


}
