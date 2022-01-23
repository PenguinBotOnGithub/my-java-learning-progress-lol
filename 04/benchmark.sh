#!/bin/bash

echo Bash and Gawk required
echo " "
echo "And also apparently this script doesn't show the output of the end result, so this speeds things up a LOT"
sleep 2

if [ -x /bin/bash ] 
then
	echo "Compiling.."
	echo " "
	echo "Java:"
	JAVACOMPILETIME="$(time javac main.java)"
	echo " "
	echo "C:"
	CCOMPILETIME="$(time gcc main.c -o comparison)"
	echo " "
	echo "Testing.."
	echo " "
	echo "Java:"
	JAVATIME="$(time java main)"
	echo " "
	echo "C:"
	CTIME="$(time ./comparison)"
fi
