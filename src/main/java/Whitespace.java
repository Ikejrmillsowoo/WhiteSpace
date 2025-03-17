import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Whitespace {

    public static void main(String[] args) throws IOException {
        Whitespace wspc = new Whitespace();

        // for each file "testdata{1,2,3}.txt
        // read in all the text and
        // send it to countBoth
        StringBuilder textStr = new StringBuilder();
        String content = "";
        try{
//            File file = new File("testdata3.txt");
//            Scanner scanner = new Scanner(file);

             content = Files.readString(Path.of("testdata1.txt"));
           // while (scanner.hasNextLine()) {
//                String text = scanner.nextLine();
//                textStr.append(text);
//                if (scanner.hasNextLine()) {
//                    textStr.append(" ");
//                }
            //}

           // System.out.println(file);
        } catch (FileNotFoundException e){
            System.out.println("An error occurred");
            System.out.println("An error occurred");
            e.printStackTrace();
        }



        wspc.countBoth(content); // should print 4, 5
        //wspc.countBoth("a b c d e"); // should print 4, 5

    }

    private void countBoth(String testdata) {

        // count the number of whitepace chars and non-whitspace chars.
        // need to use a FOR loop.
        // print the results simply on a line #whitespaces, #ofnonwhitespacechars for each file.
        ArrayList<String>  newArr = new ArrayList<>();
        newArr.addAll(List.of(testdata.split("")));
        int countWhiteSpaces = 0;
        int countNonWhiteSpaces = 0;
        for (String s : newArr){
            if ((s.equals(" ") || (s.equals("\t") || (s.equals("\n") || (s.equals("\r"))))) ){
                countWhiteSpaces++;

            } else {
                countNonWhiteSpaces++;
            }

        }

        System.out.println(countWhiteSpaces);
        System.out.println(countNonWhiteSpaces);

    }


    // what you CANNOT do is use `Character.isWhitespace()`
    // you have to "write your own" by checking the char against what you think is whitespace
    // you should also USE a FOR loop to step thru each char in the String.
//    private void cannotDoThis(String input) {
//        long wspc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> Character.isWhitespace(c)).count();
//        long nwpsc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> !Character.isWhitespace(new Character(c))).count();
//
//        System.out.printf("%d, %d\n", wspc, nwpsc);
//    }
}
