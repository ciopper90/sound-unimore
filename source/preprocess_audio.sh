#!/bin/bash

# NOTE:
# - dobbiamo fare in modo che tutti i file abbiano 
#   le stesse caratteristiche: (1 canale, 16bit, 11khz, 5sec di durata).
#   il formato dei file ottenuti deve essere: classe_istanza.
#   Se il file registrato è più lungo di 5 secondi, va spezzato.

for file in ../audio/*; do
  sox "$file" -c 1 "$file.sox"
done

