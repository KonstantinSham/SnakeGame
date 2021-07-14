import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Кнопка для прекращения работы экрана
        setSize(352,363);//Размер окна
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }
    //Экземпляр для создания MainWindow
    public static void main(String[] arg){
        MainWindow mw = new MainWindow();
    }
}
