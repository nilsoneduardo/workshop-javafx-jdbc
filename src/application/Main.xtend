package application

import java.io.IOException
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.ScrollPane
import javafx.stage.Stage

class Main extends Application {
	static Scene mainScene

	override void start(Stage primaryStage) {
		try {
			var FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"))
			var ScrollPane scrollPane = loader.load()
			scrollPane.setFitToHeight(true)
			scrollPane.setFitToWidth(true)
			mainScene = new Scene(scrollPane)
			primaryStage.setScene(mainScene)
			primaryStage.setTitle("Sample JavaFX application")
			primaryStage.show()
		} catch (IOException e) {
			e.printStackTrace()
		}

	}

	def static Scene getMainScene() {
		return mainScene
	}

	def static void main(String[] args) {
		launch(args)
	}
}
