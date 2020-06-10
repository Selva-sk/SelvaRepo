#!/bin/bash -x

declare -A sounds

sounds[Dog]="bark"
sounds[Cow]="moow"

echo ${sounds[@]}
echo ${#sounds[@]}
echo ${sounds[Cow]}
