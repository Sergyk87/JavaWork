package oop.lesson5;

import java.util.Date;

import oop.lesson5.models.TableModel;
import oop.lesson5.presenters.BookingPresenter;
import oop.lesson5.views.BookingView;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен заработать!
     * 
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 105, "Сергей");
    }

}
