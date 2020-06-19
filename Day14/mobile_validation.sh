#!/bin/bash -x

read -p "Enter your Mobile number : " number
#matching mobile number

pattern="^[91]{2}[ ]{1}[0-9]{10}$"


if [[ $number =~ $pattern ]]
then
   echo "Valid mobile number"
else
   echo "Invalid mobile number"
fi
