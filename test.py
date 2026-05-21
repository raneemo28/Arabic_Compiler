import sys
from antlr4 import *
from Grammar.ACSSLexer import ACSSLexer
from Grammar.ArabicWebParser import ArabicWebParser

def main():
    # Load your example file
    input_stream = FileStream("example.aweb", encoding='utf-8')
    
    # Run it through your Arabic Lexer and Parser
    lexer = ACSSLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ArabicWebParser(stream)
    
    # Parse starting at your 'document' rule
    tree = parser.document()
    
    # Print the text structural representation to the console
    print(tree.toStringTree(recog=parser))

if __name__ == '__main__':
    main()