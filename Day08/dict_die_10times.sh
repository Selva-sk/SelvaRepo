#!/bin/bash
echo "Dice is rolling...."
declare -A Count
One=0
Two=0
Three=0
Four=0
Five=0
Six=0
max=0
i=1
while [ $max -eq 0 ]
do
number=$(((RANDOM%6)+1))
echo "Roll $i :" $number 
((i++))
case $number in

		1) ((One++))
			Count[One]=$One
			if [ $One -eq 10 ]
			then
			echo "$number has reached $One times"
			max=1
			fi			
			;;

		2) ((Two++))
 			Count[Two]=$Two
         if [ $Two -eq 10 ]
         then
         echo "$number has reached $Two times"
         max=1
         fi
         ;;

		3) ((Three++))
			Count[Three]=$Three
         if [ $Three -eq 10 ]
         then
         echo "$number has reached $Three times"
         max=1
         fi
         ;;

		4) ((Four++))
			Count[Four]=$Four
         if [ $Four -eq 10 ]
         then
         echo "$number has reached $Four times"
         max=1
         fi
         ;;

		5) ((Five++))
			Count[Five]=$Five
         if [ $Five -eq 10 ]
         then
         echo "$number has reached $Five times"
         max=1
         fi
         ;;

		6) ((Six++))
			Count[Six]=$Six
         if [ $Six -eq 10 ]
         then
         echo "$number has reached $Six times"
         max=1
         fi
         ;;

		*)"Number is not bw 1 to 6"
esac
done

echo "Number 1 Count:" ${Count[One]}
echo "Number 2 Count:" ${Count[Two]}
echo "Number 3 Count:" ${Count[Three]}
echo "Number 4 Count:" ${Count[Four]}
echo "Number 5 Count:" ${Count[Five]}
echo "Number 6 Count:" ${Count[Six]}
