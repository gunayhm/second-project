import java.io.IOException;

public class Status {

    public static void main(String[] args) {

        try {
            Main.printException();
        }catch (IOException e){
            System.out.println("IOException Status class");
        }
    }
}
