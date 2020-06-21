#!/bin/bash -x

for i in 1 2 3 4 5 
do
random1=$(( (RANDOM % 6 ) + 1 ));
echo $random1 ;
sum=$(( $sum + $random1 ));
done
echo "Sum of 5 Random no's: $sum"
