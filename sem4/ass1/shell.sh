# Shell Scripting

# sleep 5 #This will make a delay of 10 seconds.
# w1=Hello
# w2="kfk"
# # echo $w1 $w2
# echo $w1
# echo Nagmani



# start=$(date +%s)
# # start=$(date +%s%3N), or 6N 
# var=Hello
# name=Nagmani
# sleep 5
# echo $var $name
# end=$(date +%s)
# echo "Start Time: $((start)) seconds"
# echo "End Time: $((end)) seconds"
# echo "Time required is: $((end - start)) seconds"
# echo $(date)



# m=2
# n=2
# if [ $n -eq $m ]
# then
# echo "same"
# else
# echo "diff"
# fi



# if [ "kkns" = "kksd" ]
# # if test "kkns" = "kkns"
# then
# echo "same"
# else
# echo "diff"
# fi



# a = 5
# while [ $a -lt 10 ]
# do
# echo $a
# a=`expr $a + 1 `
# done


# for i in 1 2 3 4 5 6 7 8


max=10
for i in `seq 1 $max`
do
echo "$i"
done