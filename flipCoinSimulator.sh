#!/bin/bash 

echo "!!!!...Coin Simulator...!!!!"

Heads=0
Tails=0
rand=$(( (RANDOM % 2 ) + 1 ))
if [ $rand -eq 1 ]
then
echo "!!...Heads...!!"
((Heads++));
else
echo "!!..Tails...!!"
((Tails++));
fi
