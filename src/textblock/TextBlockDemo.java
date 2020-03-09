package textblock;

public class TextBlockDemo {
    public static void main(String[] args) {
        String multilineString = """
                <html>
                    <body>
                        <h1>Hello This is my website...</h1>
                    </body>
                </html>
                """;
        System.out.println(multilineString);
    }
}
