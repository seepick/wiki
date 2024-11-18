#!/bin/bash

./gradlew assemble && git add . && git commit -m "auto-deploy" && git push

echo ""
echo "Done ✅"
echo "https://christophpickl.github.io/wiki/"
