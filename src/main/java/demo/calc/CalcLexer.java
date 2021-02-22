package demo.calc;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class CalcLexer implements Calc.Lexer {

    StreamTokenizer st;

    public CalcLexer (InputStream is)
    {
        st = new StreamTokenizer (new InputStreamReader(is));
        st.resetSyntax ();
        st.eolIsSignificant (true);
        st.whitespaceChars (9, 9);
        st.whitespaceChars (32, 32);
        st.wordChars (48, 57);
    }


    public void yyerror (String s)
    {
        System.err.println (s);
    }


    Integer yylval;

    public Object getLVal() {
        return yylval;
    }

    public int yylex () throws IOException {
        int ttype = st.nextToken ();

        if (ttype == StreamTokenizer.TT_EOF)
            return Calc.Lexer.EOF;

        else if (ttype == StreamTokenizer.TT_EOL)
        {

            return '\n';
        }

        else if (ttype == StreamTokenizer.TT_WORD)
        {
            yylval = new Integer (st.sval);
            return Calc.Lexer.NUMBER;
        }

        else
            return st.ttype;
    }


}

