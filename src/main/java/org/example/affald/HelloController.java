package org.example.affald;

import Model.TrashbinStatus;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HelloController
{
    private List<TrashbinStatus> trashbins;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onLoadCsvClick() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Vælg en CSV-fil");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));

        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            readCsvFile(file);
        }
    }

    private void readCsvFile(File file)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8)))
        {
            String line;
            trashbins = new ArrayList<>();
            while ((line = br.readLine()) != null)
            {
                String[] values = line.split(",");
                TrashbinStatus trashbin = new TrashbinStatus(
                        Integer.parseInt(values[0]),
                        LocalDateTime.now(),
                        Integer.parseInt(values[1]),
                        Boolean.parseBoolean(values[2]),
                        Boolean.parseBoolean(values[3]));
                trashbins.add(trashbin);
            }
        }
        catch (Exception e)
        {
            welcomeText.setText("Fejl ved læsning af CSV");
            e.printStackTrace();
        }
    }
}
