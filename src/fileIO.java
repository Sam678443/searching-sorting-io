import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileIO {

  public fileIO() {

  }

  static public int[] readFile(String fileName) {
    Scanner scanner = null;

    try {
      scanner = new Scanner(new File(fileName));
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }

    List<Integer> list = new ArrayList<Integer>();

    while (scanner.hasNextInt()) {
      list.add(scanner.nextInt());
    }

    int[] asArray = new int[list.size()];
    for (int j = 0; j < asArray.length; j++) {
      asArray[j] = list.get(j).intValue();
    }

    return asArray;
  }

  static void writeFile(String filename, int[] arr) throws IOException {
    BufferedWriter ow = null;
    ow = new BufferedWriter(new FileWriter(filename));
    for (int i = 0; i < arr.length; i++) {

      ow.write(arr[i] + "");
      ow.newLine();
    }
    ow.flush();
    ow.close();
  }
}