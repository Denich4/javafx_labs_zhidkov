package com.example.lab3javafx.controllers;

import com.example.lab3javafx.MainApp;
import com.example.lab3javafx.model.Order;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class OrderOverviewController {
    @FXML
    private TableView<Order> orderTable;
    @FXML
    private TableColumn<Order, String> numberColumn;
    @FXML
    private TableColumn<Order, String> tikerColumn;

    @FXML
    private Label orderTypeLabel;
    @FXML
    private Label orderVerietyLabel;
    @FXML
    private Label currencyShortLabel;
    @FXML
    private Label currencyFullLabel;
    @FXML
    private Label tikerLabel;
    @FXML
    private Label countLabel;
    @FXML
    private Label numberLabel;
    @FXML
    private Label dataLabel;
    @FXML
    private Label durationLabel;

    // Ссылка на главное приложение.
    private MainApp mainApp;

    public OrderOverviewController() {
    }

    @FXML
    private void initialize() {
        // Инициализация таблицы адресатов с двумя столбцами.
        numberColumn.setCellValueFactory(cellData -> cellData.getValue().numberProperty());
        tikerColumn.setCellValueFactory(cellData -> cellData.getValue().tikerProperty());
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Добавление в таблицу данных из наблюдаемого списка
        orderTable.setItems(mainApp.getOrderData());
    }
}
