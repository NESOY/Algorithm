# python rabin_karp_string_matcher.py "ABCDEFG", "FGH", 17
import sys

def rabin_karp_string_matcher(text:str, pattern:str, prime:int):
    text_size = len(text)
    pattern_size = len(pattern)
    pattern_hash = 0
    text_hash = 0


    print("=============== PreProcessing ===================")
    for i in range(pattern_size):
        # ord -> ASCII code
        pattern_hash = (pattern_hash + ord(pattern[i])) % prime
        print("Pattern Hashing : " + str(pattern_hash))

        text_hash = (text_hash + ord(text[i])) % prime
        print("Text Hashing : " + str(text_hash))



    print("=============== PostProcessing ==================")
    for start_index in range(text_size - pattern_size + 1):
        print(str(start_index) + " Step")
        print("Pattern : " + str(pattern) + " : text : " + str(text[start_index : start_index + pattern_size]))
        print("Pattern Hash : " + str(pattern_hash) + " : text_hash : " + str(text_hash))
        if pattern_hash == text_hash:
            if pattern[0:pattern_size] == text[start_index : start_index + pattern_size]:
                print("============== Matching ==============")

        if start_index < text_size - pattern_size:
            # Horner's Method
            text_hash = ((text_hash - ord(text[start_index])) + ord(text[start_index + pattern_size])) % prime



if __name__ == "__main__":
    if len(sys.argv) == 1:
       print("Give Text & Pattern :D")
    else:
        rabin_karp_string_matcher(sys.argv[1], sys.argv[2], int(sys.argv[3]))



