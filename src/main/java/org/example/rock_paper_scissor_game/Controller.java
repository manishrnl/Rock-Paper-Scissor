package org.example.rock_paper_scissor_game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    String result, value;
    public static int userScore = 10, gamesPlayed = 0;
    @FXML
    private Text score, computerChoiceText, userChoiceText, userText, resultText, computerText;

    @FXML
    private Button paperButton, scissorButton, rockButton;
    private boolean status = false;
    Random random = new Random();

    public void buttonClicked(MouseEvent event) {
        Button clickedButton = (Button) event.getSource();
        value = clickedButton.getText();
        //1=Rock  2=Paper  3=Scissor
        int randomno = random.nextInt(3) + 1;
        if (value.equals("Rock")) {
            if (randomno == 1) {
                result = "Tie";
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
            if (randomno == 2) {
                result = "Computer";
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
            if (randomno == 3) {
                result = "User";
                userScore += 10;
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
        }
        if (value.equals("Paper")) {
            if (randomno == 1) {
                result = "User";
                userScore += 10;
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
            if (randomno == 2) {
                result = "Tie";
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
            if (randomno == 3) {
                result = "Computer";
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
        }
        if (value.equals("Scissor")) {
            if (randomno == 1) {
                result = "Computer";
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
            if (randomno == 2) {
                result = "User";
                userScore += 10;
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
            if (randomno == 3) {
                result = "Tie";
                gamesPlayed += 10;
                showResult(result, userScore, true, value, "Rock", gamesPlayed);
            }
        }
    }

    private void showResult(String result, int userScore, boolean status, String userChoosed
            , String computerChoosed, int gamesPlayed) {
        score.setText("Score : " + userScore + " / " + gamesPlayed);
        setTextFunction(status);
        computerChoiceText.setText(computerChoosed);
        userChoiceText.setText(userChoosed);
        if (result.equals("Computer")) {
            resultText.setText("Sorry this time Computer Won");
            resultText.setFill(Color.RED);
        } else if (result.equals("User")) {
            resultText.setText("Congratulations! You had beaten Computer");
            resultText.setFill(Color.GREEN);
        } else if (result.equals("Tie")) {
            resultText.setText("Both were awesome");
            resultText.setFill(Color.ORANGE);
        }

    }

    private void setTextFunction(boolean status) {
        computerChoiceText.setVisible(status);
        userChoiceText.setVisible(status);
        userChoiceText.setVisible(status);
        userText.setVisible(status);
        resultText.setVisible(status);
        computerText.setVisible(status);
        score.setVisible(status);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTextFunction(false);
    }
}
