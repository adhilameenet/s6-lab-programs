#!/bin/bash

echo -n "Enter a number: "
read num

if [ $num -eq 0 ]
then
  echo "The reverse of 0 is 0."
  exit 0
fi

reverse=""
while [ $num -gt 0 ]
do
    rem=$(( num % 10 ))
    num=$(( num / 10 ))
    reverse="$reverse$rem"
done

echo "The reverse of the number is: $reverse"