
import java.util.HashMap;
import spark.ModelAndView;
//import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class AppToDoList {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

    }
}