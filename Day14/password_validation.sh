#!/bin/bash -x
shopt -s extglob

read -p "Enter your password: " pass
#matching password

pattern="([\!\@\#\$\%]@)([0-9A-Z]+)([a-z]*)"
pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})"
pattern="^([a-ZA-Z0-9\@]+){8,}$"
pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,10}$"
pattern="^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9@!#]*)$"
pattern=""

if [[ $pass =~ $pattern ]]
then
   echo "Valid Password"
else
   echo "Invalid Password"
fi

