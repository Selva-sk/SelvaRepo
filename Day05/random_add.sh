#!/bin/bash -x 

echo "Dices are Rolling....."
random1=$(( RANDOM ))
echo "Dice 1: $random1 "
random2=$(( RANDOM ))
echo "Dice 2: $random2 "
Sum=$(( $random1 + $random2 ))

echo "Total Dice value: $Sum "



