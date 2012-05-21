#!/bin/bash -vx
for file in *.{WAV,wav} ; do sox "$file" -c 1 "new$file" ; mv "new$file" "$file" ; done
