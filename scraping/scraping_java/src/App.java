import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class App {
	public static void main(String[] args) {
        // youtubeで検索をする単語を取得
        String searchword = "iphone";
        try{
            URL url = new URL("https://www.youtube.com/results?search_query="+searchword);
            // 検索ワードで検索
            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            int i = isr.read();
            while(i != -1) {
                File file = new File("c:\\tmp\\test.txt");
                FileWriter filewriter = new FileWriter(file);
                filewriter.write("こんにちは");
            i = isr.read();
            }
            isr.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        // 検索結果をhtml形式で取得
	}
}