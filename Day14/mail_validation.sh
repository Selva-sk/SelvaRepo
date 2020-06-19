#!/bin/bash 
echo "User mail Validation..!!!!"

read -p "Enter your mail-ID to validate : " mail
#matching mail id

pattern="^([a-z])+[0-9]*[._+-]?[a-zA-Z0-9]+([@]{1})([a-z0-9]{1,})([.]{1})([a-z]{3,})([.]*)([a-z]{2,})*$"

if [[ $mail =~ $pattern ]]
then
   echo "Valid mail"
else
   echo "Invalid mail"
fi

echo "..END.."
