#!/bin/bash -x
declare -A values;
echo "Enter 3 values :"
read -p "Enter value 1:" a
read -p "Enter value 2:" b
read -p "Enter value 3:" c

exp1=$(($b*$c))
exp1=$(($exp1+$a))
echo $exp1
values[1]=$exp1

exp2=$(($a*$b))
exp2=$(($exp2+$c))
echo $exp2
values[2]=$exp2

values[3]=`awk "BEGIN {printf (($c+$a/$b))}"`

values[4]=`awk "BEGIN {printf (($a%$b+$c))}"`

echo "Values are :" ${values[@]}

for((i=1;i<=4;i++))
do
Array[$i]=`echo ${values[$i]}`
done

echo "Array values :" ${Array[@]}

ascending=$(printf "%s\n" "${Array[@]}" | sort -n )
descending=$(printf "%s\n" "${Array[@]}" | sort -n -r )

echo "Ascending Order :" $ascending
echo "Descending Order :" $descending
