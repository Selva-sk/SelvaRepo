#!/bin/bash -x

echo "Creating and moving files to Original & Updated folders"
mkdir original updated | echo Original file>Original-file.sh | echo Updated file>Updated-file.sh | mv Original-file.sh original/ | mv Updated-file.sh updated/
echo "Comparing folders"
diff original/ updated/
echo "Creating Backup for Original folder"
cp -r original/ original-backup/
echo "Comparing Updated and O-Backup"
diff -q original-backup/ updated
