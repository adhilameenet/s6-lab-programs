#!/bin/bash

echo -n "Enter a string: "
read str

char_count=${#str}
word_count=( $str )
word_count=${#word_count[@]}

echo "Number of characters: $char_count"
echo "Number of words: $word_count"
