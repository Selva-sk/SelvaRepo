#!/bin/bash -x

echo "script to find prime factors of a given number..!!!!"
read -p "Enter a number:" input

if [ $input -lt 1 ];then
	echo "Enter valid input..!!!"
	exit 1
fi
# find factors and prime
count=0
flag=0

for ((i=2;i<$input;));do
  if [ `expr $input % $i` -eq 0 ];then
      			factor=$i
  	for ((j=2;j<=`expr $factor / 2`;j++));do
      			flag=0
      		if [ `expr $factor % $j` -eq 0 ];then
      			flag=1
      			break
      		fi
  	done
  if [ $flag -eq 0 ];then
  			factors[$i]=$"$factor"
  			count=1
  fi
  fi
  i=`expr $i + 1`
done

  if [ $count -eq 0 ];then
			  echo "Prime factors of $input : 1 and" $input
  fi

			  echo "Prime factors of $input :" ${factors[@]}
