import model.HelpModel;
import view.HelpView;

public class Main {
    public static void main(String[] args) {
        String content = "<html>Trò chơi này bao gồm nhiều quân bài được chia theo từng cặp giống nhau.  Mục tiêu : Bạn hãy tìm hết số quân bài giống nhau trong thời gian quy định thì sẽ chiến thắng</html>";
        String title = "Game help";

        HelpModel helpModel = new HelpModel(title, content);
        HelpView frame = new HelpView(helpModel);
        frame.init();
        frame.setVisible(true);
        frame.setResizable(false);

    }
}
