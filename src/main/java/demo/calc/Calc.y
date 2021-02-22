/* Infix notation calculator--calc */
%language "Java"
%name-prefix "Calc"
%define parser_class_name {Calc}
%define public


%code {
private int x = 3;

public Integer result() {
    return x;
}
}

%code imports {
  import java.io.StreamTokenizer;
  import java.io.InputStream;
  import java.io.InputStreamReader;
  import java.io.Reader;
  import java.io.IOException;
}

/* Bison Declarations */
%type <Integer> expression term factor
%token '+' '-' '*' '/' '(' ')'
%token <Integer> NUMBER


/* Grammar follows */
%%
top : expression
  { this.x = $1; }
;

expression: expression '+' term
  { $$ = $1 + $3; }
| expression '-' term
  { $$ = $1 + $3; }
| term
  { $$ = $1; }
;

term: term '*' factor
  { $$ = $1 * $3; }
| term '/' factor
  { $$ = $1 / $3; }
| factor
  { $$ = $1; }
;

factor: NUMBER
  { $$ = $1; }
| '(' expression ')'
  { $$ = $2; }
;

%%
