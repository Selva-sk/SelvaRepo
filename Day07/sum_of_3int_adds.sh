#!/bin/bash 

echo "Program to find number of Triplets in the array...!!!"

found=0
read -p "Enter no of elements in Array : " n

for((z=1,y=0;z<=n;z++))
do
			echo "Enter value $z :"
			read value
			digits[$y]=$value
			((y++))
done
	echo "Values stored in array:" ${digits[@]}
	echo "Finding Triplets....."

for((i=0;i<n-2;i++))
do
for((j=i+1;j<n-1;j++))
do
for((k=j+1;k<n;k++))
do
if [ `expr ${digits[$i]} + ${digits[$j]} + ${digits[$k]}` -eq 0 ]
then
			found=1
			((count++))
			echo "Triplet $count found :" ${digits[$i]} ${digits[$j]} ${digits[$k]} 
fi
done
done
done

if [ $found -eq 0 ]
then
			echo "Triplets not found"
fi
