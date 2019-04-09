package application;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class Main extends Application {
  private static Scene mainScene;
  
  @Override
  public void start(final Stage primaryStage) {
    try {
      URL _resource = this.getClass().getResource("/gui/MainView.fxml");
      FXMLLoader loader = new FXMLLoader(_resource);
      ScrollPane scrollPane = loader.<ScrollPane>load();
      scrollPane.setFitToHeight(true);
      scrollPane.setFitToWidth(true);
      Scene _scene = new Scene(scrollPane);
      Main.mainScene = _scene;
      primaryStage.setScene(Main.mainScene);
      primaryStage.setTitle("Sample JavaFX application");
      primaryStage.show();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {COMPILE ERROR : 'org.eclipse.xtext.xbase.lib.Exceptions' could not be found on the classpath!
      }
    }
  }
  
  public static Scene getMainScene() {
    return Main.mainScene;
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
}
