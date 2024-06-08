package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;


public class Main {

  public static void main(String[] args) {
    try {
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "Javaコース楽しい！" + " "
          + "江波さん最高！" + "Javaコース勉強頑張る", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
      //e.printStackTrace(); //例外の処理をコンソール上に表示させる
    } catch (IOException e) {
      System.out.println("例外が発生しました、該当ファイルがあるか確認してください。");
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "Javaコース楽しい！" + " "
          + "江波さん最高！" + "Javaコース勉強頑張る", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    }
    //
    //課題　入出力を実際に実装して、作ったファイルに文章を追加する。
    //その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして、例外処理を行う

    // catchした中で更にファイルに書き込もうとして例外になった場合、どうなるのかを確認してください。

  }
}
