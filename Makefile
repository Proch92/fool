all: fooltarget svmtarget

fooltarget:
	java -jar /home/proch/antlr/antlr-4.1-complete.jar src/FOOL.g

svmtarget:
	java -jar /home/proch/antlr/antlr-4.1-complete.jar src/SVM.g

git:
	git add **/*.java **/*.g Makefile README.md
	git commit -m "commit"
	git push origin master