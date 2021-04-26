package edu.sijo.study.java13;

public class Java13StringFeatures {
    public static void main(String[] args) {
        String htmlBeforeJava13 = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println(htmlBeforeJava13);

        String htmlWithJava13 = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
        System.out.println(htmlWithJava13);
    }
}
