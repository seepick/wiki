#!/bin/bash

./gradlew clean assemble && git add . && git commit -m "auto-deploy" && git push

echo ""
echo "Done ✅"
echo "https://github.com/seepick/wiki/actions"
echo "https://seepick.github.io/wiki/"
