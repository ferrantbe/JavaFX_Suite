module be.ephec.javafx_cours2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.ephec.javafx_cours2 to javafx.fxml;
    exports be.ephec.javafx_cours2;
    exports _00clickMe;
    opens _00clickMe to javafx.fxml;
    exports _02event;
    opens _02event to javafx.fxml;
    exports _01clickCounter;
    opens _01clickCounter to javafx.fxml;
    exports _03keyEvent;
    opens _03keyEvent to javafx.fxml;
    exports _04mouseEvent;
    opens _04mouseEvent to javafx.fxml;
    exports _05eventPropagation;
    opens _05eventPropagation to javafx.fxml;
    exports _06sceneSwitcher;
    opens _06sceneSwitcher to javafx.fxml;
    exports _07exitApp;
    opens _07exitApp to javafx.fxml;
    exports _08layouts;
    opens _08layouts to javafx.fxml;
    exports _09simpleControls;
    opens _09simpleControls to javafx.fxml;
    exports _10advancedControls;
    opens _10advancedControls to javafx.fxml;
    exports exerciceEventFilter;
    opens exerciceEventFilter to javafx.fxml;
}