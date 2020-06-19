#!/bin/bash

echo "!!..Flip Coin Combination..!!"
read -p "Enter number of times to flip :" no
declare -A Count;

Heads=0
Tails=0
i=1

for((i=1; i<=no; i++))
do
			rand=$(( (RANDOM % 2 ) + 1 ))
	if [ $rand -eq 1 ]
   then
			((Heads++));
			Count[$i]="Head"
	else
			((Tails++));
			Count[$i]="Tail"
	fi
done
			echo "Count : Heads : $Heads Tails : $Tails"
			echo "Dictionary elements:"


for((i=1; i<=no; i++))
do
			echo "Trial $i :" ${Count[$i]}
done

echo "Heads Singlet Percentage :"
awk "BEGIN {print (($Heads/$no))}"
echo "Tails Singlet Percentage :"
awk "BEGIN {print (($Tails/$no))}"
