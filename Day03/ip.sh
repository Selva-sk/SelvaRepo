#!/bin/bash

echo Displaying Last 10 unique Ip addresses with count:
echo   Count   IP Address
cat access.log |awk '{print $NF}' | sort | uniq -c | tail

