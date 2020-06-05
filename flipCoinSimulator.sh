#!/bin/bash 

echo "!!!!...Coin Simulator...!!!!"
read -p "Enter no of times to flip:" no

Heads=0
Tails=0

for((i=0; i<no; i++))
do
	rand=$(( (RANDOM % 2 ) + 1 ))
if [ $rand -eq 1 ]
then
	echo "!!...Heads...!!"
	((Heads++));
else
	echo "!!..Tails...!!"
	((Tails++));
fi
done

echo "Count :-  Heads : $Heads  Tails : $Tails"

if [ $Heads -eq $Tails ]
then
	echo "Game Tied.."
else
if [ $Heads -gt $Tails ]
then
	echo "Heads won..."
else 
	echo "Tails won..."
fi
fi
