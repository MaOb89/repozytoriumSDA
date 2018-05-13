package addressbook;

import addressbook.model.Person;
import addressbook.viewcontroller.PersonOverviewController;
import addressbook.viewcontroller.RootLayoutController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primarstage;
    private BorderPane root;
    private ObservableList<Person> personData = FXCollections.observableArrayList();

    public Main(){
        personData.add(new Person("Jan", "Testowy"));
        personData.add(new Person("Katarzyna", "Kowalska"));
        personData.add(new Person("Zygmunt", "Nowak"));
        personData.add(new Person("Jakub", "Zieliński"));
    }

    @Override
//    wczytwanie roota, tworzenie nowej sceny i pokazanie go
    public void start(Stage primaryStage) throws Exception {
        this.primarstage = primaryStage;
        this.primarstage.setTitle("Książka adresowa");
        initRootLayout();
        showPersonOverview();
    }

    public void initRootLayout() {
        try {
            root = FXMLLoader.load(getClass().getResource("viewcontroller/RootLayout.fxml"));
            Scene scene = new Scene(root);
            primarstage.setScene(scene);
            primarstage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showPersonOverview() {
        try {
            FXMLLoader = new FXMLLoader();
            loader.setlocation(Main.class.getResource("viewcontroller/ PersonOverview,fxml"));
            AnchorPane perdsonOverwiev =(AnchorPane) loader.load();
            PersonOverviewController controller = load.getControlle();
//            controller.setMainApp(this);
//            root.setCenter(showPersonOverview());
//
////            AnchorPane personOverview = FXMLLoader.load(getClass().getResource
////                    ("viewcontroller/PersonOverview.fxml"));
//    root.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<Person> getPersonData(){
        return personData;
    }

}
