#!/bin/bash -x

full_time_hour=9
part_time_hour=8
wage_per_hour=20

type=$((RANDOM%2))

if [ $type -eq 1 ]
	then
		echo "Full Time Employee"
		wage=$(($full_time_hour * $wage_per_hour))
		echo "Wage :" $wage
	else
		echo "Part Time Employee"
		wage=$(($part_time_hour * $wage_per_hour))
      echo "Wage :" $wage

fi
