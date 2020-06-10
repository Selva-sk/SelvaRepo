#!/bin/bash 

echo "Program to find repeated digits between $1 - $2" 
current=$1
end=$2
count=0
echo "Traversing the numbers $1 - $2..........." 
if [ $1 -lt 10 ]
then
echo "Enter value<10"
else
for((i=current;i<end;i++))
do
	digit1=`echo $current | awk '{ printf("%s",substr($1,1,1));}'`
	digit2=`echo $current | awk '{ printf("%s",substr($1,2,1));}'`

if [ $digit1 -eq $digit2 ]
then
	digits[$count]=$current
	((count++))
fi
	((current++))
done
fi

echo "There are $count repeated digits from $start - $end : " ${digits[@]}
