#!/bin/bash -x

read -p "Enter A value:" a
read -p "Enter B value:" b 
read -p "Enter C value:" c

Expression1=`expr $a + $b`
Expression1=`expr $Expression1 \* $c`
echo "Value of A+B*C is" $Expression1;

Expression2=`expr $c + $a`
Expression2=`expr $Expression2 / $b`
echo "Value of C+A/B is" $Expression2;

Expression3=`expr $a % $b`
Expression3=`expr $Expression3 + $c`
echo "Value of A%B+C is" $Expression3;

Expression4=`expr $a \* $b`
Expression4=`expr $Expression4 + $c`
echo "Value of A*B+C is" $Expression4;
