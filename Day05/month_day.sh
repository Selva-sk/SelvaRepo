#!/bin/bash -x

read -p "Enter the day(dd):" day
read -p "Enter the month(mm):" month

echo $day $month

if [ $month -eq 03 -o $month -eq 05 ]
then
if [ $day -ge 20 -a $day -le 31 ]
then
echo "TRUE"
else 
echo "FALSE"
fi
else
if [ $month -eq 04 -o $month -eq 06 ]
then
if [ $day -ge 20 -a $day -le 30 ]
then
echo "TRUE"
else
echo "FALSE"
fi
else
echo "FALSE"
fi
fi

