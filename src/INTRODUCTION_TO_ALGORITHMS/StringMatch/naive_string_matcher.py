# python naive_string_matcher.py 0000100001010001 0001

import sys

def naive_string_matcher(text, pattern):
    text_size = len(text)
    pattern_size = len(pattern)
    for start_index in range(text_size - pattern_size + 1):
        print(str(start_index) + " Step")
        print("Pattern : " + str(pattern[0 : pattern_size]))
        print("Text : " + str(text[start_index : start_index + pattern_size]))
        if pattern[0:pattern_size] == text[start_index : start_index + pattern_size]:
            print("============== Matching ==============")

if __name__ == "__main__":
    if len(sys.argv) == 1:
        print("Give Text & Pattern :D")
    else:
        naive_string_matcher(sys.argv[1], sys.argv[2])
