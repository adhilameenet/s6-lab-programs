#!/bin/bash

echo -n "Enter the limit: "
read limit
a=0
b=1
echo "The Fibonacci numbers are: "
echo -n "$a "

while [ $b -lt $limit ]
do
  echo -n "$b "
  c=$(( a + b ))
  a=$b
  b=$c
done

