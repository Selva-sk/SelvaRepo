#!/bin/bash -x

Attendance=$((RANDOM%2))

if [ $Attendance -eq 1 ]
then
echo "Present"
else
echo "Absent"
fi
