#!/bin/bash

echo "Program to find second largest & smallest element in the array using functions..!!!"
read -p "Enter no of elements in the array:" size

if [ $size -lt 2 ]
then
	echo "Invalid input..Give atleast 2 elements"
else
for((z=0,y=0;z<size;z++))
do
	read -p "Enter value $y :" value
	Array[$y]=$value
	((y++))
done
fi

first=${Array[0]}
second=${Array[1]}


function secSmall(){
for((i=0;i<size;i++))
do
if [ ${Array[$i]} -lt $first ]
then
	second=$first
	first=${Array[$i]}
elif [ ${Array[$i]} -lt $second -a ${Array[$i]} -ne $first ]
then
	second=${Array[$i]}
fi
done

	echo "Values stored in Array:" ${Array[@]}
if [ $second -eq $first ]
then
	echo "No Second smallest element found:"
else
	echo " Second smallest element is:" $second
fi
}

function secLarge(){
for((i=0;i<size;i++))
do
if [ ${Array[$i]} -gt $first ]
then
	second=$first
	first=${Array[$i]}
elif [ ${Array[$i]} -gt $second -a ${Array[$i]} -ne $first ]
then
	second=${Array[$i]}
fi
done

	echo "Values stored in Array:" ${Array[@]}
if [ $second -eq $first ]
then
	echo "No Second largest element found:"
else
	echo " Second largest element is:" $second
fi
}


secLarge
secSmall
