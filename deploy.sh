#!/bin/bash

./gradlew clean assemble && git add . && git commit -m "auto-deploy" && git push

echo ""
echo "Done ✅"
echo "https://github.com/christophpickl/wiki/actions"
echo "https://christophpickl.github.io/wiki/"
