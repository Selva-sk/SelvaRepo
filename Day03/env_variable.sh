#!/bin/bash -x

for var in `env | grep USERSECRET`;
do 
	if[ $var=="dH34xJaa23" ];
	then 
		echo "PATH already exists...!!";
	else
		export USERSECRET ="dH34xJaa23"; 
	fi
done
