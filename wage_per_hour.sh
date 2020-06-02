#!/bin/bash -x

wage_per_hour=20
full_day_hour=8

daily_wage=$(($wage_per_hour * $full_day_hour))

echo "Employee Wage Per Day :" $daily_wage
