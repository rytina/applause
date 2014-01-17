lexer grammar InternalApplauseDsl;
@header {
package org.applause.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[]' ;
T12 : '.' ;
T13 : 'section.id' ;
T14 : '(' ;
T15 : ')' ;
T16 : 'replace(' ;
T17 : ',' ;
T18 : 'urlconform(' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'split(' ;
T22 : 'tabbarApplication' ;
T23 : 'application' ;
T24 : '{' ;
T25 : 'splash=' ;
T26 : '}' ;
T27 : 'button' ;
T28 : 'title=' ;
T29 : 'icon=' ;
T30 : 'view=' ;
T31 : 'const' ;
T32 : 'de=' ;
T33 : 'en=' ;
T34 : 'type' ;
T35 : 'mapsTo' ;
T36 : 'entity' ;
T37 : 'extends' ;
T38 : 'derived' ;
T39 : 'contentprovider' ;
T40 : 'returns' ;
T41 : 'resolves' ;
T42 : 'fetches' ;
T43 : 'XML' ;
T44 : 'from' ;
T45 : 'selects' ;
T46 : 'tableview' ;
T47 : ':' ;
T48 : 'detailsview' ;
T49 : 'customview' ;
T50 : 'implementedBy' ;
T51 : 'header' ;
T52 : 'subtitle=' ;
T53 : 'details=' ;
T54 : 'image=' ;
T55 : 'section' ;
T56 : 'forAllSections' ;
T57 : 'content=' ;
T58 : 'cell' ;
T59 : 'foreach' ;
T60 : 'text=' ;
T61 : 'query=' ;
T62 : 'action=' ;
T63 : 'button=' ;
T64 : 'as' ;
T65 : 'delegate' ;
T66 : 'Default' ;
T67 : 'DefaultWithDisclosure' ;
T68 : 'Value2' ;
T69 : 'Double' ;
T70 : 'Subtitle' ;
T71 : 'Map' ;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3827
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3829
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3831
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3833
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3835
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3837
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g" 3839
RULE_ANY_OTHER : .;


