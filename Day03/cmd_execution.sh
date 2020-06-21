#!/bin/bash -x

hello
if[ (echo $?) !=0 ];
then
echo "Command not executed"
fi
df -h
if[ (echo $?) ==0 ];
then
echo "Command executed"
fi
