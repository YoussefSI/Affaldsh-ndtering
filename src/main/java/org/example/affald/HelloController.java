package org.example.affald;

import Model.Trashbin;
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
    private List<Trashbin> trashbins;
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
                Trashbin trashbin = new Trashbin(
                        Integer.parseInt(values[0]),
                        LocalDateTime.parse(values[1]),
                        values[2],
                        Integer.parseInt(values[3]),
                        Boolean.parseBoolean(values[4]),
                        Integer.parseInt(values[5]),
                        Boolean.parseBoolean(values[6]),
                        Boolean.parseBoolean(values[7]),
                        Boolean.parseBoolean(values[8]),
                        Boolean.parseBoolean(values[9]),
                        Boolean.parseBoolean(values[10]),
                        Boolean.parseBoolean(values[11]));
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
