#!/bin/bash -x

for file in `ls *.txt`;
do 
	echo "Files in the folder with Extension .txt:" echo $file; 
	foldername =`echo $file | awk -F. '{print $1}'`; 
	echo "Folders to create" $foldername ; 
if [ -d $foldername ];
then
	echo "Removing exising folders" 
	rm -R $foldername;
fi
	echo "Creating new folders" 
	mkdir $foldername; 

	echo "Moving file into folders" 
	cp $file $foldername; 
done

