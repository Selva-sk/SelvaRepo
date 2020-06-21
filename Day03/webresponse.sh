#!/bin/bash -x

cat access.log | grep 05:50 | awk '{print $9,$10}'| sort | uniq
