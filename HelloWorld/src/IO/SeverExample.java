package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application { // JavaFX 메인 클래스를 만들기 위해 Application 상속
		    ExecutorService executorService; // 스레드풀
		    ServerSocket serverSocket; // ServerSocket
		    List<Client> connections = new Vector<Client>(); // 연결된 클라이언트들을 저장
		    void startServer() {

}
