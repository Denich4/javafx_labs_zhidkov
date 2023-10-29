package com.example.lab3javafx;


import java.io.IOException;

import com.example.lab3javafx.controllers.OrderOverviewController;
import com.example.lab3javafx.model.Order;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    private ObservableList<Order> orderData = FXCollections.observableArrayList();

    public MainApp() {
        orderData.add(new Order("842353", "GAZP"));
        orderData.add(new Order("346542", "SBER"));
        orderData.add(new Order("765760", "VTB"));
        orderData.add(new Order("237057", "ROSN"));
        orderData.add(new Order("128768", "SBER"));
        orderData.add(new Order("234878", "AFKS"));
        orderData.add(new Order("236098", "ROSN"));
        orderData.add(new Order("079462", "ROSN"));
        orderData.add(new Order("087684", "AFKS"));
        orderData.add(new Order("765763", "NLMK"));
        orderData.add(new Order("236563", "ROSN"));
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("OrdersApp");

        initRootLayout();

        showOrderOverview();
    }
    public ObservableList<Order> getOrderData() {
        return orderData;
    }

    public void initRootLayout() {
        try {
            // Загружаем корневой макет из fxml файла.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Отображаем сцену, содержащую корневой макет.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showOrderOverview() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/OrdersOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Помещаем сведения об адресатах в центр корневого макета.
            rootLayout.setCenter(personOverview);

            // Даём контроллеру доступ к главному приложению.
            OrderOverviewController controller = loader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
