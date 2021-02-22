package demo;

import demo.calc.Calc;
import demo.calc.CalcLexer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Application {
    public static void main(String[] args) throws IOException {

        CalcLexer l = new CalcLexer(new ByteArrayInputStream("3+5".getBytes(StandardCharsets.UTF_8)));
        Calc p = new Calc(l);
        p.parse();
        System.out.println(p.result());
    }
}
