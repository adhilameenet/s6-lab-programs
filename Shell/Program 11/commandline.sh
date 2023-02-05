#!/bin/bash

sum=0
if [ $# -eq 0 ] 
then
  echo "Please Provide Some Numbers"
  exit 0
fi

for i in "$@"
do
  sum=$(( sum + i ))
done

avg=$(( sum / $# ))

echo "The sum of the numbers is: $sum"
echo "The average of the numbers is: $avg"
