#!/bin/bash

if [[ `pwd` == */bin ]]
then
    cd ..
fi

./gradlew clean assemble && git add . && git commit -m "auto-deploy" && git push

echo ""
echo "Done ✅"
echo ""
open "https://github.com/seepick/wiki/actions"
open "https://seepick.github.io/wiki/"

exit 0
