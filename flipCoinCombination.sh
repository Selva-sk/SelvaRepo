#!/bin/bash
echo "!!..Flip Coin Combination..!!"
read -p "Enter number of times to flip :" no
declare -A Coin1;
declare -A Coin2;
declare -A Coin3;
HHH=0
TTT=0
HHT=0
HTH=0
THH=0
TTH=0
THT=0
HTT=0

for((i=1; $i<=no; i++))
do
	rand=$(( (RANDOM % 2 ) + 1 ))
if [ $rand -eq 1 ]
then
	Coin1[$i]="H"
	Array1[$i]="H"
else
	Coin1[$i]="T"
	Array1[$i]="T"
fi
	rand=$(( (RANDOM % 2 ) + 1 ))
if [ $rand -eq 1 ]
then
	Coin2[$i]="H"
	Array2[$i]="H"
else
	Coin2[$i]="T"
	Array2[$i]="T"
fi
   rand=$(( (RANDOM % 2 ) + 1 ))
if [ $rand -eq 1 ]
then
   Coin3[$i]="H"
   Array3[$i]="H"
else
   Coin3[$i]="T"
   Array3[$i]="T"
fi

echo "${Coin1[$i]} ${Coin2[$i]} ${Coin3[$i]}"

if [[ ${Array1[$i]} == 'H' && ${Array2[$i]} == 'H' && ${Array3[$i]} == 'H' ]]
then
	((HHH++))
else
if [[ ${Array1[$i]} == 'T' && ${Array2[$i]} == 'T' && ${Array3[$i]} == 'T' ]]
then
	((TTT++))
fi
fi

if [[ ${Array1[$i]} == 'H' && ${Array2[$i]} == 'H' && ${Array3[$i]} == 'T' ]]
then
	((HHT++))
fi
if [[ ${Array1[$i]} == 'H' && ${Array2[$i]} == 'T' && ${Array3[$i]} == 'H' ]]
then
   ((HTH++))
fi
if [[ ${Array1[$i]} == 'T' && ${Array2[$i]} == 'H' && ${Array3[$i]} == 'H' ]]
then
   ((THH++))
fi
if [[ ${Array1[$i]} == 'T' && ${Array2[$i]} == 'T' && ${Array3[$i]} == 'H' ]]
then
   ((TTH++))
fi
if [[ ${Array1[$i]} == 'T' && ${Array2[$i]} == 'H' && ${Array3[$i]} == 'T' ]]
then
   ((THT++))
fi
if [[ ${Array1[$i]} == 'H' && ${Array2[$i]} == 'T' && ${Array3[$i]} == 'T' ]]
then
   ((HTT++))
fi
done

echo "HHH Triplet Percentage :"
awk "BEGIN {print (($HHH/$no))}"
echo "TTT Triplet Percentage :"
awk "BEGIN {print (($TTT/$no))}"
echo "HHT Triplet Percentage :"
awk "BEGIN {print (($HHT/$no))}"
echo "HTH Triplet Percentage :"
awk "BEGIN {print (($HTH/$no))}"
echo "THH Triplet Percentage :"
awk "BEGIN {print (($THH/$no))}"
echo "TTH Triplet Percentage :"
awk "BEGIN {print (($TTH/$no))}"
echo "THT Triplet Percentage :"
awk "BEGIN {print (($THT/$no))}"
echo "HTT Triplet Percentage :"
awk "BEGIN {print (($HTT/$no))}"
