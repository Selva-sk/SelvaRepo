#!/bin/bash -x

echo "Displaying process ID,Parent PID,Command,Memory&CPU utilization"

ps -e pid,ppid,cmd,%mem,%cpu | sort=%mem | head
