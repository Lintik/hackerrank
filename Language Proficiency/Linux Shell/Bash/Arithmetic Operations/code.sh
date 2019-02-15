read x 
echo $x | bc -l | xargs printf "%.3f"