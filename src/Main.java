import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

public class Main {
    public static void main(String[] args) {
        Book one = new Book();
        System.out.println("Book one");
        one.setCode("Python");
        one.setDescription("easy language");
        one.setPrice(39.99);
        System.out.println(one.toString());

        Book two = new Book();
        Scanner x = new Scanner(System.in);
        System.out.println("Book two");
        System.out.println("Who is the author? ");
        String author = "";
        author = x.nextLine();
        two.setCode("Java");
        two.setDescription("hard language");
        two.setPrice(25.99);
        System.out.println("The author is:  " + author + "\n" + two.toString());

        Book three = new Book();
        System.out.println("Book three");
        three.setAuthor("James Bond");
        three.setPages(257);
        three.setPrice(39.99);
        three.setDescription("Nice summary of stuff");
        three.setCode("Code doesn't matter");
        System.out.println("The author is:  " + three.getAuthor() + "\n" + "This is the number of pages:   " + three.getPages() + "\n"+ three.toString());

        Software ones = new Software();
        System.out.println("Software one");
        ones.setOs("Mac");
        ones.setPlatform("Safari");
        ones.setProgrammer("Leslie");
        ones.setCode("Code");
        ones.setDescription("Next level stuff");
        ones.setPrice(100.59);
        System.out.println("OS:         "+ ones.getOs() + "\n" + "Platform:           " + ones.getPlatform() + "\n" +
                "Programmer:         " + ones.getProgrammer() + "\n" + ones.toString());






    }

}
