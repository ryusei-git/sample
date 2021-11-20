import java.util.Scanner;
import java.util.regex.Pattern;
public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean boolean_tmp;
    private static String String_tmp;
    public static void main(String[] args) throws Exception {
        System.out.println("好きな文字を入力してください");
        String Word = scanner.next();
        String Success_or_failure = String_parse(Word);
    }
    public static String String_parse(String Word){
        // 正規表現（判定基準）
        String regex_hiragana = "^[\u3040-\u309F]+$";//ひらがなのみ
        Pattern pattern = Pattern.compile(regex_hiragana);
        // 返却配列
        String[] result = new String[2];
        // Wordがnull出なかった場合処理を開始
        if(Word != null){
            System.out.println("処理が開始");
            // 文字数判定
            // 文字数が5文字の場合
            if(Word.length() == 5){
                // 文字列パターン判定
                boolean_tmp = pattern.matcher(Word).matches();
                String_tmp = Boolean.toString(boolean_tmp);
            }else{
                System.out.println("文字数が不正です");
            }
        }else{
            System.out.println("処理を終了");
        }
        return Word;
    }
}

