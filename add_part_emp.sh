#!/bin/bash 

full_time_hour=9
part_time_hour=8
wage_per_hour=20
total_hours=0
total_days=0
i=0

function getHours(){
echo "Total Hours Worked:" $total_hours
}

type=$((RANDOM%2))

case $type in
	1) echo "Full Time Employee"
      while [[ $total_hours -lt 100 && $total_days -lt 20 ]]
		do
      wage=$(($full_time_hour * $wage_per_hour))
		Daily_wage[$i]=$wage
		echo "Day $i Wage :" $wage
		monthly_wage=$(($monthly_wage+$wage))
		total_hours=$((total_hours+9))
		((total_days++))
		((i++))
      done
		total_hours=$(($total_hours-9))
		getHours
      echo "Monthly wage :" $monthly_wage
		;;
	0) echo "Part Time Employee"
      while [[ $total_hours -lt 100 && $total_days -lt 20 ]]
      do
      wage=$(($part_time_hour * $wage_per_hour))
		Daily_wage[$i]=$wage
      echo "Day $i Wage :" $wage
		monthly_wage=$(($monthly_wage+$wage))
      total_hours=$((total_hours+8))
      ((total_days++))
      ((i++))
      done
		total_hours=$(($total_hours-8))
		getHours
      echo "Monthly Wage :" $monthly_wage
      ;;
	*) echo "**Invalid**"
		;;

esac
