package Gun46._03_JavaCheckedveUncheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _04_JavaCheckedveUncheckedException {
    public static void main(String[] args) {
        String str = "";

        char ilkHarf = str.charAt(0);
//        Mecbur degilim, bana kalmis - Unchecked Exception

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try - catch mecbur - Checked Exception

        try {
            FileInputStream file = new FileInputStream("liste.txt"); //Dosya acma komutu
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        try - catch mecbur - Checked Exception

    }
}
