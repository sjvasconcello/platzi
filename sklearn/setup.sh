#!/bin/bash

# Variables
VERSION="0.0.1"
CYAN="\e[36m"
GREEN="\e[32m"
YELLOW="\e[33m"
ENDCOLOR="\e[0m"
folders=("data" "data/raw" "data/tmp" "data/clean" "figures" "notebooks" "code")
env_folder="env"

echo -e "${CYAN}> sjvasconcello setup python proyect v.$VERSION <${ENDCOLOR}"

sleep 1

# Contar el número de carpetas que ya existen
folder_count=0
for folder in "${folders[@]}"; do
    if [ -d "$folders" ]; then
        folder_count=$((folder_count + 1))
    fi
done

if [ "$folder_count" -eq 7 ]; then
    echo -e "${YELLOW}> All the folders exists${ENDCOLOR}"
else
    for folder in "${folders[@]}"; do
        if [ ! -d "$folder" ]; then
            mkdir "$folder"
            echo -e "${GREEN}>> The folder '$folder' was created.${ENDCOLOR}"
        fi
    done
fi

# Check if the "env" folder does not exist
if [ ! -d "$env_folder" ]; then
    # Execute the command to create the virtual environment
    python3 -m venv "$env_folder"
    echo -e "${GREEN}> Virtual environment created in the folder '$env_folder'.${ENDCOLOR}"
else
    echo -e "${YELLOW}> The folder '$env_folder' already exists. No new virtual environment was created.${ENDCOLOR}"
fi

if [ -e "requirements.txt" ]; then
    echo -e "${YELLOW}> requirements.txt was existed ${ENDCOLOR}"
else
    touch requirements.txt
    echo -e "${GREEN}> requirements.txt was created ${ENDCOLOR}"
fi



