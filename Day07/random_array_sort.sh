#!/bin/bash 

echo "Program to generate 10 random 3 digit nos and find 2nd largest&2nd smallest...!!!!"
for((i=0; i<10; i++))
do
	random[$i]=${RANDOM:0:3}
done
	echo "Values in Array:" ${random[@]}

secondLargest=$(printf "%s\n" "${random[@]}" | sort -n | tail -2 | head -1)

echo "Second Largest value:" $secondLargest

secondSmallest=$(printf "%s\n" "${random[@]}" | sort -n | head -2 | tail -1)

echo "Smallest Smallest value:" $secondSmallest
