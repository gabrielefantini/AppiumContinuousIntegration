# Automated Testing Software in a Continuous Integration pipeline
## Using Appium and GitHub Actions

This repository contains:
<ul>
  <li>A script to install and launch Appium server on GitHub Action machine under /scripts</li>
  <li>A set of tests written using the Java Client library for Appium under /src</li>
  <li>GitHub Action directives under .github/workflows</li>
</ul>

When a new push or a workflow_dispatch event is sent to the repository, a new machine with macos is
allocated on the GitHub servers. Then it tries to download an artifact containing an unsigned apk
of an application, generated from another repository. It launches the script that install and run Appium 
server, it gives the right privileges to gradlew and then in installs and creates an Android Emulator
using  reactivecircus/android-emulator-runner@v2. It executes all the test available and then sends
and email with the tests report.
