package ass1;

#!/bin/bash

# Define variables
java_class="fileanalysis"
directory_path="/home/raushan/Documents/AOOPS"
stopwords=("the" "and" "is" "in" "it" "of" "to" "a" "this" "with" "for" "on" "at" "an" "by" "as" "that" "which" "not" "are" "you" "we" "can" "be" "from" "or" "with" "have" "has" "was" "your" "his" "her" "their" "its" "they" "them")
# Compile Java program
javac $java_class.java

# Run Java program
java $java_class $directory_path "${stopwords[@]}"

#remove compiled Java class
rm $java_class.class