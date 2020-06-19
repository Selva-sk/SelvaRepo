#!/bin/bash
echo "!!..Flip Coin Combination..!!"
read -p "Enter number of times to flip :" no
declare -A Coin1;
declare -A Coin2;
HH=0
TT=0
HT=0
TH=0

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
echo "${Coin1[$i]} ${Coin2[$i]}"

if [[ ${Array1[$i]} == 'H' && ${Array2[$i]} == 'H' ]]
then
	((HH++))
else
if [[ ${Array1[$i]} == 'T' && ${Array2[$i]} == 'T' ]]
then
	((TT++))
fi
fi

if [[ ${Array1[$i]} == 'H' && ${Array2[$i]} == 'T' ]]
then
	((HT++))
else
if [[ ${Array1[$i]} == 'T' && ${Array2[$i]} == 'H' ]]
then
	((TH++))
fi
fi
done

echo "HH Doublet Percentage :"
awk "BEGIN {print (($HH/$no))}"
echo "TT Doublet Percentage :"
awk "BEGIN {print (($TT/$no))}"
echo "HT Doublet Percentage :"
awk "BEGIN {print (($HT/$no))}"
echo "TH Doublet Percentage :"
awk "BEGIN {print (($TH/$no))}"
