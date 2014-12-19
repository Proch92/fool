all: fooltarget svmtarget

fooltarget:
	java -jar /home/proch/antlr/antlr-4.1-complete.jar src/FOOL.g

svmtarget:
	java -jar /home/proch/antlr/antlr-4.1-complete.jar src/SVM.g



git: track commit push

track:
	git add **/*.java **/*.g Makefile README.md

commit:
	git commit -m "commit"

push:
	git push origin master