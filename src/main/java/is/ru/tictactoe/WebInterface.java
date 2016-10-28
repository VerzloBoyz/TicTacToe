package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class WebInterface implements SparkApplication {

    public static void main(String[] args) {

        staticFileLocation("/public");

        SparkApplication app = new WebInterface();

        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }
        app.init();
    }

    @Override
    public void init() {
        final TicTacToe ttt = new TicTacToe();
        post("/getPlayer", (req, res) -> ttt.getPlayer());
        post("/insertAt", (req, res) -> ttt.insertAt(Integer.parseInt(req.queryParams("id"))));
        post("/checkWinner", (req, res) -> ttt.checkWinner());
        post("/reset", (req, res) -> ttt.reset());
    }
}
