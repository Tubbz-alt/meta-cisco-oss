DESCRIPTION = "Package group for cisco open source software"
LICENSE = "MIT"

PR = "1"

inherit packagegroup

PACKAGES = "packagegroup-cisco-packages"

RDEPENDS_packagegroup-cisco-packages = " \
   gst-dmp      \
   cgmi         \
   libhls       \
   gst1.0-hls   \
   packagegroup-cisco-required-packages \
   "

# vim: syntax=bitbake
#
