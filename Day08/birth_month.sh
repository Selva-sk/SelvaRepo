#!/bin/bash
echo "Program to search birthday of user...!!!"
declare -A Month
declare -A Year
for((i=1;i<=50;i++))
do
random1=$(((RANDOM%12)+1))
case $random1 in
	1)random2=$((RANDOM%2))
	  if [ $random2 -eq 0 ]
	   then
		Month[$i]=$random1
		Year[$i]="92"
		else
		Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
		;;
 2)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  3)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  4)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  5)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  6)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  7)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  8)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  9)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  10)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  11)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;
  12)random2=$((RANDOM%2))
     if [ $random2 -eq 0 ]
      then
      Month[$i]=$random1
      Year[$i]="92"
      else
      Month[$i]=$random1
      Year[$i]="93"
      fi
echo "User $i : ${Month[$i]} / ${Year[$i]}"
      ;;

	*)echo "Not a valid month" ;;
esac
done

read -p "Enter a month(m) to search :" n

for((j=1;j<=50;j++))
do
if [ ${Month[$j]} -eq $n ]
then
echo "User id : $j Birthday : ${Month[$j]} / ${Year[$j]} "
fi
done
