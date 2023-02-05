#!/bin/bash

echo -n "Enter first number: "
read num1

echo -n "Enter second number: "
read num2

echo -n "Enter operation (+, -, *, /): "
read op

if [ "$op" == "+" ] 
then
  result=$((num1 + num2))
  echo "Result: $result"
elif [ "$op" == "-" ] 
then
  result=$((num1 - num2))
  echo "Result: $result"
elif [ "$op" == "*" ] 
then
  result=$((num1 * num2))
  echo "Result: $result"
elif [ "$op" == "/" ] 
then
  result=$((num1 / num2))
  echo "Result: $result"
else
  echo "Invalid operator"
fi
