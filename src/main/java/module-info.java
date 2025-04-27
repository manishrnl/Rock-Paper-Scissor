module org.example.rock_paper_scissor_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.rock_paper_scissor_game to javafx.fxml;
    exports org.example.rock_paper_scissor_game;
}