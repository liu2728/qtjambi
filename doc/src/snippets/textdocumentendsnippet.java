import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class textdocumentendsnippet
{
    public static void main(String args[])
    {
        String contentString = "One\nTwo\nThree";

        QTextDocument doc = new QTextDocument(contentString);

    //! [0]
        for (QTextBlock it = doc.begin(); it != doc.end(); it = it.next())
            System.out.println(it.text());
    //! [0]
    }
}
