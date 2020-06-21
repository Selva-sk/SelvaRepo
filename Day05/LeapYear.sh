#!/bin/bash -x

isleap="false"

read -p "Enter a year:" year 

if [ $(($year % 4)) -ne 0 ] ; then
  :
elif [ $(($year % 400)) -eq 0 ] ; then
   isleap="true"
elif [ $(($year % 100)) -eq 0 ] ; then
:
   else
   isleap="true"
fi



if [ "$isleap" == "true" ];
then
   echo "$year is leap year"
else
   echo "$year is NOT leap year"
fi
