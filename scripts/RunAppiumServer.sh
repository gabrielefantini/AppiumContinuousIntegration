#!/bin/bash
set -ex
npm install -g appium
appium -v
appium --session-override &>/dev/null &