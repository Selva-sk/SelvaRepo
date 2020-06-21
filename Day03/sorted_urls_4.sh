#!/bin/bash

cat access.log | grep 05:50 | awk '{print $11}' | uniq -c | tail -4
