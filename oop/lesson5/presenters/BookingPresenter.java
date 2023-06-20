package oop.lesson5.presenters;

import java.util.Collection;
import java.util.Date;

import oop.lesson5.models.Table;

public class BookingPresenter implements ViewObserver {

    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel){
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.updateTablesView(loadTables());
    }

    private void showReservationTableResult(int reservationNo){
        bookingView.updateReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        showReservationTableResult(reservationNo);
    }

    public void printChangeReservationTableResult(int reservationId) {
        bookingView.updateReservationTableResult(reservationId);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        onReservationTable(reservationDate, tableNo, name);
    }
}
