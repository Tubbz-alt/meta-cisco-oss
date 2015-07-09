DESCRIPTION = "Package group for cisco open source software"
LICENSE = "MIT"

PR = "1"

inherit packagegroup

PACKAGES = "packagegroup-cisco-packages"

RDEPENDS_packagegroup-cisco-packages = " \
   gst-dmp      \
   cgmi         \
   packagegroup-cisco-required-packages \
   "
#
# I am removing libhls and gst1.0-hls from the build
# until cisco officially open sources the source code.
# I will however leave the receipes.
#

# vim: syntax=bitbake
#
