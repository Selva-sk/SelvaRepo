#!/bin/bash 

read -p "Enter a number b/w 0 to 9:" n
 
echo "Your number $n in words : "
for (( i=1; i<=1; i++ ))
do
   # get one digit at a time
   # use case control structure to find digit equivalent in words 
    case $n in
        0) echo -n "zero " ;;
        1) echo -n "one " ;;
        2) echo -n "two " ;;
        3) echo -n "three " ;;
        4) echo -n "four " ;;
        5) echo -n "five " ;;
        6) echo -n "six " ;;
        7) echo -n "seven " ;;
        8) echo -n "eight " ;;
        9) echo -n "nine " ;;
    esac	
done

