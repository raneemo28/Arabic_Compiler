# Generated from ArabicWebParser.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,142,250,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,
        7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,
        13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
        20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,
        26,2,27,7,27,2,28,7,28,2,29,7,29,1,0,1,0,5,0,63,8,0,10,0,12,0,66,
        9,0,1,0,1,0,1,1,1,1,3,1,72,8,1,1,2,1,2,5,2,76,8,2,10,2,12,2,79,9,
        2,1,2,1,2,1,3,1,3,3,3,85,8,3,1,4,1,4,1,4,1,4,5,4,91,8,4,10,4,12,
        4,94,9,4,1,4,1,4,1,5,1,5,1,5,5,5,101,8,5,10,5,12,5,104,9,5,1,6,1,
        6,1,6,1,6,3,6,110,8,6,3,6,112,8,6,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,
        8,1,8,3,8,123,8,8,1,8,1,8,1,9,1,9,1,9,5,9,130,8,9,10,9,12,9,133,
        9,9,1,10,1,10,1,10,1,10,5,10,139,8,10,10,10,12,10,142,9,10,1,11,
        1,11,1,12,1,12,3,12,148,8,12,1,12,1,12,1,12,5,12,153,8,12,10,12,
        12,12,156,9,12,1,12,1,12,4,12,160,8,12,11,12,12,12,161,3,12,164,
        8,12,1,13,1,13,1,13,1,14,1,14,1,14,1,15,1,15,1,15,1,15,3,15,176,
        8,15,1,16,1,16,1,16,1,17,1,17,1,17,1,18,1,18,1,18,5,18,187,8,18,
        10,18,12,18,190,9,18,1,18,3,18,193,8,18,1,19,1,19,1,19,1,19,3,19,
        199,8,19,1,20,1,20,1,21,1,21,1,22,1,22,5,22,207,8,22,10,22,12,22,
        210,9,22,1,23,1,23,1,23,1,23,1,23,3,23,217,8,23,1,24,1,24,1,24,1,
        24,1,24,1,24,3,24,225,8,24,1,25,1,25,3,25,229,8,25,1,26,1,26,1,27,
        1,27,1,27,1,27,1,27,1,28,1,28,1,29,1,29,3,29,242,8,29,1,29,5,29,
        245,8,29,10,29,12,29,248,9,29,1,29,0,0,30,0,2,4,6,8,10,12,14,16,
        18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,0,
        7,3,0,133,133,138,138,140,140,1,0,72,78,1,0,79,82,3,0,4,64,66,71,
        111,111,1,0,133,137,1,0,83,106,1,0,113,120,254,0,64,1,0,0,0,2,71,
        1,0,0,0,4,73,1,0,0,0,6,84,1,0,0,0,8,86,1,0,0,0,10,97,1,0,0,0,12,
        111,1,0,0,0,14,113,1,0,0,0,16,119,1,0,0,0,18,126,1,0,0,0,20,134,
        1,0,0,0,22,143,1,0,0,0,24,163,1,0,0,0,26,165,1,0,0,0,28,168,1,0,
        0,0,30,175,1,0,0,0,32,177,1,0,0,0,34,180,1,0,0,0,36,183,1,0,0,0,
        38,194,1,0,0,0,40,200,1,0,0,0,42,202,1,0,0,0,44,204,1,0,0,0,46,216,
        1,0,0,0,48,224,1,0,0,0,50,226,1,0,0,0,52,230,1,0,0,0,54,232,1,0,
        0,0,56,237,1,0,0,0,58,239,1,0,0,0,60,63,3,2,1,0,61,63,3,6,3,0,62,
        60,1,0,0,0,62,61,1,0,0,0,63,66,1,0,0,0,64,62,1,0,0,0,64,65,1,0,0,
        0,65,67,1,0,0,0,66,64,1,0,0,0,67,68,5,0,0,1,68,1,1,0,0,0,69,72,3,
        4,2,0,70,72,5,3,0,0,71,69,1,0,0,0,71,70,1,0,0,0,72,3,1,0,0,0,73,
        77,5,2,0,0,74,76,3,2,1,0,75,74,1,0,0,0,76,79,1,0,0,0,77,75,1,0,0,
        0,77,78,1,0,0,0,78,80,1,0,0,0,79,77,1,0,0,0,80,81,5,1,0,0,81,5,1,
        0,0,0,82,85,3,16,8,0,83,85,3,8,4,0,84,82,1,0,0,0,84,83,1,0,0,0,85,
        7,1,0,0,0,86,87,5,65,0,0,87,88,3,10,5,0,88,92,5,124,0,0,89,91,3,
        16,8,0,90,89,1,0,0,0,91,94,1,0,0,0,92,90,1,0,0,0,92,93,1,0,0,0,93,
        95,1,0,0,0,94,92,1,0,0,0,95,96,5,125,0,0,96,9,1,0,0,0,97,102,3,12,
        6,0,98,99,5,128,0,0,99,101,3,12,6,0,100,98,1,0,0,0,101,104,1,0,0,
        0,102,100,1,0,0,0,102,103,1,0,0,0,103,11,1,0,0,0,104,102,1,0,0,0,
        105,112,3,14,7,0,106,109,5,111,0,0,107,108,5,93,0,0,108,110,3,14,
        7,0,109,107,1,0,0,0,109,110,1,0,0,0,110,112,1,0,0,0,111,105,1,0,
        0,0,111,106,1,0,0,0,112,13,1,0,0,0,113,114,5,131,0,0,114,115,3,42,
        21,0,115,116,5,126,0,0,116,117,3,44,22,0,117,118,5,132,0,0,118,15,
        1,0,0,0,119,120,3,18,9,0,120,122,5,124,0,0,121,123,3,36,18,0,122,
        121,1,0,0,0,122,123,1,0,0,0,123,124,1,0,0,0,124,125,5,125,0,0,125,
        17,1,0,0,0,126,131,3,20,10,0,127,128,5,128,0,0,128,130,3,20,10,0,
        129,127,1,0,0,0,130,133,1,0,0,0,131,129,1,0,0,0,131,132,1,0,0,0,
        132,19,1,0,0,0,133,131,1,0,0,0,134,140,3,24,12,0,135,136,3,22,11,
        0,136,137,3,24,12,0,137,139,1,0,0,0,138,135,1,0,0,0,139,142,1,0,
        0,0,140,138,1,0,0,0,140,141,1,0,0,0,141,21,1,0,0,0,142,140,1,0,0,
        0,143,144,7,0,0,0,144,23,1,0,0,0,145,148,3,30,15,0,146,148,3,34,
        17,0,147,145,1,0,0,0,147,146,1,0,0,0,148,154,1,0,0,0,149,153,3,30,
        15,0,150,153,3,32,16,0,151,153,3,34,17,0,152,149,1,0,0,0,152,150,
        1,0,0,0,152,151,1,0,0,0,153,156,1,0,0,0,154,152,1,0,0,0,154,155,
        1,0,0,0,155,164,1,0,0,0,156,154,1,0,0,0,157,160,3,32,16,0,158,160,
        3,34,17,0,159,157,1,0,0,0,159,158,1,0,0,0,160,161,1,0,0,0,161,159,
        1,0,0,0,161,162,1,0,0,0,162,164,1,0,0,0,163,147,1,0,0,0,163,159,
        1,0,0,0,164,25,1,0,0,0,165,166,5,129,0,0,166,167,5,111,0,0,167,27,
        1,0,0,0,168,169,5,130,0,0,169,170,5,111,0,0,170,29,1,0,0,0,171,176,
        5,111,0,0,172,176,3,28,14,0,173,176,3,26,13,0,174,176,5,135,0,0,
        175,171,1,0,0,0,175,172,1,0,0,0,175,173,1,0,0,0,175,174,1,0,0,0,
        176,31,1,0,0,0,177,178,5,126,0,0,178,179,7,1,0,0,179,33,1,0,0,0,
        180,181,5,142,0,0,181,182,7,2,0,0,182,35,1,0,0,0,183,188,3,38,19,
        0,184,185,5,127,0,0,185,187,3,38,19,0,186,184,1,0,0,0,187,190,1,
        0,0,0,188,186,1,0,0,0,188,189,1,0,0,0,189,192,1,0,0,0,190,188,1,
        0,0,0,191,193,5,127,0,0,192,191,1,0,0,0,192,193,1,0,0,0,193,37,1,
        0,0,0,194,195,3,42,21,0,195,196,5,126,0,0,196,198,3,44,22,0,197,
        199,3,40,20,0,198,197,1,0,0,0,198,199,1,0,0,0,199,39,1,0,0,0,200,
        201,5,107,0,0,201,41,1,0,0,0,202,203,7,3,0,0,203,43,1,0,0,0,204,
        208,3,46,23,0,205,207,3,46,23,0,206,205,1,0,0,0,207,210,1,0,0,0,
        208,206,1,0,0,0,208,209,1,0,0,0,209,45,1,0,0,0,210,208,1,0,0,0,211,
        217,3,48,24,0,212,213,3,48,24,0,213,214,7,4,0,0,214,215,3,48,24,
        0,215,217,1,0,0,0,216,211,1,0,0,0,216,212,1,0,0,0,217,47,1,0,0,0,
        218,225,3,50,25,0,219,225,3,52,26,0,220,225,5,110,0,0,221,225,5,
        112,0,0,222,225,3,54,27,0,223,225,5,111,0,0,224,218,1,0,0,0,224,
        219,1,0,0,0,224,220,1,0,0,0,224,221,1,0,0,0,224,222,1,0,0,0,224,
        223,1,0,0,0,225,49,1,0,0,0,226,228,5,109,0,0,227,229,5,108,0,0,228,
        227,1,0,0,0,228,229,1,0,0,0,229,51,1,0,0,0,230,231,7,5,0,0,231,53,
        1,0,0,0,232,233,3,56,28,0,233,234,5,131,0,0,234,235,3,58,29,0,235,
        236,5,132,0,0,236,55,1,0,0,0,237,238,7,6,0,0,238,57,1,0,0,0,239,
        246,3,46,23,0,240,242,5,128,0,0,241,240,1,0,0,0,241,242,1,0,0,0,
        242,243,1,0,0,0,243,245,3,46,23,0,244,241,1,0,0,0,245,248,1,0,0,
        0,246,244,1,0,0,0,246,247,1,0,0,0,247,59,1,0,0,0,248,246,1,0,0,0,
        28,62,64,71,77,84,92,102,109,111,122,131,140,147,152,154,159,161,
        163,175,188,192,198,208,216,224,228,241,246
    ]

class ArabicWebParser ( Parser ):

    grammarFileName = "ArabicWebParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'\\u0639\\u0631\\u0636'", "'\\u0645\\u0648\\u0642\\u0639'", 
                     "'\\u0639\\u0631\\u0636-\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629'", 
                     "'\\u0637\\u0648\\u0644-\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629'", 
                     "'\\u0623\\u0642\\u0635\\u0649-\\u0639\\u0631\\u0636'", 
                     "'\\u0623\\u0642\\u0644-\\u0639\\u0631\\u0636'", "'\\u0623\\u0642\\u0635\\u0649-\\u0637\\u0648\\u0644'", 
                     "'\\u0623\\u0642\\u0644-\\u0637\\u0648\\u0644'", "'\\u0647\\u0627\\u0645\\u0634'", 
                     "'\\u062D\\u0634\\u0648'", "'\\u0625\\u0637\\u0627\\u0631'", 
                     "'\\u0627\\u0644\\u0638\\u0647\\u0648\\u0631'", "'\\u0641\\u0627\\u0626\\u0636'", 
                     "'\\u062A\\u0631\\u062A\\u064A\\u0628-\\u0627\\u0644\\u0639\\u0645\\u0642'", 
                     "'\\u062A\\u062D\\u062C\\u064A\\u0645-\\u0627\\u0644\\u0635\\u0646\\u062F\\u0648\\u0642'", 
                     "'\\u0645\\u0631\\u0646'", "'\\u0627\\u062A\\u062C\\u0627\\u0647-\\u0627\\u0644\\u0645\\u0631\\u0648\\u0646\\u0629'", 
                     "'\\u0644\\u0641-\\u0627\\u0644\\u0645\\u0631\\u0648\\u0646\\u0629'", 
                     "'\\u0646\\u0645\\u0648-\\u0627\\u0644\\u0645\\u0631\\u0648\\u0646\\u0629'", 
                     "'\\u0627\\u0646\\u0643\\u0645\\u0627\\u0634-\\u0627\\u0644\\u0645\\u0631\\u0648\\u0646\\u0629'", 
                     "'\\u0634\\u0628\\u0643\\u0629'", "'\\u0642\\u0627\\u0644\\u0628-\\u0627\\u0644\\u0634\\u0628\\u0643\\u0629'", 
                     "'\\u0641\\u062C\\u0648\\u0629'", "'\\u0636\\u0628\\u0637-\\u0627\\u0644\\u0645\\u062D\\u062A\\u0648\\u0649'", 
                     "'\\u0645\\u062D\\u0627\\u0630\\u0627\\u0629-\\u0627\\u0644\\u0639\\u0646\\u0627\\u0635\\u0631'", 
                     "'\\u0645\\u062D\\u0627\\u0630\\u0627\\u0629-\\u0630\\u0627\\u062A\\u064A\\u0629'", 
                     "'\\u062A\\u0631\\u062A\\u064A\\u0628'", "'\\u0644\\u0648\\u0646'", 
                     "'\\u062E\\u0644\\u0641\\u064A\\u0629'", "'\\u0635\\u0648\\u0631\\u0629-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
                     "'\\u0644\\u0648\\u0646-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
                     "'\\u062D\\u062C\\u0645-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
                     "'\\u062A\\u0643\\u0631\\u0627\\u0631-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
                     "'\\u062A\\u062B\\u0628\\u064A\\u062A-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
                     "'\\u0642\\u0635-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
                     "'\\u0634\\u0641\\u0627\\u0641\\u064A\\u0629'", "'\\u0638\\u0644-\\u0627\\u0644\\u0635\\u0646\\u062F\\u0648\\u0642'", 
                     "'\\u0646\\u0648\\u0639-\\u0627\\u0644\\u062E\\u0637'", 
                     "'\\u062D\\u062C\\u0645-\\u0627\\u0644\\u062E\\u0637'", 
                     "'\\u062B\\u0642\\u0644-\\u0627\\u0644\\u062E\\u0637'", 
                     "'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u062E\\u0637'", 
                     "'\\u0645\\u062D\\u0627\\u0630\\u0627\\u0629-\\u0627\\u0644\\u0646\\u0635'", 
                     "'\\u0632\\u062E\\u0631\\u0641\\u0629-\\u0627\\u0644\\u0646\\u0635'", 
                     "'\\u062A\\u062D\\u0648\\u064A\\u0644-\\u0627\\u0644\\u0646\\u0635'", 
                     "'\\u0638\\u0644-\\u0627\\u0644\\u0646\\u0635'", "'\\u0625\\u0632\\u0627\\u062D\\u0629-\\u0627\\u0644\\u0646\\u0635'", 
                     "'\\u0627\\u0631\\u062A\\u0641\\u0627\\u0639-\\u0627\\u0644\\u0633\\u0637\\u0631'", 
                     "'\\u062A\\u0628\\u0627\\u0639\\u062F-\\u0627\\u0644\\u0623\\u062D\\u0631\\u0641'", 
                     "'\\u062A\\u0628\\u0627\\u0639\\u062F-\\u0627\\u0644\\u0643\\u0644\\u0645\\u0627\\u062A'", 
                     "'\\u0627\\u0644\\u0645\\u0633\\u0627\\u062D\\u0629-\\u0627\\u0644\\u0628\\u064A\\u0636\\u0627\\u0621'", 
                     "'\\u0627\\u062A\\u062C\\u0627\\u0647-\\u0627\\u0644\\u0643\\u062A\\u0627\\u0628\\u0629'", 
                     "'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u0643\\u062A\\u0627\\u0628\\u0629'", 
                     "'\\u0627\\u0646\\u062D\\u0646\\u0627\\u0621-\\u0627\\u0644\\u0625\\u0637\\u0627\\u0631'", 
                     "'\\u0633\\u0645\\u0643-\\u0627\\u0644\\u0625\\u0637\\u0627\\u0631'", 
                     "'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u0625\\u0637\\u0627\\u0631'", 
                     "'\\u0644\\u0648\\u0646-\\u0627\\u0644\\u0625\\u0637\\u0627\\u0631'", 
                     "'\\u062E\\u0637-\\u062E\\u0627\\u0631\\u062C\\u064A'", 
                     "'\\u0623\\u0639\\u0644\\u0649'", "'\\u0623\\u0633\\u0641\\u0644'", 
                     "'\\u064A\\u0645\\u064A\\u0646'", "'\\u064A\\u0633\\u0627\\u0631'", 
                     "'@\\u0648\\u0633\\u0627\\u0626\\u0637'", "'\\u0646\\u0645\\u0637-\\u0627\\u0644\\u0642\\u0627\\u0626\\u0645\\u0629'", 
                     "'\\u062F\\u0645\\u062C-\\u0627\\u0644\\u062D\\u062F\\u0648\\u062F'", 
                     "'\\u062A\\u0646\\u0633\\u064A\\u0642-\\u0627\\u0644\\u062C\\u062F\\u0648\\u0644'", 
                     "'\\u0645\\u0643\\u0627\\u0646-\\u0627\\u0644\\u0639\\u0646\\u0648\\u0627\\u0646'", 
                     "'\\u0645\\u0631\\u0634\\u062D'", "'\\u0645\\u0631\\u0634\\u062D-\\u0627\\u0644\\u062E\\u0644\\u0641\\u064A\\u0629'", 
                     "'\\u062D\\u0648\\u0645'", "'\\u0646\\u0634\\u0637'", 
                     "'\\u062A\\u0631\\u0643\\u064A\\u0632'", "'\\u062A\\u0645-\\u0632\\u064A\\u0627\\u0631\\u062A\\u0647'", 
                     "'\\u0645\\u0641\\u0639\\u0644'", "'\\u0645\\u0639\\u0637\\u0644'", 
                     "'\\u0645\\u062D\\u062F\\u062F'", "'\\u0642\\u0628\\u0644'", 
                     "'\\u0628\\u0639\\u062F'", "'\\u0646\\u0635-\\u0645\\u0624\\u0642\\u062A'", 
                     "'\\u062A\\u062D\\u062F\\u064A\\u062F'", "'\\u0648\\u0631\\u0627\\u062B\\u0629'", 
                     "'\\u0623\\u0648\\u0644\\u064A'", "'\\u063A\\u064A\\u0631 \\u0645\\u062D\\u062F\\u062F'", 
                     "'\\u0644\\u0627-\\u0634\\u064A\\u0621'", "'\\u062A\\u0644\\u0642\\u0627\\u0626\\u064A'", 
                     "'\\u0645\\u0631\\u0643\\u0632'", "'\\u0645\\u062A\\u0635\\u0644'", 
                     "'\\u0645\\u0642\\u0637\\u0639'", "'\\u0645\\u0646\\u0642\\u0637'", 
                     "'\\u0645\\u0632\\u062F\\u0648\\u062C'", "'\\u0645\\u062E\\u0641\\u064A'", 
                     "'\\u0643\\u062A\\u0644\\u0629'", "'\\u0633\\u0637\\u0631\\u064A'", 
                     "'\\u0645\\u0631\\u0648\\u0646\\u0629'", "'\\u0645\\u0637\\u0644\\u0642'", 
                     "'\\u0646\\u0633\\u0628\\u064A'", "'\\u062B\\u0627\\u0628\\u062A'", 
                     "'\\u0644\\u0627\\u0635\\u0642'", "'\\u0635\\u0641'", 
                     "'\\u0639\\u0645\\u0648\\u062F'", "'\\u0644\\u0641'", 
                     "'\\u0645\\u0624\\u0634\\u0631'", "'\\u0639\\u0631\\u064A\\u0636'", 
                     "'\\u0645\\u0627\\u0626\\u0644'", "'\\u0647\\u0627\\u0645'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'\\u0631\\u0627\\u0628\\u0637'", "'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628'", 
                     "'\\u0646\\u0638\\u0627\\u0645-\\u0631_\\u062C_\\u0628_\\u0627'", 
                     "'\\u062D\\u0633\\u0627\\u0628'", "'\\u0645\\u062A\\u063A\\u064A\\u0631'", 
                     "'\\u062A\\u062F\\u0648\\u064A\\u0631'", "'\\u062A\\u0643\\u0628\\u064A\\u0631'", 
                     "'\\u062A\\u063A\\u0628\\u064A\\u0634'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'{'", "'}'", "':'", "'\\u061B'", 
                     "'\\u060C'", "'.'", "'#'", "'('", "')'", "'+'", "'-'", 
                     "'*'", "'/'", "'%'", "'>'", "'<'", "'~'", "'!'", "'::'" ]

    symbolicNames = [ "<INVALID>", "CLOSE_TAG", "OPEN_TAG", "TEXT", "DISPLAY", 
                      "POSITION", "WIDTH", "HEIGHT", "MAX_WIDTH", "MIN_WIDTH", 
                      "MAX_HEIGHT", "MIN_HEIGHT", "MARGIN", "PADDING", "BORDER", 
                      "VISIBILITY", "OVERFLOW", "Z_INDEX", "BOX_SIZING", 
                      "FLEX", "FLEX_DIR", "FLEX_WRAP", "FLEX_GROW", "FLEX_SHRINK", 
                      "GRID", "GRID_TEMPLATE", "GAP", "JUSTIFY_CONT", "ALIGN_ITEMS", 
                      "ALIGN_SELF", "ORDER", "COLOR", "BACKGROUND", "BG_IMAGE", 
                      "BG_COLOR", "BG_SIZE", "BG_REPEAT", "BG_ATTACH", "BG_CLIP", 
                      "OPACITY", "BOX_SHADOW", "FONT_FAMILY", "FONT_SIZE", 
                      "FONT_WEIGHT", "FONT_STYLE", "TEXT_ALIGN", "TEXT_DECOR", 
                      "TEXT_TRANS", "TEXT_SHADOW", "TEXT_INDENT", "LINE_HEIGHT", 
                      "LETTER_SPACING", "WORD_SPACING", "WHITE_SPACE", "DIRECTION", 
                      "WRITING_MODE", "BORDER_RADIUS", "BORDER_WIDTH", "BORDER_STYLE", 
                      "BORDER_COLOR", "OUTLINE", "TOP", "BOTTOM", "RIGHT", 
                      "LEFT", "MEDIA", "LIST_STYLE", "BORDER_COLLAPSE", 
                      "TABLE_LAYOUT", "CAPTION_SIDE", "FILTER", "BACKDROP_FILT", 
                      "HOVER", "ACTIVE", "FOCUS", "VISITED", "ENABLED", 
                      "DISABLED", "CHECKED", "BEFORE", "AFTER", "PLACEHOLDER", 
                      "SELECTION", "INHERIT", "INITIAL", "UNSET", "NONE", 
                      "AUTO", "CENTER", "SOLID", "DASHED", "DOTTED", "DOUBLE", 
                      "KW_HIDDEN", "BLOCK", "INLINE", "FLEX_VALUE", "ABSOLUTE", 
                      "RELATIVE", "FIXED", "STICKY", "ROW", "COLUMN", "WRAP", 
                      "POINTER", "BOLD", "ITALIC", "IMPORTANT", "UNIT", 
                      "NUMBER", "HEX_COLOR", "IDENTIFIER", "STRING", "URL_FUNC", 
                      "RGB_FUNC", "RGBA_FUNC", "CALC_FUNC", "VAR_FUNC", 
                      "ROTATE_FUNC", "SCALE_FUNC", "BLUR_FUNC", "WS", "COMMENT", 
                      "LINE_COMMENT", "LBRACE", "RBRACE", "COLON", "SEMI", 
                      "COMMA", "DOT", "HASH", "LPAREN", "RPAREN", "PLUS", 
                      "MINUS", "STAR", "SLASH", "PERCENT", "GT", "LT", "TILDE", 
                      "BANG", "DBL_COLON" ]

    RULE_document = 0
    RULE_element = 1
    RULE_tagElement = 2
    RULE_statement = 3
    RULE_mediaRule = 4
    RULE_mediaQueryList = 5
    RULE_mediaQuery = 6
    RULE_mediaExpr = 7
    RULE_ruleset = 8
    RULE_selectorList = 9
    RULE_selector = 10
    RULE_combinator = 11
    RULE_compoundSelector = 12
    RULE_className = 13
    RULE_idName = 14
    RULE_simpleSelector = 15
    RULE_pseudoClass = 16
    RULE_pseudoElement = 17
    RULE_declarationList = 18
    RULE_declaration = 19
    RULE_exprModifier = 20
    RULE_property = 21
    RULE_value = 22
    RULE_expr = 23
    RULE_term = 24
    RULE_dimension = 25
    RULE_keywordValue = 26
    RULE_functionCall = 27
    RULE_functionName = 28
    RULE_arguments = 29

    ruleNames =  [ "document", "element", "tagElement", "statement", "mediaRule", 
                   "mediaQueryList", "mediaQuery", "mediaExpr", "ruleset", 
                   "selectorList", "selector", "combinator", "compoundSelector", 
                   "className", "idName", "simpleSelector", "pseudoClass", 
                   "pseudoElement", "declarationList", "declaration", "exprModifier", 
                   "property", "value", "expr", "term", "dimension", "keywordValue", 
                   "functionCall", "functionName", "arguments" ]

    EOF = Token.EOF
    CLOSE_TAG=1
    OPEN_TAG=2
    TEXT=3
    DISPLAY=4
    POSITION=5
    WIDTH=6
    HEIGHT=7
    MAX_WIDTH=8
    MIN_WIDTH=9
    MAX_HEIGHT=10
    MIN_HEIGHT=11
    MARGIN=12
    PADDING=13
    BORDER=14
    VISIBILITY=15
    OVERFLOW=16
    Z_INDEX=17
    BOX_SIZING=18
    FLEX=19
    FLEX_DIR=20
    FLEX_WRAP=21
    FLEX_GROW=22
    FLEX_SHRINK=23
    GRID=24
    GRID_TEMPLATE=25
    GAP=26
    JUSTIFY_CONT=27
    ALIGN_ITEMS=28
    ALIGN_SELF=29
    ORDER=30
    COLOR=31
    BACKGROUND=32
    BG_IMAGE=33
    BG_COLOR=34
    BG_SIZE=35
    BG_REPEAT=36
    BG_ATTACH=37
    BG_CLIP=38
    OPACITY=39
    BOX_SHADOW=40
    FONT_FAMILY=41
    FONT_SIZE=42
    FONT_WEIGHT=43
    FONT_STYLE=44
    TEXT_ALIGN=45
    TEXT_DECOR=46
    TEXT_TRANS=47
    TEXT_SHADOW=48
    TEXT_INDENT=49
    LINE_HEIGHT=50
    LETTER_SPACING=51
    WORD_SPACING=52
    WHITE_SPACE=53
    DIRECTION=54
    WRITING_MODE=55
    BORDER_RADIUS=56
    BORDER_WIDTH=57
    BORDER_STYLE=58
    BORDER_COLOR=59
    OUTLINE=60
    TOP=61
    BOTTOM=62
    RIGHT=63
    LEFT=64
    MEDIA=65
    LIST_STYLE=66
    BORDER_COLLAPSE=67
    TABLE_LAYOUT=68
    CAPTION_SIDE=69
    FILTER=70
    BACKDROP_FILT=71
    HOVER=72
    ACTIVE=73
    FOCUS=74
    VISITED=75
    ENABLED=76
    DISABLED=77
    CHECKED=78
    BEFORE=79
    AFTER=80
    PLACEHOLDER=81
    SELECTION=82
    INHERIT=83
    INITIAL=84
    UNSET=85
    NONE=86
    AUTO=87
    CENTER=88
    SOLID=89
    DASHED=90
    DOTTED=91
    DOUBLE=92
    KW_HIDDEN=93
    BLOCK=94
    INLINE=95
    FLEX_VALUE=96
    ABSOLUTE=97
    RELATIVE=98
    FIXED=99
    STICKY=100
    ROW=101
    COLUMN=102
    WRAP=103
    POINTER=104
    BOLD=105
    ITALIC=106
    IMPORTANT=107
    UNIT=108
    NUMBER=109
    HEX_COLOR=110
    IDENTIFIER=111
    STRING=112
    URL_FUNC=113
    RGB_FUNC=114
    RGBA_FUNC=115
    CALC_FUNC=116
    VAR_FUNC=117
    ROTATE_FUNC=118
    SCALE_FUNC=119
    BLUR_FUNC=120
    WS=121
    COMMENT=122
    LINE_COMMENT=123
    LBRACE=124
    RBRACE=125
    COLON=126
    SEMI=127
    COMMA=128
    DOT=129
    HASH=130
    LPAREN=131
    RPAREN=132
    PLUS=133
    MINUS=134
    STAR=135
    SLASH=136
    PERCENT=137
    GT=138
    LT=139
    TILDE=140
    BANG=141
    DBL_COLON=142

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DocumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ArabicWebParser.EOF, 0)

        def element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.ElementContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.ElementContext,i)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.StatementContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.StatementContext,i)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_document

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDocument" ):
                listener.enterDocument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDocument" ):
                listener.exitDocument(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDocument" ):
                return visitor.visitDocument(self)
            else:
                return visitor.visitChildren(self)




    def document(self):

        localctx = ArabicWebParser.DocumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_document)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 2)) & ~0x3f) == 0 and ((1 << (_la - 2)) & -9223372036854775805) != 0) or ((((_la - 111)) & ~0x3f) == 0 and ((1 << (_la - 111)) & 2165080065) != 0):
                self.state = 62
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [2, 3]:
                    self.state = 60
                    self.element()
                    pass
                elif token in [65, 111, 126, 129, 130, 135, 142]:
                    self.state = 61
                    self.statement()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 66
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 67
            self.match(ArabicWebParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tagElement(self):
            return self.getTypedRuleContext(ArabicWebParser.TagElementContext,0)


        def TEXT(self):
            return self.getToken(ArabicWebParser.TEXT, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_element

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElement" ):
                listener.enterElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElement" ):
                listener.exitElement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElement" ):
                return visitor.visitElement(self)
            else:
                return visitor.visitChildren(self)




    def element(self):

        localctx = ArabicWebParser.ElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_element)
        try:
            self.state = 71
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 69
                self.tagElement()
                pass
            elif token in [3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 70
                self.match(ArabicWebParser.TEXT)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TagElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_TAG(self):
            return self.getToken(ArabicWebParser.OPEN_TAG, 0)

        def CLOSE_TAG(self):
            return self.getToken(ArabicWebParser.CLOSE_TAG, 0)

        def element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.ElementContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.ElementContext,i)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_tagElement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTagElement" ):
                listener.enterTagElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTagElement" ):
                listener.exitTagElement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTagElement" ):
                return visitor.visitTagElement(self)
            else:
                return visitor.visitChildren(self)




    def tagElement(self):

        localctx = ArabicWebParser.TagElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_tagElement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.match(ArabicWebParser.OPEN_TAG)
            self.state = 77
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==2 or _la==3:
                self.state = 74
                self.element()
                self.state = 79
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 80
            self.match(ArabicWebParser.CLOSE_TAG)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ruleset(self):
            return self.getTypedRuleContext(ArabicWebParser.RulesetContext,0)


        def mediaRule(self):
            return self.getTypedRuleContext(ArabicWebParser.MediaRuleContext,0)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = ArabicWebParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_statement)
        try:
            self.state = 84
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [111, 126, 129, 130, 135, 142]:
                self.enterOuterAlt(localctx, 1)
                self.state = 82
                self.ruleset()
                pass
            elif token in [65]:
                self.enterOuterAlt(localctx, 2)
                self.state = 83
                self.mediaRule()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MediaRuleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MEDIA(self):
            return self.getToken(ArabicWebParser.MEDIA, 0)

        def mediaQueryList(self):
            return self.getTypedRuleContext(ArabicWebParser.MediaQueryListContext,0)


        def LBRACE(self):
            return self.getToken(ArabicWebParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(ArabicWebParser.RBRACE, 0)

        def ruleset(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.RulesetContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.RulesetContext,i)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_mediaRule

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMediaRule" ):
                listener.enterMediaRule(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMediaRule" ):
                listener.exitMediaRule(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMediaRule" ):
                return visitor.visitMediaRule(self)
            else:
                return visitor.visitChildren(self)




    def mediaRule(self):

        localctx = ArabicWebParser.MediaRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_mediaRule)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.match(ArabicWebParser.MEDIA)
            self.state = 87
            self.mediaQueryList()
            self.state = 88
            self.match(ArabicWebParser.LBRACE)
            self.state = 92
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 111)) & ~0x3f) == 0 and ((1 << (_la - 111)) & 2165080065) != 0):
                self.state = 89
                self.ruleset()
                self.state = 94
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 95
            self.match(ArabicWebParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MediaQueryListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def mediaQuery(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.MediaQueryContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.MediaQueryContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(ArabicWebParser.COMMA)
            else:
                return self.getToken(ArabicWebParser.COMMA, i)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_mediaQueryList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMediaQueryList" ):
                listener.enterMediaQueryList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMediaQueryList" ):
                listener.exitMediaQueryList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMediaQueryList" ):
                return visitor.visitMediaQueryList(self)
            else:
                return visitor.visitChildren(self)




    def mediaQueryList(self):

        localctx = ArabicWebParser.MediaQueryListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_mediaQueryList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 97
            self.mediaQuery()
            self.state = 102
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==128:
                self.state = 98
                self.match(ArabicWebParser.COMMA)
                self.state = 99
                self.mediaQuery()
                self.state = 104
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MediaQueryContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def mediaExpr(self):
            return self.getTypedRuleContext(ArabicWebParser.MediaExprContext,0)


        def IDENTIFIER(self):
            return self.getToken(ArabicWebParser.IDENTIFIER, 0)

        def KW_HIDDEN(self):
            return self.getToken(ArabicWebParser.KW_HIDDEN, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_mediaQuery

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMediaQuery" ):
                listener.enterMediaQuery(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMediaQuery" ):
                listener.exitMediaQuery(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMediaQuery" ):
                return visitor.visitMediaQuery(self)
            else:
                return visitor.visitChildren(self)




    def mediaQuery(self):

        localctx = ArabicWebParser.MediaQueryContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_mediaQuery)
        self._la = 0 # Token type
        try:
            self.state = 111
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [131]:
                self.enterOuterAlt(localctx, 1)
                self.state = 105
                self.mediaExpr()
                pass
            elif token in [111]:
                self.enterOuterAlt(localctx, 2)
                self.state = 106
                self.match(ArabicWebParser.IDENTIFIER)
                self.state = 109
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==93:
                    self.state = 107
                    self.match(ArabicWebParser.KW_HIDDEN)
                    self.state = 108
                    self.mediaExpr()


                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MediaExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LPAREN(self):
            return self.getToken(ArabicWebParser.LPAREN, 0)

        def property_(self):
            return self.getTypedRuleContext(ArabicWebParser.PropertyContext,0)


        def COLON(self):
            return self.getToken(ArabicWebParser.COLON, 0)

        def value(self):
            return self.getTypedRuleContext(ArabicWebParser.ValueContext,0)


        def RPAREN(self):
            return self.getToken(ArabicWebParser.RPAREN, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_mediaExpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMediaExpr" ):
                listener.enterMediaExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMediaExpr" ):
                listener.exitMediaExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMediaExpr" ):
                return visitor.visitMediaExpr(self)
            else:
                return visitor.visitChildren(self)




    def mediaExpr(self):

        localctx = ArabicWebParser.MediaExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_mediaExpr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.match(ArabicWebParser.LPAREN)
            self.state = 114
            self.property_()
            self.state = 115
            self.match(ArabicWebParser.COLON)
            self.state = 116
            self.value()
            self.state = 117
            self.match(ArabicWebParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RulesetContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def selectorList(self):
            return self.getTypedRuleContext(ArabicWebParser.SelectorListContext,0)


        def LBRACE(self):
            return self.getToken(ArabicWebParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(ArabicWebParser.RBRACE, 0)

        def declarationList(self):
            return self.getTypedRuleContext(ArabicWebParser.DeclarationListContext,0)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_ruleset

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRuleset" ):
                listener.enterRuleset(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRuleset" ):
                listener.exitRuleset(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRuleset" ):
                return visitor.visitRuleset(self)
            else:
                return visitor.visitChildren(self)




    def ruleset(self):

        localctx = ArabicWebParser.RulesetContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_ruleset)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 119
            self.selectorList()
            self.state = 120
            self.match(ArabicWebParser.LBRACE)
            self.state = 122
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & -16) != 0) or ((((_la - 64)) & ~0x3f) == 0 and ((1 << (_la - 64)) & 140737488355581) != 0):
                self.state = 121
                self.declarationList()


            self.state = 124
            self.match(ArabicWebParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelectorListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def selector(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.SelectorContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.SelectorContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(ArabicWebParser.COMMA)
            else:
                return self.getToken(ArabicWebParser.COMMA, i)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_selectorList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelectorList" ):
                listener.enterSelectorList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelectorList" ):
                listener.exitSelectorList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelectorList" ):
                return visitor.visitSelectorList(self)
            else:
                return visitor.visitChildren(self)




    def selectorList(self):

        localctx = ArabicWebParser.SelectorListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_selectorList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 126
            self.selector()
            self.state = 131
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==128:
                self.state = 127
                self.match(ArabicWebParser.COMMA)
                self.state = 128
                self.selector()
                self.state = 133
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelectorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def compoundSelector(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.CompoundSelectorContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.CompoundSelectorContext,i)


        def combinator(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.CombinatorContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.CombinatorContext,i)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_selector

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelector" ):
                listener.enterSelector(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelector" ):
                listener.exitSelector(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelector" ):
                return visitor.visitSelector(self)
            else:
                return visitor.visitChildren(self)




    def selector(self):

        localctx = ArabicWebParser.SelectorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_selector)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 134
            self.compoundSelector()
            self.state = 140
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 133)) & ~0x3f) == 0 and ((1 << (_la - 133)) & 161) != 0):
                self.state = 135
                self.combinator()
                self.state = 136
                self.compoundSelector()
                self.state = 142
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CombinatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GT(self):
            return self.getToken(ArabicWebParser.GT, 0)

        def PLUS(self):
            return self.getToken(ArabicWebParser.PLUS, 0)

        def TILDE(self):
            return self.getToken(ArabicWebParser.TILDE, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_combinator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCombinator" ):
                listener.enterCombinator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCombinator" ):
                listener.exitCombinator(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCombinator" ):
                return visitor.visitCombinator(self)
            else:
                return visitor.visitChildren(self)




    def combinator(self):

        localctx = ArabicWebParser.CombinatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_combinator)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 143
            _la = self._input.LA(1)
            if not(((((_la - 133)) & ~0x3f) == 0 and ((1 << (_la - 133)) & 161) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CompoundSelectorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def simpleSelector(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.SimpleSelectorContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.SimpleSelectorContext,i)


        def pseudoElement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.PseudoElementContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.PseudoElementContext,i)


        def pseudoClass(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.PseudoClassContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.PseudoClassContext,i)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_compoundSelector

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCompoundSelector" ):
                listener.enterCompoundSelector(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCompoundSelector" ):
                listener.exitCompoundSelector(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompoundSelector" ):
                return visitor.visitCompoundSelector(self)
            else:
                return visitor.visitChildren(self)




    def compoundSelector(self):

        localctx = ArabicWebParser.CompoundSelectorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_compoundSelector)
        self._la = 0 # Token type
        try:
            self.state = 163
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 147
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [111, 129, 130, 135]:
                    self.state = 145
                    self.simpleSelector()
                    pass
                elif token in [142]:
                    self.state = 146
                    self.pseudoElement()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 154
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while ((((_la - 111)) & ~0x3f) == 0 and ((1 << (_la - 111)) & 2165080065) != 0):
                    self.state = 152
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [111, 129, 130, 135]:
                        self.state = 149
                        self.simpleSelector()
                        pass
                    elif token in [126]:
                        self.state = 150
                        self.pseudoClass()
                        pass
                    elif token in [142]:
                        self.state = 151
                        self.pseudoElement()
                        pass
                    else:
                        raise NoViableAltException(self)

                    self.state = 156
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 159 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 159
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [126]:
                        self.state = 157
                        self.pseudoClass()
                        pass
                    elif token in [142]:
                        self.state = 158
                        self.pseudoElement()
                        pass
                    else:
                        raise NoViableAltException(self)

                    self.state = 161 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==126 or _la==142):
                        break

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DOT(self):
            return self.getToken(ArabicWebParser.DOT, 0)

        def IDENTIFIER(self):
            return self.getToken(ArabicWebParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_className

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClassName" ):
                listener.enterClassName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClassName" ):
                listener.exitClassName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClassName" ):
                return visitor.visitClassName(self)
            else:
                return visitor.visitChildren(self)




    def className(self):

        localctx = ArabicWebParser.ClassNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_className)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 165
            self.match(ArabicWebParser.DOT)
            self.state = 166
            self.match(ArabicWebParser.IDENTIFIER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IdNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def HASH(self):
            return self.getToken(ArabicWebParser.HASH, 0)

        def IDENTIFIER(self):
            return self.getToken(ArabicWebParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_idName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIdName" ):
                listener.enterIdName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIdName" ):
                listener.exitIdName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIdName" ):
                return visitor.visitIdName(self)
            else:
                return visitor.visitChildren(self)




    def idName(self):

        localctx = ArabicWebParser.IdNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_idName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 168
            self.match(ArabicWebParser.HASH)
            self.state = 169
            self.match(ArabicWebParser.IDENTIFIER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SimpleSelectorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(ArabicWebParser.IDENTIFIER, 0)

        def idName(self):
            return self.getTypedRuleContext(ArabicWebParser.IdNameContext,0)


        def className(self):
            return self.getTypedRuleContext(ArabicWebParser.ClassNameContext,0)


        def STAR(self):
            return self.getToken(ArabicWebParser.STAR, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_simpleSelector

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSimpleSelector" ):
                listener.enterSimpleSelector(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSimpleSelector" ):
                listener.exitSimpleSelector(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSimpleSelector" ):
                return visitor.visitSimpleSelector(self)
            else:
                return visitor.visitChildren(self)




    def simpleSelector(self):

        localctx = ArabicWebParser.SimpleSelectorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_simpleSelector)
        try:
            self.state = 175
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [111]:
                self.enterOuterAlt(localctx, 1)
                self.state = 171
                self.match(ArabicWebParser.IDENTIFIER)
                pass
            elif token in [130]:
                self.enterOuterAlt(localctx, 2)
                self.state = 172
                self.idName()
                pass
            elif token in [129]:
                self.enterOuterAlt(localctx, 3)
                self.state = 173
                self.className()
                pass
            elif token in [135]:
                self.enterOuterAlt(localctx, 4)
                self.state = 174
                self.match(ArabicWebParser.STAR)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PseudoClassContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COLON(self):
            return self.getToken(ArabicWebParser.COLON, 0)

        def HOVER(self):
            return self.getToken(ArabicWebParser.HOVER, 0)

        def ACTIVE(self):
            return self.getToken(ArabicWebParser.ACTIVE, 0)

        def FOCUS(self):
            return self.getToken(ArabicWebParser.FOCUS, 0)

        def VISITED(self):
            return self.getToken(ArabicWebParser.VISITED, 0)

        def ENABLED(self):
            return self.getToken(ArabicWebParser.ENABLED, 0)

        def DISABLED(self):
            return self.getToken(ArabicWebParser.DISABLED, 0)

        def CHECKED(self):
            return self.getToken(ArabicWebParser.CHECKED, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_pseudoClass

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPseudoClass" ):
                listener.enterPseudoClass(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPseudoClass" ):
                listener.exitPseudoClass(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPseudoClass" ):
                return visitor.visitPseudoClass(self)
            else:
                return visitor.visitChildren(self)




    def pseudoClass(self):

        localctx = ArabicWebParser.PseudoClassContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_pseudoClass)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 177
            self.match(ArabicWebParser.COLON)
            self.state = 178
            _la = self._input.LA(1)
            if not(((((_la - 72)) & ~0x3f) == 0 and ((1 << (_la - 72)) & 127) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PseudoElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DBL_COLON(self):
            return self.getToken(ArabicWebParser.DBL_COLON, 0)

        def BEFORE(self):
            return self.getToken(ArabicWebParser.BEFORE, 0)

        def AFTER(self):
            return self.getToken(ArabicWebParser.AFTER, 0)

        def PLACEHOLDER(self):
            return self.getToken(ArabicWebParser.PLACEHOLDER, 0)

        def SELECTION(self):
            return self.getToken(ArabicWebParser.SELECTION, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_pseudoElement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPseudoElement" ):
                listener.enterPseudoElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPseudoElement" ):
                listener.exitPseudoElement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPseudoElement" ):
                return visitor.visitPseudoElement(self)
            else:
                return visitor.visitChildren(self)




    def pseudoElement(self):

        localctx = ArabicWebParser.PseudoElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_pseudoElement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 180
            self.match(ArabicWebParser.DBL_COLON)
            self.state = 181
            _la = self._input.LA(1)
            if not(((((_la - 79)) & ~0x3f) == 0 and ((1 << (_la - 79)) & 15) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclarationListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.DeclarationContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.DeclarationContext,i)


        def SEMI(self, i:int=None):
            if i is None:
                return self.getTokens(ArabicWebParser.SEMI)
            else:
                return self.getToken(ArabicWebParser.SEMI, i)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_declarationList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclarationList" ):
                listener.enterDeclarationList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclarationList" ):
                listener.exitDeclarationList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclarationList" ):
                return visitor.visitDeclarationList(self)
            else:
                return visitor.visitChildren(self)




    def declarationList(self):

        localctx = ArabicWebParser.DeclarationListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_declarationList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 183
            self.declaration()
            self.state = 188
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,19,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 184
                    self.match(ArabicWebParser.SEMI)
                    self.state = 185
                    self.declaration() 
                self.state = 190
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,19,self._ctx)

            self.state = 192
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==127:
                self.state = 191
                self.match(ArabicWebParser.SEMI)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def property_(self):
            return self.getTypedRuleContext(ArabicWebParser.PropertyContext,0)


        def COLON(self):
            return self.getToken(ArabicWebParser.COLON, 0)

        def value(self):
            return self.getTypedRuleContext(ArabicWebParser.ValueContext,0)


        def exprModifier(self):
            return self.getTypedRuleContext(ArabicWebParser.ExprModifierContext,0)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_declaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclaration" ):
                listener.enterDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclaration" ):
                listener.exitDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaration" ):
                return visitor.visitDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def declaration(self):

        localctx = ArabicWebParser.DeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_declaration)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 194
            self.property_()
            self.state = 195
            self.match(ArabicWebParser.COLON)
            self.state = 196
            self.value()
            self.state = 198
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==107:
                self.state = 197
                self.exprModifier()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprModifierContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IMPORTANT(self):
            return self.getToken(ArabicWebParser.IMPORTANT, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_exprModifier

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprModifier" ):
                listener.enterExprModifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprModifier" ):
                listener.exitExprModifier(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprModifier" ):
                return visitor.visitExprModifier(self)
            else:
                return visitor.visitChildren(self)




    def exprModifier(self):

        localctx = ArabicWebParser.ExprModifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_exprModifier)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 200
            self.match(ArabicWebParser.IMPORTANT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DISPLAY(self):
            return self.getToken(ArabicWebParser.DISPLAY, 0)

        def POSITION(self):
            return self.getToken(ArabicWebParser.POSITION, 0)

        def WIDTH(self):
            return self.getToken(ArabicWebParser.WIDTH, 0)

        def HEIGHT(self):
            return self.getToken(ArabicWebParser.HEIGHT, 0)

        def MAX_WIDTH(self):
            return self.getToken(ArabicWebParser.MAX_WIDTH, 0)

        def MIN_WIDTH(self):
            return self.getToken(ArabicWebParser.MIN_WIDTH, 0)

        def MAX_HEIGHT(self):
            return self.getToken(ArabicWebParser.MAX_HEIGHT, 0)

        def MIN_HEIGHT(self):
            return self.getToken(ArabicWebParser.MIN_HEIGHT, 0)

        def MARGIN(self):
            return self.getToken(ArabicWebParser.MARGIN, 0)

        def PADDING(self):
            return self.getToken(ArabicWebParser.PADDING, 0)

        def BORDER(self):
            return self.getToken(ArabicWebParser.BORDER, 0)

        def VISIBILITY(self):
            return self.getToken(ArabicWebParser.VISIBILITY, 0)

        def OVERFLOW(self):
            return self.getToken(ArabicWebParser.OVERFLOW, 0)

        def Z_INDEX(self):
            return self.getToken(ArabicWebParser.Z_INDEX, 0)

        def BOX_SIZING(self):
            return self.getToken(ArabicWebParser.BOX_SIZING, 0)

        def FLEX(self):
            return self.getToken(ArabicWebParser.FLEX, 0)

        def FLEX_DIR(self):
            return self.getToken(ArabicWebParser.FLEX_DIR, 0)

        def FLEX_WRAP(self):
            return self.getToken(ArabicWebParser.FLEX_WRAP, 0)

        def FLEX_GROW(self):
            return self.getToken(ArabicWebParser.FLEX_GROW, 0)

        def FLEX_SHRINK(self):
            return self.getToken(ArabicWebParser.FLEX_SHRINK, 0)

        def GRID(self):
            return self.getToken(ArabicWebParser.GRID, 0)

        def GRID_TEMPLATE(self):
            return self.getToken(ArabicWebParser.GRID_TEMPLATE, 0)

        def GAP(self):
            return self.getToken(ArabicWebParser.GAP, 0)

        def JUSTIFY_CONT(self):
            return self.getToken(ArabicWebParser.JUSTIFY_CONT, 0)

        def ALIGN_ITEMS(self):
            return self.getToken(ArabicWebParser.ALIGN_ITEMS, 0)

        def ALIGN_SELF(self):
            return self.getToken(ArabicWebParser.ALIGN_SELF, 0)

        def ORDER(self):
            return self.getToken(ArabicWebParser.ORDER, 0)

        def COLOR(self):
            return self.getToken(ArabicWebParser.COLOR, 0)

        def BACKGROUND(self):
            return self.getToken(ArabicWebParser.BACKGROUND, 0)

        def BG_IMAGE(self):
            return self.getToken(ArabicWebParser.BG_IMAGE, 0)

        def BG_COLOR(self):
            return self.getToken(ArabicWebParser.BG_COLOR, 0)

        def BG_SIZE(self):
            return self.getToken(ArabicWebParser.BG_SIZE, 0)

        def BG_REPEAT(self):
            return self.getToken(ArabicWebParser.BG_REPEAT, 0)

        def BG_ATTACH(self):
            return self.getToken(ArabicWebParser.BG_ATTACH, 0)

        def BG_CLIP(self):
            return self.getToken(ArabicWebParser.BG_CLIP, 0)

        def OPACITY(self):
            return self.getToken(ArabicWebParser.OPACITY, 0)

        def BOX_SHADOW(self):
            return self.getToken(ArabicWebParser.BOX_SHADOW, 0)

        def FONT_FAMILY(self):
            return self.getToken(ArabicWebParser.FONT_FAMILY, 0)

        def FONT_SIZE(self):
            return self.getToken(ArabicWebParser.FONT_SIZE, 0)

        def FONT_WEIGHT(self):
            return self.getToken(ArabicWebParser.FONT_WEIGHT, 0)

        def FONT_STYLE(self):
            return self.getToken(ArabicWebParser.FONT_STYLE, 0)

        def TEXT_ALIGN(self):
            return self.getToken(ArabicWebParser.TEXT_ALIGN, 0)

        def TEXT_DECOR(self):
            return self.getToken(ArabicWebParser.TEXT_DECOR, 0)

        def TEXT_TRANS(self):
            return self.getToken(ArabicWebParser.TEXT_TRANS, 0)

        def TEXT_SHADOW(self):
            return self.getToken(ArabicWebParser.TEXT_SHADOW, 0)

        def TEXT_INDENT(self):
            return self.getToken(ArabicWebParser.TEXT_INDENT, 0)

        def LINE_HEIGHT(self):
            return self.getToken(ArabicWebParser.LINE_HEIGHT, 0)

        def LETTER_SPACING(self):
            return self.getToken(ArabicWebParser.LETTER_SPACING, 0)

        def WORD_SPACING(self):
            return self.getToken(ArabicWebParser.WORD_SPACING, 0)

        def WHITE_SPACE(self):
            return self.getToken(ArabicWebParser.WHITE_SPACE, 0)

        def DIRECTION(self):
            return self.getToken(ArabicWebParser.DIRECTION, 0)

        def WRITING_MODE(self):
            return self.getToken(ArabicWebParser.WRITING_MODE, 0)

        def BORDER_RADIUS(self):
            return self.getToken(ArabicWebParser.BORDER_RADIUS, 0)

        def BORDER_WIDTH(self):
            return self.getToken(ArabicWebParser.BORDER_WIDTH, 0)

        def BORDER_STYLE(self):
            return self.getToken(ArabicWebParser.BORDER_STYLE, 0)

        def BORDER_COLOR(self):
            return self.getToken(ArabicWebParser.BORDER_COLOR, 0)

        def OUTLINE(self):
            return self.getToken(ArabicWebParser.OUTLINE, 0)

        def TOP(self):
            return self.getToken(ArabicWebParser.TOP, 0)

        def BOTTOM(self):
            return self.getToken(ArabicWebParser.BOTTOM, 0)

        def RIGHT(self):
            return self.getToken(ArabicWebParser.RIGHT, 0)

        def LEFT(self):
            return self.getToken(ArabicWebParser.LEFT, 0)

        def LIST_STYLE(self):
            return self.getToken(ArabicWebParser.LIST_STYLE, 0)

        def BORDER_COLLAPSE(self):
            return self.getToken(ArabicWebParser.BORDER_COLLAPSE, 0)

        def TABLE_LAYOUT(self):
            return self.getToken(ArabicWebParser.TABLE_LAYOUT, 0)

        def CAPTION_SIDE(self):
            return self.getToken(ArabicWebParser.CAPTION_SIDE, 0)

        def FILTER(self):
            return self.getToken(ArabicWebParser.FILTER, 0)

        def BACKDROP_FILT(self):
            return self.getToken(ArabicWebParser.BACKDROP_FILT, 0)

        def IDENTIFIER(self):
            return self.getToken(ArabicWebParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_property

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProperty" ):
                listener.enterProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProperty" ):
                listener.exitProperty(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProperty" ):
                return visitor.visitProperty(self)
            else:
                return visitor.visitChildren(self)




    def property_(self):

        localctx = ArabicWebParser.PropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_property)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 202
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & -16) != 0) or ((((_la - 64)) & ~0x3f) == 0 and ((1 << (_la - 64)) & 140737488355581) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.ExprContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.ExprContext,i)


        def getRuleIndex(self):
            return ArabicWebParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValue" ):
                return visitor.visitValue(self)
            else:
                return visitor.visitChildren(self)




    def value(self):

        localctx = ArabicWebParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_value)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 204
            self.expr()
            self.state = 208
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 83)) & ~0x3f) == 0 and ((1 << (_la - 83)) & 274827575295) != 0):
                self.state = 205
                self.expr()
                self.state = 210
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.TermContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.TermContext,i)


        def PLUS(self):
            return self.getToken(ArabicWebParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(ArabicWebParser.MINUS, 0)

        def STAR(self):
            return self.getToken(ArabicWebParser.STAR, 0)

        def SLASH(self):
            return self.getToken(ArabicWebParser.SLASH, 0)

        def PERCENT(self):
            return self.getToken(ArabicWebParser.PERCENT, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)




    def expr(self):

        localctx = ArabicWebParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.state = 216
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,23,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 211
                self.term()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 212
                self.term()
                self.state = 213
                _la = self._input.LA(1)
                if not(((((_la - 133)) & ~0x3f) == 0 and ((1 << (_la - 133)) & 31) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 214
                self.term()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def dimension(self):
            return self.getTypedRuleContext(ArabicWebParser.DimensionContext,0)


        def keywordValue(self):
            return self.getTypedRuleContext(ArabicWebParser.KeywordValueContext,0)


        def HEX_COLOR(self):
            return self.getToken(ArabicWebParser.HEX_COLOR, 0)

        def STRING(self):
            return self.getToken(ArabicWebParser.STRING, 0)

        def functionCall(self):
            return self.getTypedRuleContext(ArabicWebParser.FunctionCallContext,0)


        def IDENTIFIER(self):
            return self.getToken(ArabicWebParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_term

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm" ):
                listener.enterTerm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm" ):
                listener.exitTerm(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTerm" ):
                return visitor.visitTerm(self)
            else:
                return visitor.visitChildren(self)




    def term(self):

        localctx = ArabicWebParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_term)
        try:
            self.state = 224
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [109]:
                self.enterOuterAlt(localctx, 1)
                self.state = 218
                self.dimension()
                pass
            elif token in [83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106]:
                self.enterOuterAlt(localctx, 2)
                self.state = 219
                self.keywordValue()
                pass
            elif token in [110]:
                self.enterOuterAlt(localctx, 3)
                self.state = 220
                self.match(ArabicWebParser.HEX_COLOR)
                pass
            elif token in [112]:
                self.enterOuterAlt(localctx, 4)
                self.state = 221
                self.match(ArabicWebParser.STRING)
                pass
            elif token in [113, 114, 115, 116, 117, 118, 119, 120]:
                self.enterOuterAlt(localctx, 5)
                self.state = 222
                self.functionCall()
                pass
            elif token in [111]:
                self.enterOuterAlt(localctx, 6)
                self.state = 223
                self.match(ArabicWebParser.IDENTIFIER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DimensionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(ArabicWebParser.NUMBER, 0)

        def UNIT(self):
            return self.getToken(ArabicWebParser.UNIT, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_dimension

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDimension" ):
                listener.enterDimension(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDimension" ):
                listener.exitDimension(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDimension" ):
                return visitor.visitDimension(self)
            else:
                return visitor.visitChildren(self)




    def dimension(self):

        localctx = ArabicWebParser.DimensionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_dimension)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 226
            self.match(ArabicWebParser.NUMBER)
            self.state = 228
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==108:
                self.state = 227
                self.match(ArabicWebParser.UNIT)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class KeywordValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INHERIT(self):
            return self.getToken(ArabicWebParser.INHERIT, 0)

        def INITIAL(self):
            return self.getToken(ArabicWebParser.INITIAL, 0)

        def UNSET(self):
            return self.getToken(ArabicWebParser.UNSET, 0)

        def NONE(self):
            return self.getToken(ArabicWebParser.NONE, 0)

        def AUTO(self):
            return self.getToken(ArabicWebParser.AUTO, 0)

        def CENTER(self):
            return self.getToken(ArabicWebParser.CENTER, 0)

        def SOLID(self):
            return self.getToken(ArabicWebParser.SOLID, 0)

        def DASHED(self):
            return self.getToken(ArabicWebParser.DASHED, 0)

        def DOTTED(self):
            return self.getToken(ArabicWebParser.DOTTED, 0)

        def DOUBLE(self):
            return self.getToken(ArabicWebParser.DOUBLE, 0)

        def KW_HIDDEN(self):
            return self.getToken(ArabicWebParser.KW_HIDDEN, 0)

        def BLOCK(self):
            return self.getToken(ArabicWebParser.BLOCK, 0)

        def INLINE(self):
            return self.getToken(ArabicWebParser.INLINE, 0)

        def FLEX_VALUE(self):
            return self.getToken(ArabicWebParser.FLEX_VALUE, 0)

        def ABSOLUTE(self):
            return self.getToken(ArabicWebParser.ABSOLUTE, 0)

        def RELATIVE(self):
            return self.getToken(ArabicWebParser.RELATIVE, 0)

        def FIXED(self):
            return self.getToken(ArabicWebParser.FIXED, 0)

        def STICKY(self):
            return self.getToken(ArabicWebParser.STICKY, 0)

        def ROW(self):
            return self.getToken(ArabicWebParser.ROW, 0)

        def COLUMN(self):
            return self.getToken(ArabicWebParser.COLUMN, 0)

        def WRAP(self):
            return self.getToken(ArabicWebParser.WRAP, 0)

        def POINTER(self):
            return self.getToken(ArabicWebParser.POINTER, 0)

        def BOLD(self):
            return self.getToken(ArabicWebParser.BOLD, 0)

        def ITALIC(self):
            return self.getToken(ArabicWebParser.ITALIC, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_keywordValue

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterKeywordValue" ):
                listener.enterKeywordValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitKeywordValue" ):
                listener.exitKeywordValue(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitKeywordValue" ):
                return visitor.visitKeywordValue(self)
            else:
                return visitor.visitChildren(self)




    def keywordValue(self):

        localctx = ArabicWebParser.KeywordValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_keywordValue)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 230
            _la = self._input.LA(1)
            if not(((((_la - 83)) & ~0x3f) == 0 and ((1 << (_la - 83)) & 16777215) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionCallContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def functionName(self):
            return self.getTypedRuleContext(ArabicWebParser.FunctionNameContext,0)


        def LPAREN(self):
            return self.getToken(ArabicWebParser.LPAREN, 0)

        def arguments(self):
            return self.getTypedRuleContext(ArabicWebParser.ArgumentsContext,0)


        def RPAREN(self):
            return self.getToken(ArabicWebParser.RPAREN, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_functionCall

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionCall" ):
                listener.enterFunctionCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionCall" ):
                listener.exitFunctionCall(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionCall" ):
                return visitor.visitFunctionCall(self)
            else:
                return visitor.visitChildren(self)




    def functionCall(self):

        localctx = ArabicWebParser.FunctionCallContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_functionCall)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 232
            self.functionName()
            self.state = 233
            self.match(ArabicWebParser.LPAREN)
            self.state = 234
            self.arguments()
            self.state = 235
            self.match(ArabicWebParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def URL_FUNC(self):
            return self.getToken(ArabicWebParser.URL_FUNC, 0)

        def RGB_FUNC(self):
            return self.getToken(ArabicWebParser.RGB_FUNC, 0)

        def RGBA_FUNC(self):
            return self.getToken(ArabicWebParser.RGBA_FUNC, 0)

        def CALC_FUNC(self):
            return self.getToken(ArabicWebParser.CALC_FUNC, 0)

        def VAR_FUNC(self):
            return self.getToken(ArabicWebParser.VAR_FUNC, 0)

        def ROTATE_FUNC(self):
            return self.getToken(ArabicWebParser.ROTATE_FUNC, 0)

        def SCALE_FUNC(self):
            return self.getToken(ArabicWebParser.SCALE_FUNC, 0)

        def BLUR_FUNC(self):
            return self.getToken(ArabicWebParser.BLUR_FUNC, 0)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_functionName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionName" ):
                listener.enterFunctionName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionName" ):
                listener.exitFunctionName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionName" ):
                return visitor.visitFunctionName(self)
            else:
                return visitor.visitChildren(self)




    def functionName(self):

        localctx = ArabicWebParser.FunctionNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_functionName)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 237
            _la = self._input.LA(1)
            if not(((((_la - 113)) & ~0x3f) == 0 and ((1 << (_la - 113)) & 255) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgumentsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArabicWebParser.ExprContext)
            else:
                return self.getTypedRuleContext(ArabicWebParser.ExprContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(ArabicWebParser.COMMA)
            else:
                return self.getToken(ArabicWebParser.COMMA, i)

        def getRuleIndex(self):
            return ArabicWebParser.RULE_arguments

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArguments" ):
                listener.enterArguments(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArguments" ):
                listener.exitArguments(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArguments" ):
                return visitor.visitArguments(self)
            else:
                return visitor.visitChildren(self)




    def arguments(self):

        localctx = ArabicWebParser.ArgumentsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_arguments)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 239
            self.expr()
            self.state = 246
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while ((((_la - 83)) & ~0x3f) == 0 and ((1 << (_la - 83)) & 35459199664127) != 0):
                self.state = 241
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==128:
                    self.state = 240
                    self.match(ArabicWebParser.COMMA)


                self.state = 243
                self.expr()
                self.state = 248
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





