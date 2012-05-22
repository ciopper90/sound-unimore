#!/bin/bash

# NOTE:
# - dobbiamo fare in modo che tutti i file abbiano 
#   le stesse caratteristiche: (1 canale, 16bit, 11khz, 5sec di durata).
#   il formato dei file ottenuti deve essere:
#   classe_istanza_id
#   classe = classe di appartenza
#   istanza = registrazione di nicola sulla panda
#   id = id del frammento di 5 secondi estratto da quella registrazione

for file in ../audio/*; do
  sox "$file" -c 1 "$file.sox"
done