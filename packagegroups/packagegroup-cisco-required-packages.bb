DESCRIPTION = "Packages that some versions of RDK don't provide"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PR = "4"

PACKAGES = "packagegroup-cisco-required-packages"
RDEPENDS_packagegroup-cisco-required-packages = " \
   gstreamer1.0 \
    gstreamer1.0-meta-audio \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-video \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-bad-bz2 \
    gstreamer1.0-plugins-bad-audiovisualizers \
    gstreamer1.0-plugins-bad-camerabin2 \
    gstreamer1.0-plugins-bad-coloreffects \
    gstreamer1.0-plugins-bad-curl \
    gstreamer1.0-plugins-bad-fbdevsink \
    gstreamer1.0-plugins-bad-gaudieffects \
    gstreamer1.0-plugins-bad-mpegtsdemux \
    gstreamer1.0-plugins-bad-shm \
    gstreamer1.0-plugins-bad-smooth \
    gstreamer1.0-plugins-bad-videofiltersbad \
    gstreamer1.0-plugins-bad-videoparsersbad \
    gstreamer1.0-plugins-bad-y4mdec \
    gstreamer1.0-plugins-good-isomp4 \
    gstreamer1.0-plugins-good-autodetect \
    gstreamer1.0-plugins-good-audioparsers \
    gstreamer1.0-plugins-good-avi \
    gstreamer1.0-plugins-good-flv \
   "

#vim: syntax=bitbake

