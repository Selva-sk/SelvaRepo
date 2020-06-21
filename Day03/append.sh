#!/bin/bash -x
var=`date +%D`
echo $var
ls *.log.1 | awk -F. '{ print $1 ,$var}'



