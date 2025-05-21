FROM gitpod/workspace-full

USER gitpod

RUN sudo apt update && sudo apt install -y unzip zip lib32z1 openjdk-17-jdk
RUN curl -s "https://dl.google.com/android/repository/commandlinetools-linux-9123335_latest.zip" -o sdk.zip \
 && unzip sdk.zip -d /home/gitpod/android-sdk \
 && yes | /home/gitpod/android-sdk/cmdline-tools/bin/sdkmanager --sdk_root=/home/gitpod/android-sdk "platform-tools" "platforms;android-33" "build-tools;33.0.0"

ENV ANDROID_HOME=/home/gitpod/android-sdk
ENV PATH=$PATH:$ANDROID_HOME/platform-tools
