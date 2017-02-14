/* The following code was generated by JFlex 1.6.1 */

package plic.analyse ;

import java_cup.runtime.*;
import plic.exceptions.AnalyseLexicaleException;
      

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>AnalyseurLexical.jflex</tt>
 */
public class AnalyseurLexical implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int commentaire = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\0\1\12\1\15\1\11\1\11\22\0\1\0\1\23\1\13"+
    "\5\0\1\32\1\33\1\16\1\20\1\43\1\21\1\0\1\14\12\1"+
    "\1\0\1\42\1\24\1\22\1\25\2\0\32\17\4\0\1\17\1\0"+
    "\1\4\1\40\1\34\1\17\1\26\1\6\2\17\1\5\2\17\1\35"+
    "\1\17\1\31\1\30\1\37\1\41\1\3\1\36\1\27\1\7\1\2"+
    "\1\17\1\10\2\17\12\0\1\15\u1fa2\0\1\15\1\15\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\3\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\1\12\3\3\1\13\1\14"+
    "\2\3\1\15\1\16\1\1\4\3\1\0\1\17\1\1"+
    "\1\20\1\21\1\22\1\23\2\3\1\24\4\3\1\25"+
    "\3\3\1\26\2\3\1\27\4\3\1\30\14\3\1\31"+
    "\1\32\1\33\1\34\4\3\1\35\27\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\154\0\220\0\264\0\330\0\374"+
    "\0\u0120\0\110\0\110\0\110\0\u0144\0\u0168\0\110\0\110"+
    "\0\u018c\0\u01b0\0\u01d4\0\110\0\110\0\u01f8\0\u021c\0\110"+
    "\0\110\0\u0240\0\u0264\0\u0288\0\u02ac\0\u02d0\0\374\0\u02f4"+
    "\0\u0318\0\110\0\110\0\110\0\u0264\0\u033c\0\u0360\0\u0264"+
    "\0\u0384\0\u03a8\0\u03cc\0\u03f0\0\110\0\u0414\0\u0438\0\u045c"+
    "\0\u0414\0\u0480\0\u04a4\0\u0414\0\u04c8\0\u04ec\0\u0510\0\u0534"+
    "\0\u0534\0\u0558\0\u057c\0\u05a0\0\u05c4\0\u05e8\0\u060c\0\u0630"+
    "\0\u0654\0\u0678\0\u069c\0\u06c0\0\u06e4\0\u06e4\0\u06e4\0\u06e4"+
    "\0\u06e4\0\u0708\0\u072c\0\u0750\0\u0774\0\u0774\0\u0798\0\u07bc"+
    "\0\u07e0\0\u0804\0\u0828\0\u084c\0\u0870\0\u0894\0\u08b8\0\u08dc"+
    "\0\u0900\0\u0924\0\u0948\0\u096c\0\u0990\0\u09b4\0\u09d8\0\u09fc"+
    "\0\u0a20\0\u0a44\0\u0a68\0\u0a8c\0\110";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\3\6\1\7\2\6\2\3\1\10"+
    "\1\11\1\0\1\12\1\6\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\6\1\22\1\23\1\24\1\25"+
    "\1\26\2\6\1\27\2\6\1\30\1\31\11\3\1\0"+
    "\3\3\1\0\1\32\25\3\45\0\1\4\43\0\2\33"+
    "\1\34\5\33\6\0\1\33\6\0\4\33\2\0\6\33"+
    "\3\0\10\33\6\0\1\33\6\0\4\33\2\0\6\33"+
    "\3\0\3\33\1\35\1\36\3\33\6\0\1\33\6\0"+
    "\4\33\2\0\6\33\2\0\13\37\1\40\30\37\14\0"+
    "\1\41\1\0\1\42\47\0\1\43\43\0\1\44\22\0"+
    "\10\33\6\0\1\33\6\0\1\33\1\45\1\33\1\46"+
    "\2\0\1\47\5\33\3\0\6\33\1\50\1\33\6\0"+
    "\1\33\6\0\4\33\2\0\6\33\3\0\10\33\6\0"+
    "\1\33\6\0\2\33\1\51\1\33\2\0\6\33\3\0"+
    "\10\33\6\0\1\33\6\0\4\33\2\0\1\33\1\52"+
    "\4\33\3\0\2\33\1\53\3\33\1\54\1\33\6\0"+
    "\1\33\6\0\4\33\2\0\6\33\16\0\1\55\30\0"+
    "\10\56\6\0\1\56\6\0\4\56\2\0\6\56\3\0"+
    "\3\56\1\57\4\56\6\0\1\56\6\0\4\56\2\0"+
    "\6\56\3\0\6\56\1\60\1\56\6\0\1\56\6\0"+
    "\4\56\2\0\6\56\3\0\10\56\6\0\1\56\6\0"+
    "\3\56\1\61\2\0\6\56\15\0\1\37\30\0\11\41"+
    "\2\0\2\41\1\0\26\41\1\0\10\56\6\0\1\56"+
    "\6\0\1\56\1\62\2\56\2\0\6\56\3\0\2\56"+
    "\1\63\5\56\6\0\1\56\6\0\4\56\2\0\6\56"+
    "\3\0\10\56\6\0\1\56\6\0\3\56\1\64\2\0"+
    "\6\56\3\0\3\56\1\65\4\56\6\0\1\56\6\0"+
    "\4\56\2\0\6\56\3\0\4\56\1\66\3\56\6\0"+
    "\1\56\6\0\4\56\2\0\6\56\3\0\10\56\6\0"+
    "\1\56\6\0\4\56\2\0\4\56\1\67\1\56\3\0"+
    "\10\70\6\0\1\70\6\0\4\70\2\0\6\70\3\0"+
    "\4\70\1\71\3\70\6\0\1\70\6\0\4\70\2\0"+
    "\6\70\3\0\7\70\1\71\6\0\1\70\6\0\4\70"+
    "\2\0\6\70\3\0\4\70\1\72\3\70\6\0\1\70"+
    "\6\0\4\70\2\0\6\70\3\0\4\70\1\73\3\70"+
    "\6\0\1\70\6\0\4\70\2\0\6\70\3\0\10\70"+
    "\6\0\1\70\6\0\4\70\2\0\2\70\1\74\3\70"+
    "\3\0\1\70\1\75\6\70\6\0\1\70\6\0\4\70"+
    "\2\0\6\70\3\0\10\70\6\0\1\70\6\0\4\70"+
    "\2\0\1\70\1\76\4\70\3\0\10\77\6\0\1\77"+
    "\6\0\4\77\2\0\6\77\3\0\10\77\6\0\1\77"+
    "\6\0\1\100\3\77\2\0\6\77\3\0\2\77\1\101"+
    "\5\77\6\0\1\77\6\0\4\77\2\0\6\77\3\0"+
    "\10\77\6\0\1\77\6\0\4\77\2\0\2\77\1\102"+
    "\3\77\3\0\10\77\6\0\1\77\6\0\1\103\3\77"+
    "\2\0\6\77\3\0\4\77\1\104\3\77\6\0\1\77"+
    "\6\0\4\77\2\0\6\77\3\0\10\105\6\0\1\105"+
    "\6\0\4\105\2\0\6\105\3\0\2\105\1\106\5\105"+
    "\6\0\1\105\6\0\4\105\2\0\6\105\3\0\10\105"+
    "\6\0\1\105\6\0\1\107\3\105\2\0\6\105\3\0"+
    "\10\105\6\0\1\105\6\0\1\110\3\105\2\0\6\105"+
    "\3\0\10\105\6\0\1\105\6\0\1\111\3\105\2\0"+
    "\6\105\3\0\10\105\6\0\1\105\6\0\4\105\2\0"+
    "\5\105\1\112\3\0\10\113\6\0\1\113\6\0\4\113"+
    "\2\0\6\113\3\0\6\113\1\114\1\113\6\0\1\113"+
    "\6\0\4\113\2\0\6\113\3\0\10\115\6\0\1\115"+
    "\6\0\4\115\2\0\6\115\3\0\10\115\6\0\1\115"+
    "\6\0\1\116\3\115\2\0\6\115\3\0\10\117\6\0"+
    "\1\117\6\0\4\117\2\0\6\117\3\0\10\120\6\0"+
    "\1\120\6\0\4\120\2\0\6\120\3\0\10\121\6\0"+
    "\1\121\6\0\4\121\2\0\6\121\3\0\10\122\6\0"+
    "\1\122\6\0\4\122\2\0\6\122\3\0\10\123\6\0"+
    "\1\123\6\0\4\123\2\0\6\123\3\0\10\124\6\0"+
    "\1\124\6\0\4\124\2\0\6\124\3\0\10\125\6\0"+
    "\1\125\6\0\4\125\2\0\6\125\3\0\10\126\6\0"+
    "\1\126\6\0\4\126\2\0\6\126\3\0\10\127\6\0"+
    "\1\127\6\0\4\127\2\0\6\127\3\0\10\130\6\0"+
    "\1\130\6\0\4\130\2\0\6\130\3\0\10\131\6\0"+
    "\1\131\6\0\4\131\2\0\6\131\3\0\10\132\6\0"+
    "\1\132\6\0\4\132\2\0\6\132\3\0\10\133\6\0"+
    "\1\133\6\0\4\133\2\0\6\133\3\0\10\134\6\0"+
    "\1\134\6\0\4\134\2\0\6\134\3\0\10\135\6\0"+
    "\1\135\6\0\4\135\2\0\6\135\3\0\10\136\6\0"+
    "\1\136\6\0\4\136\2\0\6\136\3\0\10\137\6\0"+
    "\1\137\6\0\4\137\2\0\6\137\3\0\10\140\6\0"+
    "\1\140\6\0\4\140\2\0\6\140\3\0\10\141\6\0"+
    "\1\141\6\0\4\141\2\0\6\141\3\0\10\142\6\0"+
    "\1\142\6\0\4\142\2\0\6\142\3\0\10\143\6\0"+
    "\1\143\6\0\4\143\2\0\6\143\3\0\10\144\6\0"+
    "\1\144\6\0\4\144\2\0\6\144\3\0\10\145\6\0"+
    "\1\145\6\0\4\145\2\0\6\145\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2736];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\6\1\3\11\2\1\2\11\3\1\2\11"+
    "\2\1\2\11\5\1\1\0\2\1\3\11\10\1\1\11"+
    "\67\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  private Symbol symbol(int type) {
	return new Symbol(type, yyline, yycolumn) ;
  }

  private Symbol symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value) ;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalyseurLexical(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 150) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {         return symbol(CodesLexicaux.EOF) ;
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 30: break;
          case 2: 
            { return symbol(CodesLexicaux.CONSTANTEINT, yytext());
            }
          case 31: break;
          case 3: 
            { return symbol(CodesLexicaux.IDFTERM, yytext()) ;
            }
          case 32: break;
          case 4: 
            { return symbol(CodesLexicaux.DIV);
            }
          case 33: break;
          case 5: 
            { return symbol(CodesLexicaux.MULT);
            }
          case 34: break;
          case 6: 
            { return symbol(CodesLexicaux.PLUS);
            }
          case 35: break;
          case 7: 
            { return symbol(CodesLexicaux.MOINS);
            }
          case 36: break;
          case 8: 
            { return symbol(CodesLexicaux.EGAL);
            }
          case 37: break;
          case 9: 
            { return symbol(CodesLexicaux.INF);
            }
          case 38: break;
          case 10: 
            { return symbol(CodesLexicaux.SUP);
            }
          case 39: break;
          case 11: 
            { return symbol(CodesLexicaux.PAROUV);
            }
          case 40: break;
          case 12: 
            { return symbol(CodesLexicaux.PARFER);
            }
          case 41: break;
          case 13: 
            { return symbol(CodesLexicaux.POINTVIRGULE);
            }
          case 42: break;
          case 14: 
            { return symbol(CodesLexicaux.VIRGULE);
            }
          case 43: break;
          case 15: 
            { String s = yytext();
                                            s = s.replace("\"\"", "\\\"");
                                           return symbol(CodesLexicaux.CONSTANTECHAINE, s);
            }
          case 44: break;
          case 16: 
            { yybegin(commentaire);
            }
          case 45: break;
          case 17: 
            { return symbol(CodesLexicaux.EGALEGAL);
            }
          case 46: break;
          case 18: 
            { return symbol(CodesLexicaux.DIFF);
            }
          case 47: break;
          case 19: 
            { return symbol(CodesLexicaux.ET);
            }
          case 48: break;
          case 20: 
            { return symbol(CodesLexicaux.OU);
            }
          case 49: break;
          case 21: 
            { yybegin(YYINITIAL);
            }
          case 50: break;
          case 22: 
            { return symbol(CodesLexicaux.FIN );
            }
          case 51: break;
          case 23: 
            { return symbol(CodesLexicaux.NON);
            }
          case 52: break;
          case 24: 
            { return symbol(CodesLexicaux.CONSTANTEBOOL, yytext());
            }
          case 53: break;
          case 25: 
            { return symbol(CodesLexicaux.ENTIER);
            }
          case 54: break;
          case 26: 
            { return symbol(CodesLexicaux.ECRIRETERM);
            }
          case 55: break;
          case 27: 
            { return symbol(CodesLexicaux.CLASSETERM );
            }
          case 56: break;
          case 28: 
            { return symbol(CodesLexicaux.PRIVEE);
            }
          case 57: break;
          case 29: 
            { return symbol(CodesLexicaux.PUBLIQUE);
            }
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
