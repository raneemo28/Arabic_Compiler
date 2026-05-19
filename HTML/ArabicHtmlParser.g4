// ============================================================
//  ArabicHtmlParser.g4
//  Pure ANTLR4 Parser grammar.
//  Imports the lexer so the two files stay in sync — any token
//  name change in ArabicHtmlLexer.g4 is automatically reflected
//  here without editing this file.
//
//  Generate with:
//    antlr4 -Dlanguage=Python3 -visitor ArabicHtmlLexer.g4
//    antlr4 -Dlanguage=Python3 -visitor ArabicHtmlParser.g4
// ============================================================

parser grammar ArabicHtmlParser;

// Pull every token definition from the lexer grammar.
// This is the standard ANTLR4 pattern when superClass is
// needed on the lexer — a combined grammar does not support
// a lexer-only superClass option.
options {
    tokenVocab = ArabicHtmlLexer;
}

// ============================================================
// PARSER RULES
// ============================================================

// ------------------------------------------------------------
// document — top-level rule.
// A well-formed document is zero or more elements followed by
// the end-of-file marker.  Allowing zero elements means an
// empty file is legal rather than a parse error.
// ------------------------------------------------------------
document
    : element* EOF
    ;

// ------------------------------------------------------------
// element — a single node in the tree.
// Two alternatives:
//   1. tag element  — a named tag wrapping inner content
//   2. TEXT         — raw character data between tags
// ------------------------------------------------------------
element
    : tagElement
    | TEXT
    ;

// ------------------------------------------------------------
// tagElement — an opening tag, its contents, and a closing tag.
//
// OPEN_TAG and CLOSE_TAG already embed the angle-brackets and
// the identifier, so no separate ARABIC_ID token appears here
// at the parser level.
//
// Nesting is handled naturally by the recursive reference to
// element* — any depth of nesting is supported without
// additional rules.
//
// Example parse for  <مقال>مرحبا <فقرة>عالم</فقرة></مقال>:
//
//   document
//   └─ element
//      └─ tagElement
//         ├─ OPEN_TAG  <مقال>
//         ├─ element  →  TEXT "مرحبا "
//         ├─ element
//         │  └─ tagElement
//         │     ├─ OPEN_TAG  <فقرة>
//         │     ├─ element  →  TEXT "عالم"
//         │     └─ CLOSE_TAG </فقرة>
//         └─ CLOSE_TAG </مقال>
// ------------------------------------------------------------
tagElement
    : OPEN_TAG element* CLOSE_TAG
    ;
