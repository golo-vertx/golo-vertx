#!/bin/bash


for dir in /home/samutamm/Komentorivireeni/IST/golo-vertx/extractedClass/fatjar/*
do
    dir=${dir%*/}
    destination="destinationFolder"
    if [ ${dir##*/} != $destination ]; then
	if [ -d "$dir" ]; then
	    copy="cp -rT ${dir##*/}/ ${destination}/"
	    echo ${dir##*/}
	    eval $copy
	fi
    fi
done
