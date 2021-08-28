package string_loop;
/*
Extract only transaction ID from the HTML:

<html>
<body>
<div>
<p>Transaction Successful</p>
<p>Trnx ID: TXN5164870</p>
</div>


</body>
</html>

*/
public class extractionFromHtml {
    public static void main(String[] args) {

        String html="<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";

        int pos=html.indexOf("TXN");
        System.out.println(html.substring(pos,72));

    }
}
