#!/bin/bash

echo -n "Enter a Number : "
read num

if [ $num -eq 0 ] 
then
    echo "The Number is Zero"
elif [ $num -gt 0 ] 
then
    echo "The Number is Positive"
else 
    echo "The Number is Negative"
fi

