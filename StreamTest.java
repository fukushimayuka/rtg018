import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class StreamTest {
    public static void main(String[] args) {

        //同じディレクトリ内にテキストファイルを作成する
        try(BufferedWriter writer = Files.newBufferedWriter(
            Paths.get(".","no-modules","rtg018","test.txt"), StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
                writer.write("Hello I'm Yuka Fukushima.");
                writer.newLine();
                writer.write("I'm an engineer.");
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}