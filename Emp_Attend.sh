#!/bin/bash -x

status=$((RANDOM%2))

if [ $status -eq 1 ]
then
echo "Present"
else
echo "Absent"
fi
