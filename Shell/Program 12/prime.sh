#!/bin/bash

echo -n "Enter a number: "
read num

if [ $num -le 1 ] 
then
  echo "Not a prime number"
  exit 0
fi

for ((i=2; i<=num-1; i++))
do
  if [ $((num%i)) -eq 0 ] 
  then
    echo "Not a prime number"
    exit 0
  fi
done

echo "Prime number"
