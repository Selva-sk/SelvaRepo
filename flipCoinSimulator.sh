#!/bin/bash 

echo "!!!!...Coin Simulator...!!!!"

Heads=0
Tails=0

for((i=0; $Heads<21 || $Tails<21; i++))
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
	echo "Game Tied..Continuing again to reach minimum 2 differnce"
for((j=0; $(($Heads-$Tails))<2 && $(($Tails-$Heads))<2; j++ ))
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
if [ $Heads -gt $Tails ]
then
   echo "Heads won..."
else
   echo "Tails won..."
fi
echo "Final Count :-  Heads : $Heads  Tails : $Tails"
else
if [ $Heads -gt $Tails ]
then
	echo "Heads won..."
else 
	echo "Tails won..."
fi
fi
