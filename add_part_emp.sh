#!/bin/bash -x

full_time_hour=9
part_time_hour=8
wage_per_hour=20
days=30
type=$((RANDOM%2))

case $type in
	1) echo "Full Time Employee"
      wage=$(($full_time_hour * $wage_per_hour))
      echo "Daily Wage :" $wage
		monthly_wage=$(($wage * $days))
      echo "Monthly wage :" $monthly_wage
		;;
	0) echo "Part Time Employee"
      wage=$(($part_time_hour * $wage_per_hour))
      echo "Daily Wage :" $wage
		monthly_wage=$(($wage * $days))
      echo "Monthly wage :" $monthly_wage
      ;;
	*) echo "**Invalid**"
		;;
esac
