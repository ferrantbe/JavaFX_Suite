package _10propertiesAndListeners;

import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;

public class Main {

    public static void main(String[] args) {

        Facture electricBill = new Facture();

        electricBill.sommeDueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue o, Object oldVal,
                                Object newVal) {
                System.out.println("La facture a changé!");
            }
        });
        electricBill.sommeDueProperty().addListener((o, oldV, newV) -> System.out.println("New: " + newV));

        electricBill.setSommeDue(100.00);
        electricBill.setSommeDue(120.00);

    }
}