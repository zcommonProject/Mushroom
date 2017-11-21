#! /bin/sh  
process=$1
ID=`ps -ef| grep $process |awk '{print $2}'`  
for pid in $ID  
do  
    kill -9 $pid  
    echo " kill $process pid:$pid"  
done


