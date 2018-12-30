#/usr/bin/bash
    kdialog --title "Intro datos" --inputbox "¿Cual es tu nombre? " >> file.txt
   # kdialog --password "Introdusca codigo de acceso:" >> file.txt
    if [ $? = 0 ]; then
            echo " OK"
	kdialog --textbox file.txt  800 450
    else
            echo "Cancel"
    fi
