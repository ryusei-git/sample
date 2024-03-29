import java.util.Scanner;
import java.util.regex.Pattern;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean boolean_tmp;
    private static String String_tmp;
    public static void main(String[] args) throws Exception {
        System.out.println("好きな文字を入力してください");
        // String Word = scanner.next();
        String Word = "あいうえお";
        System.out.println(Word);
        String[] parse_data = String_parse(Word);
        // *******aaa******
        if(parse_data[0]=="true"){
            System.out.println("**********処理完了**********");
        }
        encryptString();
    }
    public static String[] String_parse(String Word){
        // 正規表現（判定基準）
        String regex_hiragana = "^[\u3040-\u309F]+$";//ひらがなのみ
        // String regex_AlphaNum = "^[A-Za-z0-9]+$" ;// 半角英数字のみ
        Pattern pattern = Pattern.compile(regex_hiragana);
        // 返却配列
        String[] result = new String[2];
        // Wordがnull出なかった場合処理を開始
        if(Word != null){
            System.out.println("**********parse開始**********");
            // 文字数判定
            // 文字数が5文字の場合
            if(Word.length() == 5){
                // 文字列パターン判定
                System.out.println(Word);
                boolean_tmp = pattern.matcher(Word).matches();
                String_tmp = Boolean.toString(boolean_tmp);
                // 返却する配列に一時文字列と取得文字列を格納
                result[0] = String_tmp;
                result[1] = Word;
                System.out.println("**********parse完了**********");
            }else{
                System.out.println("**********文字数が不正です**********");
            }
        }else{
            System.out.println("**********errorcode:001**********");
        }
        return result;
    }
    public static String encryptString(){
        // SHA-512（SHA-2）
        MessageDigest sha512;
        // 暗号化される文字
        String enc_String = "これはテストです";
        try {
            sha512 = MessageDigest.getInstance("SHA-512");
            byte[] sha512_result = sha512.digest(enc_String.getBytes());
        System.out.println("SHA-512：" + String.format("%040x", new BigInteger(1, sha512_result)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static int Calc(){
        int Num = 0;
        // 数値を四則演算する
        System.out.println(Num = 1+2);
        System.out.println(Num = 1-2);
        System.out.println(Num = 1*2);
        System.out.println(Num = 1/2);
        return 1;
    }
}

