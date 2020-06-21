#!/bin/bash -x
echo displaying last 4 frequently accessed URLS in sorted form:
cat access.log | awk '{print $7}' | sort | uniq -c | tail -4
