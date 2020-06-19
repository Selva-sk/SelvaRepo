#!/bin/bash

echo "Name validation...."
read -p "Enter Firstname :" first

pattern="^[[:upper:]]{1}[[:lower:]]{2,}$"

if [[ $first =~ $pattern ]]
then
 echo "Valid Firstname.."
else
 echo "!!**Invalid**!!-Firstname should starts with CAPS"
fi

read -p "Enter Lastname :" last

if [[ $last =~ $pattern ]]; then echo "Valid Lastname"; else echo "!!**Invalid**!!-Lastname should starts with CAPS"; fi

echo "..END.."
