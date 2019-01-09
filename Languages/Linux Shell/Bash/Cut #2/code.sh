while read line; do
  echo "${line:1:1}${line:6:1}"
done