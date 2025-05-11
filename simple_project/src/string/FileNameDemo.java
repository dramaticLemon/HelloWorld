package string;

public class FileNameDemo {
    public static void main (String[] args) {
        final String PATH = "/home/user/index.html";
        FileName myHomePage = new FileName(PATH, '/', '.');
        System.out.println(myHomePage.extension());
        System.out.println(myHomePage.filename());
        System.out.println(myHomePage.path());
    }
}
