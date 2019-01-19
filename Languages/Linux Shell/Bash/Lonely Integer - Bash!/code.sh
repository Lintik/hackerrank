read
arr=($(cat))
arr=${arr[*]}
echo $((${arr// /^}))