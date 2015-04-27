DESCRIPTION = "Package group for cisco open source software"
LICENSE = "MIT"

PR = ".2"

inherit packagegroup

PACKAGES = "packagegroup-cisco-packages"

RDEPENDS_packagegroup-cisco-packages = " \
   libhls       \
   gst1.0-hls   \
   gst-dmp      \
   cgmi         \
   gst-plugins-base         \
   gst-plugins-good         \
   "

# vim: syntax=bitbake
#
