package plic.analyse ;

import java_cup.runtime.*;
import plic.exceptions.AnalyseLexicaleException;
      
%%
   
%class AnalyseurLexical
%public

%line
%column
    
%type Symbol
%eofval{
        return symbol(CodesLexicaux.EOF) ;
%eofval}

// Gestion des commentaires

%state commentaire

%cup

%{
  private Symbol symbol(int type) {
	return new Symbol(type, yyline, yycolumn) ;
  }

  private Symbol symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value) ;
  }
%}

csteE = [0-9]+
csteB = "vrai" | "faux"




csteChaine = \"([^\"]|\"\")*\"

finDeLigne = \r|\n
espace = {finDeLigne}  | [ \t\f]

commSlashSlash = [/][/].*
commSlashEtoile = [/][*]
commEtoileSlash = [*][/]
idf = [_a-zA-Z][_a-zA-Z0-9]{0,30}

%%



// ------ Plic2 ------ //

<YYINITIAL> "si" { return symbol(CodesLexicaux.SI ); }
<YYINITIAL> "alors" { return symbol(CodesLexicaux.ALORS ); }
<YYINITIAL> "sinon" { return symbol(CodesLexicaux.SINON ); }
<YYINITIAL> "fsi" { return symbol(CodesLexicaux.FSI ); }


<YYINITIAL> "==" { return symbol(CodesLexicaux.EGALEGAL); }
<YYINITIAL> "!=" { return symbol(CodesLexicaux.DIFF); }
<YYINITIAL> "<" { return symbol(CodesLexicaux.INF); }
<YYINITIAL> ">" { return symbol(CodesLexicaux.SUP); }

<YYINITIAL> "+" { return symbol(CodesLexicaux.PLUS); }
<YYINITIAL> "-" { return symbol(CodesLexicaux.MOINS); }
<YYINITIAL> "*" { return symbol(CodesLexicaux.MULT); }
<YYINITIAL> "/" { return symbol(CodesLexicaux.DIV); }


<YYINITIAL> "et" { return symbol(CodesLexicaux.ET); }
<YYINITIAL> "ou" { return symbol(CodesLexicaux.OU); }
<YYINITIAL> "non" { return symbol(CodesLexicaux.NON); }

<YYINITIAL> "(" { return symbol(CodesLexicaux.PAROUV); }
<YYINITIAL> ")" { return symbol(CodesLexicaux.PARFER); }

<YYINITIAL> {csteE} { return symbol(CodesLexicaux.CONSTANTEINT, yytext()); }
<YYINITIAL> {csteB} { return symbol(CodesLexicaux.CONSTANTEBOOL, yytext()); }

<YYINITIAL> {espace} { }



// ------ Plic1 ------ //

<YYINITIAL> "classe" { return symbol(CodesLexicaux.CLASSETERM ); }
<YYINITIAL> "fin" { return symbol(CodesLexicaux.FIN ); }

<YYINITIAL> "publique" { return symbol(CodesLexicaux.PUBLIQUE); }
<YYINITIAL> "privee" { return symbol(CodesLexicaux.PRIVEE); }
<YYINITIAL> "entier" { return symbol(CodesLexicaux.ENTIER); }
<YYINITIAL> {csteChaine} { String s = yytext();
                            s = s.replace("\"\"", "\\\"");
                            return symbol(CodesLexicaux.CONSTANTECHAINE, s); }
<YYINITIAL> "ecrire" { return symbol(CodesLexicaux.ECRIRETERM); }


<YYINITIAL> {commSlashSlash} {}
<YYINITIAL> {commSlashEtoile} {yybegin(commentaire);}
<commentaire> {commEtoileSlash} {yybegin(YYINITIAL);}

<YYINITIAL> {idf} { return symbol(CodesLexicaux.IDFTERM, yytext()) ; }


<YYINITIAL> ";" { return symbol(CodesLexicaux.POINTVIRGULE); }
<YYINITIAL> "," { return symbol(CodesLexicaux.VIRGULE); }
<YYINITIAL> "=" { return symbol(CodesLexicaux.EGAL); }

. {}
\n {}
" " {}
