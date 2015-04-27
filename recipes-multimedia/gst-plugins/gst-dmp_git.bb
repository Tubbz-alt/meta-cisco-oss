DESCRIPTION = "DMP gstreamer plugin"
#HOMEPAGE = ""
SECTION = "libs"
LICENSE = "BSD"
PR = "r1"
ACKAGE_ARCH = "${MACHINE_ARCH}"
AUTHOR = "Cable Labs  & Cisco Systems"
SRC_URI = "git://github.com/cisco/gst-plugin-dlnasrc.git;protocol=https;branch=master"

LIC_FILES_CHKSUM = "file://COPYING;md5=ee4f0de86785fcffb3e0c6ae1370f0bd"
SRCREV = "178a8a75aee2557809bb14f9dba5daa7ac50ca8f"
#FOR DEBUG
inherit autotools
#SRCREV = "${AUTOREV}"

PV = "1.0+git"
S = "${WORKDIR}/git"

DEPENDS = "gstreamer gst-plugins-base uriparser libsoup-2.4"

FILES_${PN} += "${libdir}/gstreamer-1.0/*.so"
FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-1.0/*.la ${libdir}/gstreamer-1.0/*.a"

EXTRA_OECONF="--with-gstreamer-api=1.0"

