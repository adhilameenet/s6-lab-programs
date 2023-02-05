#!/bin/bash

echo -n "Enter a Number :"
read num

if [ $((num % 2)) -eq 0 ] 
then
    echo "The number is Even"
else 
    echo "The number is Odd"
fi