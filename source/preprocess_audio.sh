#!/bin/bash

for file in ../audio/*; do
  sox "$file" -c 1 "$file.sox"
done