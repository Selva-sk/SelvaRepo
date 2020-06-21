#!/bin/bash -x

read -p "Enter a number between 0 to 6:" day
  case $day in
        0) echo -n "Sunday " ;;
        1) echo -n "Monday " ;;
        2) echo -n "Tuesday " ;;
        3) echo -n "Wednesday " ;;
        4) echo -n "Thursday " ;;
        5) echo -n "Friday " ;;
        6) echo -n "Saturday " ;;
    esac

