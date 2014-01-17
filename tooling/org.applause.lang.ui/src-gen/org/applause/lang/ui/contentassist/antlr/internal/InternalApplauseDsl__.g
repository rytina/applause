lexer grammar InternalApplauseDsl;
@header {
package org.applause.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'tabbarApplication' ;
T12 : 'application' ;
T13 : 'de=' ;
T14 : 'en=' ;
T15 : 'returns' ;
T16 : 'Default' ;
T17 : 'DefaultWithDisclosure' ;
T18 : 'Value2' ;
T19 : 'Double' ;
T20 : 'Subtitle' ;
T21 : 'Map' ;
T22 : '.' ;
T23 : 'section.id' ;
T24 : '(' ;
T25 : ')' ;
T26 : 'replace(' ;
T27 : ',' ;
T28 : 'urlconform(' ;
T29 : '[' ;
T30 : ']' ;
T31 : 'split(' ;
T32 : '{' ;
T33 : '}' ;
T34 : 'splash=' ;
T35 : 'button' ;
T36 : 'title=' ;
T37 : 'icon=' ;
T38 : 'view=' ;
T39 : 'const' ;
T40 : 'type' ;
T41 : 'mapsTo' ;
T42 : 'entity' ;
T43 : 'extends' ;
T44 : 'contentprovider' ;
T45 : 'fetches' ;
T46 : 'XML' ;
T47 : 'from' ;
T48 : 'selects' ;
T49 : 'tableview' ;
T50 : ':' ;
T51 : 'detailsview' ;
T52 : 'customview' ;
T53 : 'implementedBy' ;
T54 : 'header' ;
T55 : 'subtitle=' ;
T56 : 'details=' ;
T57 : 'image=' ;
T58 : 'section' ;
T59 : 'forAllSections' ;
T60 : 'content=' ;
T61 : 'cell' ;
T62 : 'foreach' ;
T63 : 'text=' ;
T64 : 'query=' ;
T65 : 'action=' ;
T66 : 'button=' ;
T67 : 'as' ;
T68 : 'delegate' ;
T69 : '[]' ;
T70 : 'derived' ;
T71 : 'resolves' ;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9778
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9780
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9782
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9784
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9786
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9788
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.lang.ui/src-gen/org/applause/lang/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9790
RULE_ANY_OTHER : .;


