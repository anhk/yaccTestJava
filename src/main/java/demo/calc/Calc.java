package demo.calc;

/* A Bison parser, made by GNU Bison 3.0.4.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* "Calc.java":36  */ /* lalr1.java:91  */

/* "Calc.java":38  */ /* lalr1.java:92  */
/* "%code imports" blocks.  */
/* "Calc.y":16  */ /* lalr1.java:93  */

import java.io.StreamTokenizer;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;

/* "Calc.java":48  */ /* lalr1.java:93  */

/**
 * A Bison parser, automatically generated from <tt>Calc.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class Calc
{
  /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.0.4";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";







  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>Calc</tt>.
   */
  public interface Lexer {
    /** Token returned by the scanner to signal the end of its input.  */
    public static final int EOF = 0;

    /* Tokens.  */
    /** Token number,to be returned by the scanner.  */
    static final int NUMBER = 258;




    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     *
     * @param msg The string for the error message.
     */
    void yyerror (String msg);
  }

  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;





  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public Calc (Lexer yylexer)
  {

    this.yylexer = yylexer;

  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror (String msg)
  {
    yylexer.yyerror (msg);
  }


  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];

    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value                            ) {
      height++;
      if (size == height)
      {
        int[] newStateStack = new int[size * 2];
        System.arraycopy (stateStack, 0, newStateStack, 0, height);
        stateStack = newStateStack;


        Object[] newValueStack = new Object[size * 2];
        System.arraycopy (valueStack, 0, newValueStack, 0, height);
        valueStack = newValueStack;

        size *= 2;
      }

      stateStack[height] = state;

      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);

      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
      {
        out.print (' ');
        out.print (stateStack[i]);
      }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yy_lr_goto_state_ (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - yyntokens_] + yystate;
    if (0 <= yyr && yyr <= yylast_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - yyntokens_];
  }

  private int yyaction (int yyn, YYStack yystack, int yylen)
  {
    Object yyval;


    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
    {
      case 2:
        if (yyn == 2)
          /* "Calc.y":33  */ /* lalr1.java:489  */
        { this.x = ((Integer)(yystack.valueAt (1-(1)))); };
        break;


      case 3:
        if (yyn == 3)
          /* "Calc.y":37  */ /* lalr1.java:489  */
        { yyval = ((Integer)(yystack.valueAt (3-(1)))) + ((Integer)(yystack.valueAt (3-(3)))); };
        break;


      case 4:
        if (yyn == 4)
          /* "Calc.y":39  */ /* lalr1.java:489  */
        { yyval = ((Integer)(yystack.valueAt (3-(1)))) + ((Integer)(yystack.valueAt (3-(3)))); };
        break;


      case 5:
        if (yyn == 5)
          /* "Calc.y":41  */ /* lalr1.java:489  */
        { yyval = ((Integer)(yystack.valueAt (1-(1)))); };
        break;


      case 6:
        if (yyn == 6)
          /* "Calc.y":45  */ /* lalr1.java:489  */
        { yyval = ((Integer)(yystack.valueAt (3-(1)))) * ((Integer)(yystack.valueAt (3-(3)))); };
        break;


      case 7:
        if (yyn == 7)
          /* "Calc.y":47  */ /* lalr1.java:489  */
        { yyval = ((Integer)(yystack.valueAt (3-(1)))) / ((Integer)(yystack.valueAt (3-(3)))); };
        break;


      case 8:
        if (yyn == 8)
          /* "Calc.y":49  */ /* lalr1.java:489  */
        { yyval = ((Integer)(yystack.valueAt (1-(1)))); };
        break;


      case 9:
        if (yyn == 9)
          /* "Calc.y":53  */ /* lalr1.java:489  */
        { yyval = ((Integer)(yystack.valueAt (1-(1)))); };
        break;


      case 10:
        if (yyn == 10)
          /* "Calc.y":55  */ /* lalr1.java:489  */
        { yyval = ((Integer)(yystack.valueAt (3-(2)))); };
        break;



      /* "Calc.java":379  */ /* lalr1.java:489  */
      default: break;
    }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    int yystate = yy_lr_goto_state_ (yystack.stateAt (0), yyr1_[yyn]);
    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }



  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
                                Object yyvaluep                                 )
  {
    if (yydebug > 0)
      yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
              + yytname_[yytype] + " ("
              + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }


  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException

  {



    /* Lookahead and lookahead in internal form.  */
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;

    /* Error handling.  */
    int yynerrs_ = 0;


    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval );



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
        case YYNEWSTATE:
          yycdebug ("Entering state " + yystate + "\n");
          if (yydebug > 0)
            yystack.print (yyDebugStream);

          /* Accept?  */
          if (yystate == yyfinal_)
            return true;

          /* Take a decision.  First try without lookahead.  */
          yyn = yypact_[yystate];
          if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
            break;
          }

          /* Read a lookahead token.  */
          if (yychar == yyempty_)
          {


            yycdebug ("Reading a token: ");
            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal ();

          }

          /* Convert token to internal form.  */
          if (yychar <= Lexer.EOF)
          {
            yychar = yytoken = Lexer.EOF;
            yycdebug ("Now at end of input.\n");
          }
          else
          {
            yytoken = yytranslate_ (yychar);
            yy_symbol_print ("Next token is", yytoken,
                    yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
          yyn += yytoken;
          if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
            label = YYDEFAULT;

            /* <= 0 means reduce or error.  */
          else if ((yyn = yytable_[yyn]) <= 0)
          {
            if (yy_table_value_is_error_ (yyn))
              label = YYERRLAB;
            else
            {
              yyn = -yyn;
              label = YYREDUCE;
            }
          }

          else
          {
            /* Shift the lookahead token.  */
            yy_symbol_print ("Shifting", yytoken,
                    yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
          break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
        case YYDEFAULT:
          yyn = yydefact_[yystate];
          if (yyn == 0)
            label = YYERRLAB;
          else
            label = YYREDUCE;
          break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
        case YYREDUCE:
          yylen = yyr2_[yyn];
          label = yyaction (yyn, yystack, yylen);
          yystate = yystack.stateAt (0);
          break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
        case YYERRLAB:
          /* If not already recovering from an error, report this error.  */
          if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }


          if (yyerrstatus_ == 3)
          {
        /* If just tried and failed to reuse lookahead token after an
         error, discard it.  */

            if (yychar <= Lexer.EOF)
            {
              /* Return failure if at end of input.  */
              if (yychar == Lexer.EOF)
                return false;
            }
            else
              yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
          label = YYERRLAB1;
          break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
        case YYERROR:


        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
          yystack.pop (yylen);
          yylen = 0;
          yystate = yystack.stateAt (0);
          label = YYERRLAB1;
          break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
        case YYERRLAB1:
          yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

          for (;;)
          {
            yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
            {
              yyn += yyterror_;
              if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
              {
                yyn = yytable_[yyn];
                if (0 < yyn)
                  break;
              }
            }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;


            yystack.pop ();
            yystate = yystack.stateAt (0);
            if (yydebug > 0)
              yystack.print (yyDebugStream);
          }

          if (label == YYABORT)
            /* Leave the switch.  */
            break;



          /* Shift the error token.  */
          yy_symbol_print ("Shifting", yystos_[yyn],
                  yylval);

          yystate = yyn;
          yystack.push (yyn, yylval);
          label = YYNEWSTATE;
          break;

        /* Accept.  */
        case YYACCEPT:
          return true;

        /* Abort.  */
        case YYABORT:
          return false;
      }
  }




  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final byte yypact_ninf_ = -6;
  private static final byte yytable_ninf_ = -1;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final byte yypact_[] = yypact_init();
  private static final byte[] yypact_init()
  {
    return new byte[]
            {
                    -5,    -5,    -6,     8,     3,     4,    -6,    -3,    -6,    -5,
                    -5,    -5,    -5,    -6,     4,     4,    -6,    -6
            };
  }

  /* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
     Performed when YYTABLE does not specify something else to do.  Zero
     means the default is an error.  */
  private static final byte yydefact_[] = yydefact_init();
  private static final byte[] yydefact_init()
  {
    return new byte[]
            {
                    0,     0,     9,     0,     2,     5,     8,     0,     1,     0,
                    0,     0,     0,    10,     3,     4,     6,     7
            };
  }

  /* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] = yypgoto_init();
  private static final byte[] yypgoto_init()
  {
    return new byte[]
            {
                    -6,    -6,    12,     2,     5
            };
  }

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final byte yydefgoto_[] = yydefgoto_init();
  private static final byte[] yydefgoto_init()
  {
    return new byte[]
            {
                    -1,     3,     4,     5,     6
            };
  }

  /* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule whose
     number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final byte yytable_[] = yytable_init();
  private static final byte[] yytable_init()
  {
    return new byte[]
            {
                    9,    10,     1,     0,     2,    13,     9,    10,     8,    11,
                    12,    14,    15,     7,     0,     0,    16,    17
            };
  }

  private static final byte yycheck_[] = yycheck_init();
  private static final byte[] yycheck_init()
  {
    return new byte[]
            {
                    3,     4,     7,    -1,     9,     8,     3,     4,     0,     5,
                    6,     9,    10,     1,    -1,    -1,    11,    12
            };
  }

  /* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte yystos_[] = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
            {
                    0,     7,     9,    11,    12,    13,    14,    12,     0,     3,
                    4,     5,     6,     8,    13,    13,    14,    14
            };
  }

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte yyr1_[] = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
            {
                    0,    10,    11,    12,    12,    12,    13,    13,    13,    14,
                    14
            };
  }

  /* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
            {
                    0,     2,     1,     3,     3,     1,     3,     3,     1,     1,
                    3
            };
  }

  /* YYTOKEN_NUMBER[YYLEX-NUM] -- Internal symbol number corresponding
      to YYLEX-NUM.  */
  private static final short yytoken_number_[] = yytoken_number_init();
  private static final short[] yytoken_number_init()
  {
    return new short[]
            {
                    0,   256,   257,    43,    45,    42,    47,    40,    41,   258
            };
  }

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
            {
                    "$end", "error", "$undefined", "'+'", "'-'", "'*'", "'/'", "'('", "')'",
                    "NUMBER", "$accept", "top", "expression", "term", "factor", null
            };
  }

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final byte yyrline_[] = yyrline_init();
  private static final byte[] yyrline_init()
  {
    return new byte[]
            {
                    0,    32,    32,    36,    38,    40,    44,    46,    48,    52,
                    54
            };
  }


  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
            + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
              yystos_[yystack.stateAt(yynrhs - (yyi + 1))],
              ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
            {
                    0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    7,     8,     5,     3,     2,     4,     2,     6,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
                    2,     2,     2,     2,     2,     2,     1,     2,     9
            };
  }

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 17;
  private static final int yynnts_ = 5;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 8;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 10;

  private static final int yyuser_token_number_max_ = 258;
  private static final int yyundef_token_ = 2;

  /* User implementation code.  */
  /* Unqualified %code blocks.  */
  /* "Calc.y":8  */ /* lalr1.java:1066  */

  private int x = 3;

  public Integer result() {
    return x;
  }

  /* "Calc.java":909  */ /* lalr1.java:1066  */

}

/* "Calc.y":58  */ /* lalr1.java:1070  */

