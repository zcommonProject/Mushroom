#! /bin/bash
# process-monitor.sh
process=$1
pid=$(ps -ef | grep $process | grep '/bin/java' | grep -v grep | awk '{print $2}')
echo $pid
