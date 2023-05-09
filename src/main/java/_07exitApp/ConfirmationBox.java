package _07exitApp;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmationBox {
    static Stage modalStage;
    static boolean btnYesClicked;

    public static boolean show(String message, String titre, String textOK, String textNon) {
        btnYesClicked = false;
        modalStage = new Stage();
        modalStage.initModality(Modality.APPLICATION_MODAL);
        modalStage.setTitle(titre);
        modalStage.setMinWidth(250);

        Label lbl = new Label();
        lbl.setText(message);
        Button btnOK = new Button();
        btnOK.setText(textOK);
        btnOK.setOnAction(e -> btnOKClick());
        Button btnNon = new Button();
        btnNon.setText(textNon);
        btnNon.setOnAction(e -> btnNonClick());
        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(btnOK, btnNon);
        VBox vbox = new VBox(20);
        vbox.getChildren().addAll(lbl, hbox);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox);
        modalStage.setScene(scene);
        modalStage.showAndWait();
        return btnYesClicked;
    }

    private static void btnOKClick() {
        modalStage.close();
        btnYesClicked = true;
    }

    private static void btnNonClick() {
        modalStage.close();
        btnYesClicked = false;
    }
}