#!/bin/bash -x

random1=${RANDOM:0:3}
random2=${RANDOM:0:3}
random3=${RANDOM:0:3}
random4=${RANDOM:0:3}
random5=${RANDOM:0:3}

max=$random1;

for i in $random1 $random2 $random3 $random4 $random5
do
  if [[ "$i" > "$max" ]];
  then
    max="$i"
  fi
done

echo "Max value:" $max


min=$random1;

for i in $random1 $random2 $random3 $random4 $random5
do
  if [[ "$i" < "$min" ]];
  then
    min="$i"
  fi
done

echo "Min value:" $min
