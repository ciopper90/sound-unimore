#!/bin/bash

for file in *.{WAV,wav}; do 
    sox "$file" -c 1 "$file_new"
    mv "$file_new" "$file"
done
