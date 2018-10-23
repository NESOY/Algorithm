import sys


def kmp_string_matcher(text:str, pattern:str):
    text_size = len(text)
    pattern_size = len(pattern)

    prefix_suffix_list = compute_prefix_func(pattern)
    q = 0 # 매칭된 문자 수

    for i in range(text_size):
        while (q > 0) & (pattern[q] != text[i]):
            q = prefix_suffix_list[q] # 매칭 안되는 다음 문자
        if pattern[q] == text[i]:
            q += 1 # 매칭되는 다음 문자
        if q == pattern_size: # 모든 P가 매칭되는가?
            print("Matching")
            q = prefix_suffix_list[q-1] # Find Next Matching


def compute_prefix_func(pattern:str):
    pattern_size = len(pattern)
    prefix_suffix_list = [0] * pattern_size
    prefix_suffix_list[0] = 0
    j = 0

    for i in range(1, pattern_size):
        while (j > 0) & (pattern[i] != pattern[j]):
            j = prefix_suffix_list[j-1]
        if pattern[i] == pattern[j]:
            j += 1
            prefix_suffix_list[i] = j
            print(prefix_suffix_list)

    return prefix_suffix_list



if __name__ == "__main__":
    if len(sys.argv) == 1:
       print("Give Text & Pattern :D")
    else:
        kmp_string_matcher(sys.argv[1], sys.argv[2])



