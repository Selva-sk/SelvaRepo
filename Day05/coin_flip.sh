#!/bin/bash -x

read -p no_of_times
echo "!!!.....Coin is Flipping.....!!!"
i=1
for i in 5
do
rand=$(( (RANDOM % 2 ) + 1 ))
if [ $rand -eq 1 ]
then
echo "!!...Heads...!!"
else
echo "!!..Tails...!!"
fi
done
