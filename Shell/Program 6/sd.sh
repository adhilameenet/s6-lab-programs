#!/bin/bash

echo -n "Enter three integers with space between : "
read a b c
sum=$(( a+b+c ))
mean=$(( sum/3 ))
aa=$((($a-$mean)*($a-$mean)))
bb=$((($b-$mean)*($b-$mean)))
cc=$((($c-$mean)*($c-$mean)))
sd=$(echo "sqrt(($aa+$bb+$cc)/3)" | bc)
echo "Sum = $sum"
echo "Mean = $mean"
echo "SD = $sd"