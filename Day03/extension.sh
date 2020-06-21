#!/bin/bash -x

for file in $(ls)
do
ext = ${file##*\.}
case $ext in 
	 java) echo "$file : JAVA file";;
	 txt) echo "$file : Text file";;
	 *) echo "$file not processed";;
esac
done
